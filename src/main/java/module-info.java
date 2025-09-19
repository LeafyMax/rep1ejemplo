module com.example.prueba01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prueba01 to javafx.fxml;
    exports com.example.prueba01;
}