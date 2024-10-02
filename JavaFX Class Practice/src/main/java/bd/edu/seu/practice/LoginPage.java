package bd.edu.seu.practice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPage implements Initializable {

    @FXML
    public CheckBox agreeCheckBox;

    @FXML
    public ToggleGroup genderToggle;

    @FXML
    public TextField nameField;

    @FXML
    public PasswordField passwordField;

    @FXML
    public ChoiceBox<String> programChoiceBox;

    @FXML
    public TextArea textArea;

    @FXML
    void registerController(ActionEvent event) {
        String name =nameField.getText();
        String password =passwordField.getText();
        String biography = programChoiceBox.getValue();
        String line = name + "," +password+"\n";

        try{
            RandomAccessFile file = new RandomAccessFile("admission.txt","rw");
            file.seek(file.length());
            file.writeBytes(line);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


        System.out.println("Hello World");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> programObservableList = FXCollections.observableArrayList();
        programObservableList.add("CSE");
        programObservableList.add("BBA");
        programObservableList.add("EEE");

        programChoiceBox.setItems(programObservableList);

    }
}
