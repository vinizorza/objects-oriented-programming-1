package zombie;

import java.util.ArrayList;
import java.util.LinkedList;
import plant.Plant;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            04/05/2016
 * Hora:            02:49:48
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       CaboElastico
 * Pacote de Criação:   zombie 
 */


public class CaboElastico extends Zombie{
    public CaboElastico(String nomePai, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nomePai, nome, idade, peso, forcaAtk);
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        if(pLista.getFirst().getForcaAtk()==0){
            //DADOS IGUAIS OS DO PAI, MAS PODEM SER IGUAIS A DA PLANTA?
            String nomeAux = zLista.get(indice).getNome();
            String nomePaiAux = zLista.get(indice).getiAmYourFather();
            int idadeAux = zLista.get(indice).getIdade();
            int pesoAux = zLista.get(indice).getPeso();
            
            Generico obZGenerico;
            obZGenerico = new Generico(nomePaiAux, nomeAux, idadeAux, pesoAux, 5);
            
            zLista.addLast(obZGenerico);
            
            return 4;//INFORMA QUE DEVE SER FEITA A CONVERSÃO
        }
        return 0;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
