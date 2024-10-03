module com.rafi.musicstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rafi.musicstore to javafx.fxml;
    exports com.rafi.musicstore;
}