package plant;

import java.util.LinkedList;
import java.util.Random;
import zombie.Zombie;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            16:42:02
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       BatataMina
 * Pacote de Criação:   plant 
 */


public class BatataMina extends Plant {

    public BatataMina(String nacionalidade, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nacionalidade, nome, idade, peso, forcaAtk);
    }
    
    protected Integer aleatorio() {
        Random r = new Random();
        int minimo;
        int resultado;
        int maximo;
        
        minimo = 1;
        maximo = 4;
        resultado = r.nextInt(maximo-minimo)+minimo;
        
        return resultado;
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int criarAux = aleatorio();
        
        String nomeAux;
        int idadeAux;
        int pesoAux ;
        String nacionalidadeAux;
        
        nomeAux = pLista.get(indice).getNome();
        idadeAux = pLista.get(indice).getIdade();
        pesoAux = pLista.get(indice).getPeso();
        nacionalidadeAux = pLista.get(indice).getNacionalidade();
        
//        System.out.println("BATATA RANDOM: " + criarAux);
        switch(criarAux){
            case 1:
                DisparaErvilha obPlanDisparaErvilha;
                obPlanDisparaErvilha = new DisparaErvilha(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 10);
                pLista.addLast(obPlanDisparaErvilha);
                break;
            case 2:
                Girassol obPlanGirassol;
                obPlanGirassol = new Girassol(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 0);
                pLista.addLast(obPlanGirassol);
                break;
            case 3: 
                CerejaBomba obPlanCerejaBomba;
                obPlanCerejaBomba = new CerejaBomba(nacionalidadeAux, nomeAux, idadeAux, pesoAux, 0);
                pLista.addLast(obPlanCerejaBomba);
                break;
            default:
                System.out.println("ERRO INESPERADO: INSERÇÃO BATATAMINA");
                break;
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
