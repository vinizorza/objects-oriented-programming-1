package prova20161;


/**
 * Autor:           Artur Schaefer
 Email:           artur.schaefer2@gmail.com
 Data:            14/06/2016
 Hora:            18:54:31
 Codificação:     UTF-8
 Disciplina:      Programação Orientada a Objetos I
 Professor:       Giovany Frossard Teixeira
 Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES

 Nome Original:       zerg
 Pacote de Criação:   avaliacao01 
 */


public abstract class zerg extends Raca {
    private String colonia;

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public zerg(String colonia) {
        this.colonia = colonia;
        this.setEnergia(90);
    }
    
    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
