package com.rafi.musicstore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;

public class MusicInfoController implements Initializable {

    @FXML
    public Label isAvailableSong;

    @FXML
    public Label songGenreFromChoiceBox;

    @FXML
    public Label songName;

    @FXML
    private void loadMusicInfo () {
        try {
            RandomAccessFile r = new RandomAccessFile("musicInformation.txt", "r");
            if (r.length() == 0) {
                songName.setText("No music information available.");
                songGenreFromChoiceBox.setText("");
                isAvailableSong.setText("");
                return;
            }
            String line;
            while ((line = r.readLine()) != null) {
                r.seek(r.length());
                String[] parts = line.split(",");
                String title = parts[0];
                String genre = parts[1];
                String available = parts[2];
                songName.setText(title);
                songGenreFromChoiceBox.setText(genre);
                isAvailableSong.setText(available);
            }
            r.close();

        } catch (IOException e) {
            e.printStackTrace();
            songName.setText("Error loading music info.");
            songGenreFromChoiceBox.setText("");
            isAvailableSong.setText("");
        }

    }

    @FXML
    void backButtonController(ActionEvent event) {
        HelloApplication.changeScene("addmusic");
        System.out.println("Navigating back to Add Music screen");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadMusicInfo();
    }
}
