package plant;

import java.util.LinkedList;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:46:47
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       CerejaBomba
 * Pacote de Criação:   plant 
 */


public class CerejaBomba extends Plant{
    public CerejaBomba(String nacionalidade, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nacionalidade, nome, idade, peso, forcaAtk);
    }
    
    //GRAVA ENERGIA MINIMA EM UMA CEREJA EM UM ZOMBIE
    //Override (SOBRESCRITA)  -   SAME NAME, SAME PARAMETERS
    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        zLista.getFirst().setEnergia(Integer.MIN_VALUE);
        pLista.get(indice).setEnergia(Integer.MIN_VALUE);
        return 3;//REMOVE AMBOS DAS DUAS LISTAS
    }
    
    //OverLoading (SOBRECARGA)   -   SAME NAME, BUT DIFFERENT PARAMETERS
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indiceZ, int indiceP){
        zLista.get(indiceZ).setEnergia(Integer.MIN_VALUE);
        pLista.get(indiceP).setEnergia(Integer.MIN_VALUE);
        return 3;//REMOVE AMBOS DAS DUAS LISTAS
    }

}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
