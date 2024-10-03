package bd.edu.seu.noorsirct;

import bd.edu.seu.noorsirct.information.UserLoginInfoList;
import bd.edu.seu.noorsirct.service.UserLogInInfoListService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static void changeScene(String fxml){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            primaryStage.setScene(scene);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}