module bd.edu.seu.noorsirct {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.noorsirct to javafx.fxml;
    exports bd.edu.seu.noorsirct;
    exports bd.edu.seu.noorsirct.controller;
    opens bd.edu.seu.noorsirct.controller to javafx.fxml;
}