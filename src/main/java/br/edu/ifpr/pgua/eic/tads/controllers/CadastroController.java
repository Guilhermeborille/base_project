package br.edu.ifpr.pgua.eic.tads.controllers;
import io.javalin.Javalin;
import io.javalin.http.Handler;;

public class CadastroController {
    public Handler get = ctx ->{
        ctx.redirect("telaCadastro.html");
    };
}
