package com.example.demo.repository;

import com.example.demo.dominio.Associado;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AssociadoRepository {
    private static String pastaContador = "src\\main\\resources\\";
    private static String arquivoContador = "contador.txt";
    private Integer contador = readIntFromFile();
    private static String pasta = "src\\main\\resources\\";
    private static String arquivo = "associado.txt";
    private static List<Associado> associados = readObjectFromFile();


    /**
     * Método cria o associado e adiciona ele na lista de associados
     * @param associado @{@link Associado}
     * @return @{@link Associado}
     */
    public Associado cadastrar(Associado associado) {
        contador += 1;
        associado.setId(contador);
        associados.add(associado);
        this.writeObjectToFile(associados);
        this.writeIntToFiles(contador);
        return associado;
    }

    /**
     * Método utilizado para escrever em um arquivo, além de transformar um objeto em formato JSON.
     * @param objeto @{@link Object}
     */
    public void writeObjectToFile(Object objeto) {
        try {
            File tempFile = new File(pasta + arquivo);
            Gson gson = new Gson();
            String jsonString = gson.toJson(objeto);
            FileUtils.writeStringToFile(tempFile, jsonString);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Método utilizado para ler o conteudo que foi salvo no arquivo. Além de transformar do formato string em objeto.
     * @return @{@link List<Associado>}
     */
    public static List<Associado> readObjectFromFile() {
        try {
            Path filePath = Paths.get(pasta + arquivo);
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            String string = String.join("", lines);
            Gson gson = new Gson();
            Associado[] stringToObject = gson.fromJson(string, Associado[].class);
            List<Associado> listaAssociado = new ArrayList<>();
            if (stringToObject != null) {
                listaAssociado = new ArrayList(Arrays.asList(stringToObject));
            }
            return listaAssociado;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *Método utilizado para escrever em um arquivo de texto.
     * @param contador @{@link Integer}
     */
    public void writeIntToFiles(Integer contador) {
        try {
            File tempFile = new File(pastaContador + arquivoContador);
            FileUtils.writeStringToFile(tempFile, contador.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método utilizado para ler o que foi escrito no arquivo em relação ao contador de associados.
     * @return @{@link Integer}
     */
    public static Integer readIntFromFile() {
        try {
            Path filePath = Paths.get(pastaContador + arquivoContador);
            String string = Files.readString(filePath, StandardCharsets.UTF_8);
            Integer contador = 0;
            if (!string.isEmpty()) {
                contador = Integer.valueOf(string);
            }
            return contador;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Através do id informado realiza a pesquisa desse associado na lista de associados.
     * @param id @{@link int}
     * @return @{@link Associado}
     */
    public Associado pesquisar(int id) {
        for (Associado associado : associados) {
            if (id == associado.getId()) {
                return associado;
            }
        }
        return null;
    }

}

