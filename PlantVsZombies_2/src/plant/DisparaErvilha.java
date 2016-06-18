package plant;

import java.util.LinkedList;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            16:40:08
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       DisparaErvilha
 * Pacote de Criação:   plant 
 */

public class DisparaErvilha extends Plant{
    public DisparaErvilha(String nacionalidade, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nacionalidade, nome, idade, peso, forcaAtk);
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int atk = (int) pLista.get(indice).getForcaAtk();
        int enerAtual = zLista.getFirst().getEnergia();
        enerAtual -= atk;
        zLista.getFirst().setEnergia(enerAtual);
        
        //RETORNA 2 SE MATOU ZOMBIE
        if(enerAtual<=-6){
            return 2;
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
