package loginapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel LoginModel = new LoginModel();

    @FXML
    private Label dbstatus;
    @FXML
    private Label username;
    @FXML
    private TextField password;
    @FXML
    private ComboBox<option> combobox;
    @FXML
    private Button loginButton;

    public void initialize(URL url, ResourceBundle rb) {

    }
}
