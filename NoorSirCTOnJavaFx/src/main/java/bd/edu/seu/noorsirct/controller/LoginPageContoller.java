package bd.edu.seu.noorsirct.controller;

import bd.edu.seu.noorsirct.HelloApplication;
import bd.edu.seu.noorsirct.information.UserLoginInfoList;
import bd.edu.seu.noorsirct.service.UserLogInInfoListService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageContoller {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userIdTextField;

    @FXML
    public void enterController(){
        String userIdTextField = this.userIdTextField.getText();
        String passwordFieldText = this.passwordField.getText();
        UserLoginInfoList userLoginInfo= new UserLoginInfoList(userIdTextField, passwordFieldText);
        UserLogInInfoListService user = new UserLogInInfoListService();
        if (user.check(userLoginInfo)){
            System.out.println("User logged in");
        }else {
            System.out.println("User not logged in");
        }
    }
    @FXML
    void triggerRegisterPage(ActionEvent event) {
        HelloApplication.changeScene("register");
    }
}
