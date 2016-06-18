package deussimulado02;
import java.util.Scanner;

/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            07/06/2016
 * Hora:            19:04:15
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       DeusSimulado02
 */


public class DeusSimulado02 {
    public static void main(String[] args) {
        int qt_anos = 500;

        // Aqui deve ser feita a leitura de qt_anos
//        Scanner s = new Scanner( System.in );
//        qt_anos = s.nextInt();
        
        Deus d1 = new Hades();
        Deus d2 = new Loki();
        Deus d3 = new Set();

        d1.passarTempo(qt_anos);
        d2.passarTempo(qt_anos);
        d3.passarTempo(qt_anos);

        d1.receberOracao("O Hades me ajude");
        d1.receberOracao("O Hades matai meus inimigos");

        d2.receberOracao("Loki fazei-me mais forte");
        d2.receberOracao("Loki dai-me o poder");

        d3.receberOracao("Set traga suas serpentes e me proteja");
        d3.receberOracao("Set mostre seu poder");

        if ((d1.getPoder() > d2.getPoder()) && (d1.getPoder() > d3.getPoder())) {
            System.out.println("Hades é o mais poderoso");
        } else if (d2.getPoder() > d3.getPoder()) {
            System.out.println("Loki é o mais poderoso");
        } else {
            System.out.println("Set é o mais poderoso");
        }
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
