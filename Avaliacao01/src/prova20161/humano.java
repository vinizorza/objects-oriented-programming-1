package prova20161;


/**
 * Autor:           Artur Schaefer
 Email:           artur.schaefer2@gmail.com
 Data:            14/06/2016
 Hora:            18:54:51
 Codificação:     UTF-8
 Disciplina:      Programação Orientada a Objetos I
 Professor:       Giovany Frossard Teixeira
 Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES

 Nome Original:       humano
 Pacote de Criação:   avaliacao01 
 */


public abstract class humano extends Raca {
    private String nome;
    private String unidade;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public humano(String nome, String unidade) {
        this.nome = nome;
        this.unidade = unidade;
    }

    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
