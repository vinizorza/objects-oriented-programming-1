
/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            14/06/2016
 * Hora:            18:53:33
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Avaliacao01
 */


package prova20161;

public class UsaClasses {

    public static void main(String[] args) {
        // Zergs tem Colônia (nesse caso "Astargue")
        Raca zerg = new Barata("Astargue");
        
        // Humanos tem nome e unidade
        Raca humano = new Tanque("Omar", "Los pesados");
        
        // Protons tem número de série
        Raca proton = new Fanaticus(5);
        
        // zerg vai retirar 20 de energia de humano pois a distânca é MEDIO
        zerg.atacar(humano, Raca.MEDIO);
        
        // proton vai retirar 40 de energia de zerg pois a distância é PERTO
        proton.atacar(zerg, Raca.PERTO);

        // Humano vai retirar 30 de energia de proton
        humano.atacar(proton, Raca.LONGE);

        // A barata se entocou 4x para recuperar a energia
        Barata barata = (Barata) zerg;
        barata.entocar();
        barata.entocar();
        barata.entocar();
        barata.entocar();
        if (zerg.getEnergia() > humano.getEnergia()) {
            System.out.println("Barata menos ferida que tanque");
        } else {
            System.out.println("Tanque menos ferido que Barata");
        }
        System.out.println("A quantidade de tanques criados é: " + Tanque.getQt());
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
