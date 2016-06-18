package prova20161;


/**
 * Autor:           Artur Schaefer
 Email:           artur.schaefer2@gmail.com
 Data:            14/06/2016
 Hora:            18:54:41
 Codificação:     UTF-8
 Disciplina:      Programação Orientada a Objetos I
 Professor:       Giovany Frossard Teixeira
 Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES

 Nome Original:       proton
 Pacote de Criação:   avaliacao01 
 */


public abstract class proton extends Raca {
    private int numSerie;

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public proton(int numSerie) {
        this.numSerie = numSerie;
        this.setEnergia(120);
    }
    
    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
