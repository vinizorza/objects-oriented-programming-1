package CDP;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            18/06/2016
 * Hora:            16:29:16
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       MudasCafe
 * Pacote de Criação:   CDP 
 */


public class MudasCafe extends MongoObject{
    
    private String tipo;
    private String dataPlantio;
    private String dataEstimada;
    private double custoInicial;
    private double valorVenda;
    private int idViveiro;
    private int idLote;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(String dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public String getDataEstimada() {
        return dataEstimada;
    }

    public void setDataEstimada(String dataEstimada) {
        this.dataEstimada = dataEstimada;
    }

    public double getCustoInicial() {
        return custoInicial;
    }

    public void setCustoInicial(double custoInicial) {
        this.custoInicial = custoInicial;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getIdViveiro() {
        return idViveiro;
    }

    public void setIdViveiro(int idViveiro) {
        this.idViveiro = idViveiro;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }
    
    
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
