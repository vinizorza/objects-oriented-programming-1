package CIH;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Autor:           Artur Schaefer
 Email:           artur.schaefer2@gmail.com
 Data:            19/06/2016
 BoasVindas:            14:58:11
 Codificação:     UTF-8
 Disciplina:      Programação Orientada a Objetos I
 Professor:       Giovany Frossard Teixeira
 Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES

 Nome Original:       BoasVindas
 Pacote de Criação:   CIH 
 */


public class BoasVindas {

    public static String BoasVindas() {
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        String msg = " Tenha um ótimo trabalho";
        int hora = calendar.get(Calendar.HOUR_OF_DAY);

        if ((hora >= 06) && (hora < 12)) {
            return ("Bom dia!" + msg);
        } else if ((hora >= 12) && (hora < 18)) {
            return ("Boa Tarde!" + msg);
        } else if ((hora >= 18) && (hora < 23)) {
            return ("Boa Noite!" + msg);
        } else if ((hora > 00) && (hora < 06)) {
            return ("Boa Noite!" + msg);
        }
        return msg;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
