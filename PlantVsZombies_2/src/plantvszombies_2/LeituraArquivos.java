package plantvszombies_2;

/*  IMPORTS   -   INICIO  */
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import plant.*;
import zombie.*;
/*  IMPORTS   -   FIM  */

/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            16:56:29
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       LeituraArquivos
 * Pacote de Criação:   plantvszombies_2 
 */


public class LeituraArquivos{
    /**
     *
     * @param nomeFile
     * @param pLista
     */
    
    public static void lePlant(String nomeFile, LinkedList<Plant> pLista){
        String nomeAux;
        int tipoAux;
        int idadeAux;
        int pesoAux ;
        String nacionalidadeAux;
//        System.out.printf("\nConteúdo do arquivo texto Plant:\n");
        try (Scanner arq = new Scanner(new FileReader(nomeFile))) {            
            try{
                while(arq.hasNext()){
                    tipoAux = arq.nextInt();
                    nomeAux = arq.next();
                    idadeAux = arq.nextInt();
                    pesoAux = arq.nextInt();
                    nacionalidadeAux = arq.next();
                    switch(tipoAux){
                        case 1://   PLANT   DISPARAERVILHA
                            DisparaErvilha obPlantErv;
                            obPlantErv = new DisparaErvilha(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 10);
                            pLista.addLast(obPlantErv);
                            break;
                        case 2://   PLANT   GIRASSOL                       
                            Girassol obPlantGirassol;
                            obPlantGirassol = new Girassol(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 0);
                            obPlantGirassol.setEnergia(50);
                            pLista.addLast(obPlantGirassol);
                            break;
                        case 3://   PLANT   CEREJA-BOMBA
                            CerejaBomba obPlantBomb;
                            obPlantBomb = new CerejaBomba(nacionalidadeAux, nomeAux, idadeAux, pesoAux, Integer.MAX_VALUE);
                            pLista.addLast(obPlantBomb);
                            break;
                        case 4://   PLANT   NOZ-OBSTACULO
                            NozObstaculo obPlanNozObstaculo;
                            obPlanNozObstaculo = new NozObstaculo(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 0);
                            obPlanNozObstaculo.setEnergia(200);
                            pLista.addLast(obPlanNozObstaculo);
                            break;
                        case 5://   PLANT   BATATAMINA
                            BatataMina obPlantBatataMina;
                            obPlantBatataMina = new BatataMina(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 0);
                            obPlantBatataMina.setEnergia(500);
                            pLista.addLast(obPlantBatataMina);
                            break;
                        case 6://   PLANT   CARNÍVORA
                            Carnivora obPlantCarnivora;
                            obPlantCarnivora = new Carnivora(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 80);
                            obPlantCarnivora.setEnergia(150);
                            pLista.addLast(obPlantCarnivora);
                            break;
                        default:
                            throw new Exception("Não há essa opção de planta!");
//                            break;
                    }
                }
                arq.close();
            }catch(Exception erroAbertura){
                System.err.printf("Erro: %s.\n",erroAbertura.getMessage());
            }
        }catch (IOException erro){
          System.err.printf("Erro na abertura do arquivo: %s.\n",erro.getMessage());
        }
    }
    
    /**
     *
     * @param nomeFile
     * @param zLista
     */
    public static void leZombie(String nomeFile, LinkedList<Zombie> zLista){
        String nomeAux;
        int tipoAux;
        int idadeAux;
        int pesoAux ;
        String nomePaiAux;
//        System.out.printf("\nConteúdo do arquivo texto Zombie:\n");
        try (Scanner arq = new Scanner(new FileReader(nomeFile))) {            
            try{
                while(arq.hasNext()){
                    tipoAux = arq.nextInt();
                    nomeAux = arq.next();
                    idadeAux = arq.nextInt();
                    pesoAux = arq.nextInt();
                    nomePaiAux = arq.next();
                    switch(tipoAux){
                        case 1://   ZOMBIE  GENERICO
                            Generico obZGenerico;
                            obZGenerico = new Generico(nomePaiAux, nomeAux, idadeAux, pesoAux, 5);
                            zLista.addLast(obZGenerico);
                            break;
                        case 2://   ZOMBIE  DANÇARINO
                            Dancarino obZDancarino;
                            LinkedList<Zombie> gList;
                            gList = new LinkedList<>();
                            obZDancarino = new Dancarino(gList, nomePaiAux, nomeAux, idadeAux, pesoAux, 0);
                            zLista.addLast(obZDancarino);
                            break;
                        case 3://   ZOMBIE  CATAPULTA
                            Catapulta obZCatapulta;
                            obZCatapulta = new Catapulta(nomePaiAux, nomeAux, idadeAux, pesoAux, 5);
                            zLista.addLast(obZCatapulta);
                            break;
                        case 4://   ZOMBIE  CABO-ELÁSTICO
                            CaboElastico obZCaboElastico;
                            obZCaboElastico = new CaboElastico(nomePaiAux, nomeAux, idadeAux, pesoAux, 0);
                            zLista.addLast(obZCaboElastico);
                            break;
                        case 5://   ZOMBIE  DEVORADOR
                            Devorador obZDevorador;
                            obZDevorador = new Devorador(nomePaiAux, nomeAux, idadeAux, pesoAux, 100);
                            obZDevorador.setEnergia(500);
                            zLista.addLast(obZDevorador);
                            break;
                        default:
                            throw new Exception("Não há essa opção de Zombie!");
    //                        break;
                        }
                    }
                    arq.close();
                }catch(Exception erroZombie){
                    System.err.println("Erro: " + erroZombie.getMessage());
                }   
        }catch (IOException erro){
            System.err.printf("Erro na abertura do arquivo: %s.\n",erro.getMessage());
        }
    }
    
    public static void imprimeGanhador(Plant plantaFinal, Zombie zombieFinal, int cod){
        switch (cod) {
            case 1:
                //PLANT WINS
                System.out.println("O Time vencedor foi: " + plantaFinal.toString());
                System.out.println("O Time perdedor foi: " + zombieFinal.toString());
                System.out.print("O último membro do time perdedor foi: " + zombieFinal.getClass().getSimpleName());
                System.out.println(" => " + zombieFinal.getNome() + ", " + zombieFinal.getIdade() + ", " + zombieFinal.getPeso() + " cujo pai era " + zombieFinal.getiAmYourFather());
                System.out.print("O membro do time vencedor que transferiu o último ataque foi: " + plantaFinal.toString());
                System.out.println(" => " + plantaFinal.getNome() + ", " + plantaFinal.getIdade() + ", " + plantaFinal.getPeso() + " nascido em " + plantaFinal.getNacionalidade());
                break;
            case 2:
                //ZOMBIE WINS
                System.out.println("O Time vencedor foi: " + zombieFinal.toString());
                System.out.println("O Time perdedor foi: " + plantaFinal.toString());
                System.out.print("O membro do time vencedor que transferiu o último ataque foi: " + zombieFinal.getClass().getSimpleName());
                System.out.println(" => " + zombieFinal.getNome() + ", " + plantaFinal.getIdade() + ", " + zombieFinal.getPeso() + " cujo pai era  " + zombieFinal.getiAmYourFather());
                System.out.print("O último membro do time perdedor foi: " + plantaFinal.toString());
                System.out.println(" => " + plantaFinal.getNome() + ", " + plantaFinal.getIdade() + ", " + plantaFinal.getPeso() + " nascido em " + plantaFinal.getNacionalidade());
                break;
            default:
                System.err.println("Sei lá");
                break;
        }
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
