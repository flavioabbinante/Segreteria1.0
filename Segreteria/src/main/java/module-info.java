module com.example.segreteria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.segreteria to javafx.fxml;
    exports com.example.segreteria;
}