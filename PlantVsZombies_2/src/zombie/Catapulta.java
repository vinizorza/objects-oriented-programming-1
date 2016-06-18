package zombie;

import java.util.LinkedList;
import plant.CerejaBomba;
import plant.Plant;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:54:06
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Catapulta
 * Pacote de Criação:   zombie 
 */


public class Catapulta extends Zombie{
    public Catapulta(String nomePai, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nomePai, nome, idade, peso, forcaAtk);
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int codAux = 0;
        double atk = zLista.get(indice).getForcaAtk();
        int energiaAux;
        
        for(Plant plantaListaAtacada : pLista){
            energiaAux = plantaListaAtacada.getEnergia();
            energiaAux-=atk;
            plantaListaAtacada.setEnergia(energiaAux);
            //TRATAR AS PLANTADAS QUE PRECISAM SER REMOVIDAS NO CONTROLE
            
            if(energiaAux<=0){
                codAux = 1;
            }
        }
        
        CerejaBomba auxBomba;
        int indexBomba = 0;
        for(Plant pPosAtk : pLista){
            if(pPosAtk.getClass().getSimpleName().equals("CerejaBomba")){
                auxBomba = (CerejaBomba) pPosAtk;
                codAux = auxBomba.itsTime(zLista, pLista, indice, indexBomba);
            }
            indexBomba++;
        }
        
        return codAux;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
