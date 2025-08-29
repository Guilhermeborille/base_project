package br.edu.ifpr.pgua.eic.tads;

import br.edu.ifpr.pgua.eic.tads.controllers.CadastroController;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import java.util.ArrayList;
import br.edu.ifpr.pgua.eic.tads.models.*;



/**
 * Hello world!
 *
 */
public class App {
    public static ArrayList<Contato> dateBase = new ArrayList<>();
    public static void main( String[] args ){
        Javalin app = Javalin.create(config ->{
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);

        CadastroController cadastroController = new CadastroController();
        IndexController indexController = new IndexController();

        app.get("/", indexController.get);
        app.get("/cadastro", cadastroController.get);

        /* 
        Contato cont = new Contato("lulu do grau", "fds", "fds");
        Agenda agenda = new Agenda("info24", "online");

        agenda.salvarContato(cont);

        System.out.println(agenda);
        */
    }
}
