package bd.edu.seu.noorsirct.controller;

import bd.edu.seu.noorsirct.information.UserLoginInfoList;
import bd.edu.seu.noorsirct.service.UserLogInInfoListService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class RegisterController {

    @FXML
    private TextField UsernameTextfield;

    @FXML
    private CheckBox agreeCheckBox;

    @FXML
    private PasswordField passwordTextfield;

    @FXML
    private Label inputInvalid;


    @FXML
    void submitController(ActionEvent event) {
        String username = UsernameTextfield.getText();
        String password = passwordTextfield.getText();
        if (!agreeCheckBox.isSelected()) {
            inputInvalid.setText("You must agree to the terms and conditions.");
        } else if (username.isEmpty() || password.isEmpty()) {
            inputInvalid.setText("Please fill all the required fields.");
        } else {
            UserLoginInfoList userLoginInfo = new UserLoginInfoList(username, password);
            UserLogInInfoListService user = new UserLogInInfoListService();
            user.save(userLoginInfo);
            inputInvalid.setText("");  // Clear the error message
            System.out.println("User information saved successfully!");
        }

    }

}
