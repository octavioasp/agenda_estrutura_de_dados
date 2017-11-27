package model;

import data.Id;

public class Pessoa {

    public int id;
    private String nome;
    private String telefone;

    public Pessoa(int id, String nome, String telefone) {

        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
