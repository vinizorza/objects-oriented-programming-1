package CGD;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.List;


/**
 * Autor:           Artur Schaefer
 * Email:           artur.schaefer2@gmail.com
 * Data:            19/06/2016
 * Hora:            03:10:13
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos I
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       ValidaUsuario
 * Pacote de Criação:   CGD 
 */


public class ValidaUsuario {   
    
    /**
     * 
     * @param nomeEntrada
     * @param senhaEntrada 
     * @return Esse programa recebe do MudaMongoDao a collection a ser usada. Caso não haja recebe nulo.
     */
    public static boolean ValidaUsuario(String nomeEntrada, String senhaEntrada){
        int count;
        DBCollection collections = MudaMongoDao.MudaMongoDao();
        if(collections!=null){
            BasicDBObject andQuery = new BasicDBObject();
            List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
            obj.add(new BasicDBObject("nome", nomeEntrada));
            obj.add(new BasicDBObject("senha", senhaEntrada));
            andQuery.put("$and", obj);

            //System.out.println(andQuery.toString());

            DBCursor cursor = collections.find(andQuery);
            if(cursor.size()>=1){
                return true;
            }
        }
        return false;
    }
}

/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos I 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */
