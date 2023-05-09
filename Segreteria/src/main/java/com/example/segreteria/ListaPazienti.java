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
    ListView<String> ListaPazientiView;
    @FXML
    private AnchorPane scenePane;


    Vector<Paziente> listaPazienti;
    Vector<String> cognomiPazienti = new Vector<String>();

    public void setListaPazienti(Vector<Paziente> listaPazienti){
        this.listaPazienti = listaPazienti;
    }



    @FXML
    public void VisualizzaLista(){

        int i;
        for(i=0;i<listaPazienti.size();i++){
            cognomiPazienti.add(i,listaPazienti.elementAt(i).toString());
        }

        if (listaPazienti.isEmpty()){
            System.out.println("La Lista è vuota");
        }else{
            ObservableList<String> items = FXCollections.observableArrayList(cognomiPazienti);
            ListaPazientiView.getItems().addAll(items);

        }
    }

    @FXML
    private void Esci(){
        Stage stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }
}
