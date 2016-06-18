package plantvszombies_2;

import java.util.*;
import plant.*;
import zombie.*;

/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            18:10:47
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       plantvszombies_2
 */

public class PlantVsZombies_2 {
        
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*DECLARAÇÃO VARIAVEIS  - INICIO    */
        String nomePlant = "plants.txt";
        String nomeZombie = "zombies.txt";
        
        Plant theLastOfPlants = null;
        Zombie theLastOfZombies = null;
        
        LinkedList<Plant> plantasList;
        plantasList = new LinkedList<>();
 
        LinkedList<Zombie> zombiesList;
        zombiesList = new LinkedList<>();
        
        int indexPlanta = 0;
        int exec = 0;
        /*  DECLARAÇÃO VARIAVEIS  -   FIM   */
        
        /*  LEITURA E INSERÇÃO DOS DADOS NAS LISTAS -   INICIO  */
        LeituraArquivos.lePlant(nomePlant, plantasList);
        LeituraArquivos.leZombie(nomeZombie, zombiesList);     
        /*  LEITURA E INSERÇÃO DOS DADOS NAS LISTAS -   FIM */
       
        /*  EXECUÇÃO ATÉ O FIM  -   INICIO  
        *   PARAR QUANDO A LISTA ESTIVER VAZIA OU COD-EXEC FOR MENOR QUE ZERO
        */
        while(plantasList.isEmpty()!=true && zombiesList.isEmpty()!=true && exec>=0){
            //SALVA OS PRIMEIROS DE CADA LISTA, DEPOIS POSSO DELETAR EM PAZ
            theLastOfPlants = plantasList.getFirst();
            theLastOfZombies = zombiesList.getFirst();

            //ZOMBIE ATACA PRIMEIRO
            exec = zombiesList.getFirst().itsTime(zombiesList, plantasList, 0);
            indexPlanta = 0;            
            
            //SE A PRIMEIRA PLANTA É UMA CEREJA, COLOCA AUTOMÁTICO UM EXEC -> 3
            if(plantasList.getFirst() instanceof CerejaBomba){
                exec=3;
            }
            
            if(exec==1){//REMOVER PLANTA DA LISTA DE PLANTAS
                //TRECHO IGUAL DA CEREJA BOMBA, MAS ELE ENTRA AQUI SEMPRE QUE A CATAPULTA MATAR UM ZOMBIE E NÃO HOUVER UMA CEREJA
                if(zombiesList.getFirst() instanceof Catapulta){
                    for(indexPlanta = 0; indexPlanta<plantasList.size(); indexPlanta++){
                        if(plantasList.get(indexPlanta).getEnergia()<=0){
                            theLastOfPlants = plantasList.getFirst();
                            plantasList.remove(indexPlanta);
                        }
                    }
                }else{
                    plantasList.removeFirst();
                }
                if(plantasList.isEmpty()){
                    break;
                }
            }else if(exec == 4){//CASO SEJA UM CABO ELASTICO
                plantasList.removeFirst();
                if(plantasList.isEmpty()){
                    break;
                }
            }else if(exec==3){//CASO O ATAQUE FOI EM UMA CEREJA BOMBA
                //REMOVE SEMPRE QUE A ENERGIA ESTÁ MENOR QUE ZERO
                theLastOfZombies = zombiesList.getFirst();
                zombiesList.removeFirst();
                
                if(theLastOfZombies instanceof Catapulta){
                    for(indexPlanta = 0; indexPlanta<plantasList.size(); indexPlanta++){
                        if(plantasList.get(indexPlanta).getEnergia()<=0){
                            theLastOfPlants = plantasList.getFirst();
                            plantasList.remove(indexPlanta);
                        }
                    }
                }else{
                    theLastOfPlants=plantasList.getFirst();
                    plantasList.removeFirst();
                }
                
            }
            
            //SALVA OS PRIMEIROS DE CADA LISTA, DEPOIS POSSO DELETAR EM PAZ
            if(plantasList.isEmpty() || zombiesList.isEmpty())
                break;
            else{
                theLastOfPlants = plantasList.getFirst();
                theLastOfZombies = zombiesList.getFirst();
            }
            
            //TESTA SE TEM A CEREJA BOMBA NA PRIMEIRA POSIÇÃO
            if(!plantasList.getFirst().getClass().getSimpleName().equals("CerejaBomba")){
                //ATAQUE DAS PLANTAS
                exec = plantasList.getFirst().itsTime(zombiesList, plantasList, 0);
                if(exec == 2){
                    zombiesList.removeFirst();
                    if(zombiesList.isEmpty()){
                        break;
                    }
                }
                
            }
            
            //TROCA POSIÇÃO DE ULTIMA PLANTA COM A PRIMEIRA
            plantasList.addLast(plantasList.removeFirst());               
        }

        /*  RESULTADO   */
        try{
            if(theLastOfPlants == null || theLastOfZombies == null){
                throw new Exception("Não iniciou os últimos da lista");
            }

            if(plantasList.isEmpty() && !zombiesList.isEmpty()){//ZOMBIE GANHA
                LeituraArquivos.imprimeGanhador(theLastOfPlants, theLastOfZombies, 2);
            }else if(zombiesList.isEmpty() && !plantasList.isEmpty()){//PLANTS GANHAM
                LeituraArquivos.imprimeGanhador(theLastOfPlants, theLastOfZombies, 1);
            }else{
                System.out.println("EMPATE!!!");
                System.out.println("Ultimo zombie: " + theLastOfZombies.getNome());
                System.out.println("Ultimo Plant: " + theLastOfPlants.getNome());
            }
            plantasList.clear();
            zombiesList.clear();
        }catch(Exception erroFim){
            System.err.println("Erro: " + erroFim.getMessage());
        }
    }
}

/*
    TABELA DE RETORNOS:
    1   -   REMOVER PLANTA DA LISTA
    2   -   REMOVER ZOMBIE DA LISTA
    3   -   REMOVE AMBOS DAS DUAS LISTAS
    4   -   CONVERSÃO DE PLANTA EM ZOMBIE   -   WOLOLO 
*/

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */

