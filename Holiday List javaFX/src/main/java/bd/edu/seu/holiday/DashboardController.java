package bd.edu.seu.holiday;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DashboardController {
    @FXML
    TextField nameTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    Label massageAfterSave;

    @FXML
    public void saveButtonAction(){
        String name = nameTextField.getText();
        String password = passwordTextField.getText();
        massageAfterSave.setText("Your input is saved!");

        System.out.println(name+" "+password);
    }


}
