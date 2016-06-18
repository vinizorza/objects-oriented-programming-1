package zombie;

import java.util.LinkedList;
import plant.Plant;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            04/05/2016
 * Hora:            02:53:52
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Devorador
 * Pacote de Criação:   zombie 
 */


public class Devorador extends Zombie{

    public Devorador(String nomePai, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nomePai, nome, idade, peso, forcaAtk);
    }   

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int atk = (int) zLista.get(indice).getForcaAtk();
        int enerAtual = pLista.get(indice).getEnergia();
        enerAtual -= atk;
        pLista.get(indice).setEnergia(enerAtual);
        
        //SE MATAR UMA PLANTA DEVE-SE CRIAR UM ZOMBIE GENÉRICO NA LISTA DE ZOMBIES
        if(enerAtual<=0){
            String nomeAux = zLista.get(indice).getNome();
            String nomePaiAux = zLista.get(indice).getiAmYourFather();
            int idadeAux = zLista.get(indice).getIdade();
            int pesoAux = zLista.get(indice).getPeso();
            
            Generico obZGenerico;
            obZGenerico = new Generico(nomePaiAux, nomeAux, idadeAux, pesoAux, 5);
            
            zLista.addLast(obZGenerico);
            
            return 1;//PLANTA DEVE SER REMOVIDA DA LISTA
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
