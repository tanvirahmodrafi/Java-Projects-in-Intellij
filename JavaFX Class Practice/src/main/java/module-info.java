module bd.edu.seu.practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.practice to javafx.fxml;
    exports bd.edu.seu.practice;
}