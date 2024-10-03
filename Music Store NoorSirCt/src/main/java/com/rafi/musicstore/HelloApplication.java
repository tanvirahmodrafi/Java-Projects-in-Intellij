package com.rafi.musicstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        // Assign primaryStage here
        primaryStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("addmusic.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Music Store");
        stage.setScene(scene);
        stage.show();

    }

    public static void changeScene(String fxml) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            primaryStage.setScene(scene);
            System.out.println("Scene changed successfully to " + fxml);
        } catch (IOException e) {
            System.out.println("Error while loading the FXML file: " + fxml + ".fxml");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
