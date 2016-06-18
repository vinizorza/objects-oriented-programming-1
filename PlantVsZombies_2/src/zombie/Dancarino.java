package zombie;

import java.util.LinkedList;
import plant.Plant;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            03/05/2016
 * Hora:            19:51:38
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Dancarino
 * Pacote de Criação:   zombie 
 */


public class Dancarino extends Zombie{
    private LinkedList<Zombie> gLista;

    public Dancarino(LinkedList<Zombie> gLista, String nomePai, String nome, Integer idade, Integer peso, int forcaAtk) {
        super(nomePai, nome, idade, peso, forcaAtk);
        this.gLista = gLista;
    }

    @Override
    public int itsTime(LinkedList<Zombie> zLista, LinkedList<Plant> pLista, int indice) {
        //SETA VALORES PARA OS GENÉRICOS FORA DA LISTA
        int i = 0;
        int codAux = 0;
        String nomePaiAux = zLista.getFirst().getiAmYourFather();
        String nomeAux = zLista.getFirst().getNome();
        int idadeAux = zLista.getFirst().getIdade();
        int peso = zLista.getFirst().getPeso();
        int atk = 5;
        
        //ADICIONA +4 GENERICO NA LISTA DE ZOMBIES 
        Generico obZGenerico;
        while(i<4){
            obZGenerico = new Generico(nomePaiAux, nomeAux, idadeAux, peso, atk);
            this.gLista.addLast(obZGenerico);
            i++;
        }
      
        //ATACA COM TODOS ZOMBIES DA LISTA
        int indexGenerico = 0;
        for(Zombie testeGene : this.gLista){
            codAux = testeGene.itsTime(this.gLista, pLista, indexGenerico);
            if(codAux==1){
                return codAux;
            }
            indexGenerico++;
        }
        return codAux;
    }

    public LinkedList<Zombie> getgLista() {
        return gLista;
    }

    public void setgLista(LinkedList<Zombie> gLista) {
        this.gLista = gLista;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
