package prova20161;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            14/06/2016
 * Hora:            18:54:21
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Raca
 * Pacote de Criação:   avaliacao01 
 */


public abstract class Raca {

    static String MEDIO = "MEDIO";
    static String LONGE = "LONGE";
    static String PERTO = "PERTO";
    
    private int energia = 100;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public abstract void atacar(Raca nomeClasse, String distancia);
    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
