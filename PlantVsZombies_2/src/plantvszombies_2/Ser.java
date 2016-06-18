package plantvszombies_2;

import java.util.LinkedList;
import plant.Plant;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            16:18:50
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Ser
 * Pacote de Criação:   plantvszombies_2
 */


public abstract class Ser {
    private String nome;
    private int idade;
    private int peso;
    private int energia = 100;
    private int forcaAtk;

    public Ser(String nome, Integer idade, int peso, int forcaAtk) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.forcaAtk =  forcaAtk;
    }

    public double getForcaAtk() {
        return forcaAtk;
    }

    public void setForcaAtk(int forcaAtk) {
        this.forcaAtk = forcaAtk;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSuperclass().getSimpleName();
    }

    /**
     *
     * @param zLista
     * @param pLista
     * @param indice
     * @return 
     */
    //    TESTE DE MÉTODO ABSTRATO
    public abstract int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice);
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
