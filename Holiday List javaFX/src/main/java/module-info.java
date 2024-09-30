module bd.edu.seu.holiday {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.holiday to javafx.fxml;
    exports bd.edu.seu.holiday;
}