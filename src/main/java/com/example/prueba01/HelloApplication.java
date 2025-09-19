package com.example.prueba01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Text txtMessage = new Text();
        Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("hola");
        txtMessage.setText(" ");
        btn2.setText("adios");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                txtMessage.setText("Hello World!");

            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("GoodBye World!");
                txtMessage.setText("");

            }
        });

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(btn);
        root.getChildren().add(txtMessage);
        root.getChildren().add(btn2);


        Scene scene = new Scene(root, 300, 250);
        stage.setResizable(false);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {launch();}
}