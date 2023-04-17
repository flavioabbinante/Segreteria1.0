package com.example.segreteria;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Vector;

public class ListaPazienti {


    @FXML
    ListView<Paziente> ListaPazientiView;
    @FXML
    private AnchorPane scenePane;


    Vector<Paziente> listaPazienti;

    public void setListaPazienti(Vector<Paziente> listaPazienti) {
        this.listaPazienti = listaPazienti;
    }

    public void VisualizzaLista(){
        if (listaPazienti.isEmpty()){
            System.out.println("La Lista è vuota");
        }else{
            ObservableList<Paziente> items = FXCollections.observableArrayList(listaPazienti);
            ListaPazientiView.getItems().addAll(items);
        }
    }
    @FXML
    private void Esci(){
        Stage stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }
}
