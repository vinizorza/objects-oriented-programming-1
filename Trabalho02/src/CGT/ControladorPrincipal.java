package CGT;
import CIH.Login;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;

/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            18/06/2016
 * Hora:            14:20:56
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Trabalho02
 */

public class ControladorPrincipal {
    public static void main(String[] args) throws UnknownHostException {
        Login tela = new Login();
        tela.setVisible(true);
        //MudaMongoDao mudaMongoDao = new MudaMongoDao();
        //new TestFrame();
        
        //System.out.println(colecaoMudas.findOne());
        
        
    }
}

/*
 *  CIH (Componente de Interação Humana) 
 *  -> Nesta primeira camada terias tuas classes e interfaces referentes a GUI (Graphic User Interface)
 *
 *  CGT (Componente de Gerencia de Tarefa)
 *  -> Na segunda camada acho que são as classes referentes as regras de validação de tela (Validators). 
 *   Seriam as verificações de tipo, tamanho e dependêcia.
 *
 *  CDP (Componente de Dominio do Problema)
 *  -> Camada de negócio são as implementações das regras como validação de privilégios, logins...
 *
 *  CGD (Componente de Gerencia de Dados)
 *  -> Aqui tu teria as tuas classes de persistência 
 *  como as classes de mapeamento dos objetos (beans) e os Brokers.
 */



/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
