package com.example.demo.repository;

import com.example.demo.dominio.Pauta;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PautaRepository {

    private static String pasta = "src\\main\\resources\\";
    private static String arquivo = "pautas.txt";
    private static List<Pauta> pautas = readObjectFromFile();
    private static String pastaContador = "src\\main\\resources\\";
    private static String arquivoContador = "contadorPauta.txt";
    private Integer contadorPauta = readIntFromFile();

    /**
     * Método cria a pauta e adiciona ela na lista de pautas
     * @param pauta @{@link Pauta}
     * @return @{@link Pauta}
     */
    public Pauta cadastrar (Pauta pauta){
        contadorPauta+=1;
        pauta.setId(contadorPauta);
        pautas.add(pauta);
       this.salvarPauta();
        return pauta;
    }

    public void salvarPauta (){
        this.writePauta();
        this.writeIntToFiles(contadorPauta);
    }

    public Object writeObjectToFile(Object objeto) {
        try {
            File tempFile = new File(pasta+arquivo);
            Gson gson = new Gson();
            String jsonString = gson.toJson(objeto);
            if (jsonString != null){
            FileUtils.writeStringToFile(tempFile, jsonString);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Object writePauta() {
        return this.writeObjectToFile(pautas);
    }

    public static List<Pauta> readObjectFromFile() {
        try {
            Path filePath = Paths.get(pasta+arquivo);
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            String string = String.join("", lines);
            Gson gson = new Gson();
            Pauta[] stringToObject = gson.fromJson(string, Pauta[].class);
            List<Pauta> listaPauta = new ArrayList<>();
            if (stringToObject != null) {
                listaPauta = new ArrayList(Arrays.asList(stringToObject));
            }
            return listaPauta;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeIntToFiles(Integer contadorPauta) {
        try {
            File tempFile = new File(pastaContador + arquivoContador);
            FileUtils.writeStringToFile(tempFile, contadorPauta.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer readIntFromFile() {
        try {
            Path filePath = Paths.get(pastaContador + arquivoContador);
            String string = Files.readString(filePath, StandardCharsets.UTF_8);
            Integer contadorPauta = 0;
            if (!string.isEmpty()) {
                contadorPauta = Integer.valueOf(string);
            }
            return contadorPauta;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Pauta> listar () {return pautas;}

    /**
     * Através do id informado realiza a pesquisa dessa pauta na lista de pautas.
     * @param idPauta @{@link Pauta}
     * @return @{@link Pauta}
     */
    public Pauta pesquisar (int idPauta){
        for (Pauta pauta : pautas){
            if ( idPauta == pauta.getId()){
                return pauta;
            }
        }
        return null;
    }
}
