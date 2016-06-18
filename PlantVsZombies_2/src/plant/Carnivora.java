package plant;

import java.util.LinkedList;
import zombie.Devorador;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:47:56
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Carnivora
 * Pacote de Criação:   plant 
 */


public class Carnivora extends Plant{

    public Carnivora(String nacionalidade, String nome, Integer idade, int peso, int forcaAtk) {
        super(nacionalidade, nome, idade, peso, forcaAtk);
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int atk =  (int) pLista.get(indice).getForcaAtk();
        int enerAtual = zLista.getFirst().getEnergia();
        
        //NÃO ESTAVA DANDO CERTO COMPARAR DIRETO NO IF, NÃO ENTENDI PORQUE
        String nomeCLasse = zLista.getFirst().getClass().getSimpleName();
        
        enerAtual -= atk;
        zLista.getFirst().setEnergia(enerAtual);
        atk += 10;
        
        pLista.get(indice).setForcaAtk(atk);
        if(zLista.getFirst().getEnergia() <= -6){
            if(nomeCLasse.equals("Devorador")){
                Carnivora novaMatadora;
                for(int i = 0; i<3; i++){
                    novaMatadora = new Carnivora(pLista.get(indice).getNacionalidade(), pLista.get(indice).getNome(), pLista.get(indice).getIdade(), pLista.get(indice).getPeso(), 80);
                    novaMatadora.setEnergia(150);
                    pLista.addLast(novaMatadora);
                }
                
            }
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
