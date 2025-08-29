package br.edu.ifpr.pgua.eic.tads.models;
import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.App;

public class Agenda {
    private String descricao;
    private String tipo;

    public Agenda(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }
    public void salvarContato(Contato contato){
        App.dateBase.add(contato);
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Agenda [descricao=" + descricao + ", tipo=" + tipo + "]" + App.dateBase;
    }
    

    
}
