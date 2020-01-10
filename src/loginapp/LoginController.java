package loginapp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel loginModel = new LoginModel();

    @FXML
    private Label dbstatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private ComboBox<option> combobox;
    @FXML
    private Button loginButton;

    public void initialize(URL url, ResourceBundle rb) {
        if (this.loginModel.isDatabaseConnected()) {
            this.dbstatus.setText("Connected to DataBase");
        }else {
            this.dbstatus.setText("Not Connected to DataBase");
        }

        this.combobox.setItems(FXCollections.observableArrayList(option.values()));
    }

    @FXML
    public void Login(ActionEvent event) {

    }

    public void studentLogin() {

    }

    public void adminLogin() {

    }
}
