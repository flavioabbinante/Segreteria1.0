package com.example.segreteria;

import javafx.css.Style;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.GregorianCalendar;
import java.util.Vector;




public class HelloController {
    @FXML
    Vector<Paziente> listaPazienti = new Vector<>();
    @FXML
    private BorderPane scenePane;

    @FXML
    protected void Registrazione () throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FXRegistrazione.fxml"));
        Parent root = fxmlLoader.load();

        Registrazione registrazioneController = fxmlLoader.getController();
        registrazioneController.setListaPazienti(listaPazienti);

        Stage stage = new Stage();
        stage.setTitle("Registrazione");
        stage.setScene(new Scene(root, 600,400));
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    @FXML
    private void VisualizzaLista() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ListaPazienti.fxml"));
        Parent root = fxmlLoader.load();

        ListaPazienti listaPazientiController = fxmlLoader.getController();
        listaPazientiController.setListaPazienti(listaPazienti);
        listaPazientiController.VisualizzaLista();

        Stage stage = new Stage();
                stage.setTitle("Lista Pazienti");
                stage.setScene(new Scene(root, 600,400));
                stage.setResizable(false);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
    }


}
