package CGD;

import com.mongodb.*;
import java.net.UnknownHostException;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            18/06/2016
 * Hora:            19:12:17
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       MudaMongoDao
 * Pacote de Criação:   CGD 
 */


public class MudaMongoDao {
    public static DBCollection MudaMongoDao(){ 
        Mongo m;
        DB db;
        DBCollection colecaoUsuario;  
        try {
            m = new Mongo("localhost");
            db = m.getDB("MudasSchaefer");
            if (db.collectionExists("usuarios")) {
                colecaoUsuario = db.getCollection("usuarios");
//                List<String> dbsas = m.getDatabaseNames();
//                System.out.println(colecaoUsuario.count());
//                System.out.println(dbsas);
                return colecaoUsuario;
            }else{
                System.out.println("Não existe collection"); 
            }
        } catch (UnknownHostException ex) {
            System.out.println("Host Desconhecido");
        } catch (MongoException ex) {
            System.out.println("Erro no MongoDB");
        }
        return null;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
