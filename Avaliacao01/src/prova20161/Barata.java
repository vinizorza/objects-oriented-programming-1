package prova20161;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            14/06/2016
 * Hora:            18:55:02
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Barata
 * Pacote de Criação:   avaliacao01 
 */


public class Barata extends zerg{

    public Barata(String colonia) {
        super(colonia);
    }

    
    public void entocar() {
        setEnergia((this.getEnergia()+5));
    }

    @Override
    public void atacar(Raca nomeClasse, String distancia) {
        if(distancia.equals(PERTO)){
            nomeClasse.setEnergia((nomeClasse.getEnergia()-25));
        }else if(distancia.equals("MEDIO")){
            nomeClasse.setEnergia((nomeClasse.getEnergia()-20));
        }
    }

}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
