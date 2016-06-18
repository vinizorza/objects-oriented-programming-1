package prova20161;

import com.sun.prism.impl.PrismSettings;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            14/06/2016
 * Hora:            18:55:22
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Tanque
 * Pacote de Criação:   avaliacao01 
 */


public class Tanque extends humano {  
    private static int Qt = 0;
    
    public Tanque(String nome, String unidade) {
        super(nome, unidade);
        this.setQt((getQt()+1));
    }
    
    public static int getQt(){
        return Qt;
    }

    public void setQt(int Qt) {
        Tanque.Qt = Qt;
    }

    @Override
    public void atacar(Raca nomeClasse, String distancia) {
        nomeClasse.setEnergia((nomeClasse.getEnergia()-30));
    }

    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
