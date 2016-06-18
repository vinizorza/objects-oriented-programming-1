package plant;

import java.util.LinkedList;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:45:49
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Girassol
 * Pacote de Criação:   plant 
 */


public class Girassol extends Plant{
    public Girassol(String nacionalidade, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nacionalidade, nome, idade, peso, forcaAtk);
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int heal = 10;
        int atual;
        
        //ADICIONA VIDA EM TODAS PLANTS
        for (int i = 0; i < pLista.size(); i++) {
            atual = pLista.get(i).getEnergia();
            atual += heal;
            pLista.get(i).setEnergia(atual);
	}
        return 0;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
