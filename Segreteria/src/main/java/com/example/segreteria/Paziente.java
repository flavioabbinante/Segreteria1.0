package com.example.segreteria;

public class Paziente {


    private String Cognome;
    private String Nome;
    private String Patologia;




    public Paziente(String pCognome, String pNome, String pPatologia){
        this.Cognome = pCognome;
        this.Nome = pNome;
        this.Patologia = pPatologia;
    }
    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPatologia() {
        return Patologia;
    }

    public void setPatologia(String patologia) {
        Patologia = patologia;
    }
}
