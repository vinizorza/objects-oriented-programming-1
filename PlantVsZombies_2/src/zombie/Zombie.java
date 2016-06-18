package zombie;

import java.util.LinkedList;
import plant.Plant;
import plantvszombies_2.Ser;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:49:30
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Zombie
 * Pacote de Criação:   zombie 
 */


public abstract class Zombie extends Ser{
    private String iAmYourFather;

    public Zombie(String nomePai, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nome, idade, peso, forcaAtk);
        this.iAmYourFather = nomePai;
    }

    public String getiAmYourFather() {
        return iAmYourFather;
    }

    public void setiAmYourFather(String iAmYourFather) {
        this.iAmYourFather = iAmYourFather;
    }   

    @Override
    public abstract int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice);
    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
