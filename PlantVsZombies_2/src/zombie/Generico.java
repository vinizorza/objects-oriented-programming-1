package zombie;

import java.util.LinkedList;
import plant.*;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:50:36
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Generico
 * Pacote de Criação:   zombie 
 */


public class Generico extends Zombie{
    private int flagMachado = 0;

    public Generico(String nomePai, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nomePai, nome, idade, peso, forcaAtk);
    }
    
    public int getFlagMachado() {
        return flagMachado;
    }

    public void setFlagMachado(int flagMachado) {
        this.flagMachado = flagMachado;
    }
    
    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        int atk = (int) zLista.get(indice).getForcaAtk();
        int enerAtual = pLista.getFirst().getEnergia();
        enerAtual -= atk;
        pLista.getFirst().setEnergia(enerAtual);

        //SE MATAR UMA PLANTA ADICIONA-SE MACHADO COM AUMENTO DE DANO DE ATAQUE
        if(enerAtual<=0){
            if(this.flagMachado==0){
                atk=20;
                this.flagMachado += 1;
                zLista.get(indice).setForcaAtk(atk);//ADICIONA MACHADO
            }
            return 1;//PLANTA DEVE SER REMOVIDA DA LISTA, MAS DEVE-SE TER CUIDADO COM TIPO DA PLANTA
        }
        return 0;//NÃO MATOU A PLANTA
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
