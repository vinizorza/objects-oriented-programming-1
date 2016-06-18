package plant;
import java.util.LinkedList;
import plantvszombies_2.Ser;
import zombie.Zombie;

/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            16:25:23
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Plant
 * Pacote de Criação:   plant 
 */


public abstract class Plant extends Ser {
    private String nacionalidade;

    public Plant(String nacionalidade, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nome, idade, peso, forcaAtk);
        this.nacionalidade = nacionalidade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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
