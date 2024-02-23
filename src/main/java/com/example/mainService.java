package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class mainService extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("calculator.fxml"));
            AnchorPane root = loader.load();
            
            calculatorController controller = loader.getController();

            Scene myScene = new Scene(root);
            primaryStage.setTitle("IOS calculator (pls dont sue me)");
            primaryStage.setScene(myScene);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


