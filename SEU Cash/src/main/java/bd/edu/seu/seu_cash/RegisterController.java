package bd.edu.seu.seu_cash;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterController {
    @FXML
    public TextField nameTextField;
    @FXML
    public TextField mobileTextField;
    @FXML
    public Label successLabel;



    @FXML
    public void registerAction(){
        System.out.println("Button Clicked");
        System.out.println("Name: " + nameTextField.getText());
        System.out.println("Mobile: " + mobileTextField.getText());

        if(!nameTextField.getText().isEmpty() || !mobileTextField.getText().isEmpty()){
            successLabel.setText("Registered Successfully");
        }else{
            successLabel.setText("Register Unsuccessful");
        }

    }


}
