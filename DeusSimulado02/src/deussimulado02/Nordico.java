package deussimulado02;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            07/06/2016
 * Hora:            19:15:14
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Nordico
 * Pacote de Criação:   deussimulado02 
 */


public abstract class Nordico extends Deus{
    @Override
    public void passarTempo(int n){
        setPoder(this.getPoder()+(3*n));
    }
  
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
