package bd.edu.seu.studentmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegisterController {
    @FXML
    public TextField nameField;
    @FXML
    public PasswordField passwordField;
    @FXML
    public ChoiceBox<String> programChoiceBox;
    @FXML
    public ToggleGroup genderToggle;
    @FXML
    public TextArea biographyArea;
    @FXML
    public CheckBox agreeCheckBox;
    @FXML
    public Label checkBoxError;

    public static String name;


    @FXML
    public void registerAction(){

        name = nameField.getText();
        String password = passwordField.getText();
        String program = programChoiceBox.getValue();
        //String gender = genderToggle.getSelectedToggle().getUserData().toString();
        String biography = biographyArea.getText();
        boolean agree = agreeCheckBox.isSelected();
        if(agree){
            HelloApplication.changeScene("welcome.fxml");
        }else{
            System.out.println("Agree to register");
            checkBoxError.setText("Agree to register");
        }
    }


    @FXML
    void swapOnAction(){
        System.out.println("Swapping on");
        HelloApplication.changeScene("welcome.fxml");
    }

}
