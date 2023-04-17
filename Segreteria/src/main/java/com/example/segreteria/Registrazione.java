package com.example.segreteria;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Vector;

public class Registrazione {

    Vector<Paziente> listaPazienti;



    @FXML
    private TextField nome;
    @FXML
    private TextField cognome;
    @FXML
    private TextArea patologia;

    @FXML
    private AnchorPane registrazionePane;
    @FXML
    private Label lblesito;

     public void setListaPazienti(Vector<Paziente> listaPazienti){
         this.listaPazienti = listaPazienti;
     }

    @FXML
    protected  void salvaRegistrazione(){
        if (cognome.getText().equals("") || nome.getText().equals("")  || patologia.getText().equals("")){
            lblesito.setText("devi inseirie tutti i dati");


        }else{
            String Nome = nome.getText();
            String Cognome = cognome.getText();
            String Patologia = patologia.getText();

            Paziente p = new Paziente(Cognome,Nome,Patologia);
            listaPazienti.add(p);

            lblesito.setText("Paziente inserito in lista");
            lblesito.setText("Paziente aggiunto.");
            lblesito.setTextFill(Color.GREEN);

            cognome.setText("");
            nome.setText("");
            patologia.setText("");

            System.out.println("Aggiunto: " + p);
        }


    }
    @FXML
    protected void esciRegistrazione(){

            Stage stage = (Stage) registrazionePane.getScene().getWindow();
            stage.close();
        }

    @FXML
    protected void CancellaRegistrazione(){
        nome.setText("");
        cognome.setText("");
        patologia.setText("");
    }

}
