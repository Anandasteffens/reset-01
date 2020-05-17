package com.example.demo.repository;
import com.example.demo.dominio.Associado;
import java.util.ArrayList;
import java.util.List;

public class AssociadoRepository {

    private static int contador = +1;
    private static List<Associado> associados = new ArrayList<>();

    /**
     * Método cria o associado e adiciona ele na lista de associados
     * @param associado @{@link Associado}
     * @return @{@link Associado}
     */
    public Associado cadastrar (Associado associado){
        associado.setId(contador++);
        associados.add(associado);
        return associado;
    }

    public List<Associado> listar () {return associados;}

    /**
     * Através do id informado realiza a pesquisa desse associado na lista de associados.
     * @param id @{@link Associado}
     * @return @{@link Associado}
     */
    public Associado pesquisar (int id){
        for (Associado associado : associados){
            if ( id == associado.getId()){
                return associado;
            }
        }
        return null;
    }

}




