package com.rafi.musicstore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;

public class AddmusicController implements Initializable {

    @FXML
    private ChoiceBox<String> checkGenreFiled;

    @FXML
    private ToggleGroup isAvailable;

    @FXML
    private TextField songTitleField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        checkGenreFiled.getItems().addAll("Pop", "Classical");
        checkGenreFiled.setValue("Pop");
    }

    @FXML
    void saveController(ActionEvent event) {
        String title = songTitleField.getText();
        String genre = checkGenreFiled.getValue();
        RadioButton selectedRadioButton = (RadioButton) isAvailable.getSelectedToggle();
        String availability = selectedRadioButton.getText();

        if (title.isEmpty() || genre == null || availability.isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Please fill all the fields before saving.");
            errorAlert.showAndWait();
            return;
        }
        try {
            RandomAccessFile r = new RandomAccessFile("musicInformation.txt", "rw");
            r.seek(r.length());
            String line = title + "," + genre + "," + availability + "\n";
            r.writeBytes(line);
            r.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloApplication.changeScene("musicInfo");
    }
}
