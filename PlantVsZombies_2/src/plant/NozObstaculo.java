package plant;

import java.util.LinkedList;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:47:17
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       NozObstaculo
 * Pacote de Criação:   plant 
 */


public class NozObstaculo extends Plant{

    public NozObstaculo(String nacionalidade, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nacionalidade, nome, idade, peso, forcaAtk);
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int codAux = 0;
        int i = 0;
        String nomePlantClasse;
        
        
        //AGORA VAI
        if(pLista.get(indice).equals(pLista.getLast())){
            return 0;
        }else{
            indice++;
            return pLista.get(indice).itsTime(zLista, pLista, indice);
        }
        
        
//        //DELEGA ATAQUE PARA OUTRA PLANTA
//        //TENTAR COLOCAR RECURSÃO
//        for (Plant auxLista : pLista) {
//            if(!auxLista.getClass().getSimpleName().equals("NozObstaculo")){
//                if (!auxLista.getClass().getSimpleName().equals("CerejaBomba")) {      
//                    codAux = auxLista.itsTime(zLista, pLista, i);
//                    break;
//                }
//            }
//            i++;
//        }
//        return codAux;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
