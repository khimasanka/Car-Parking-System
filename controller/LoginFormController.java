package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginFormController  {
    public AnchorPane loginContext;
    public JFXTextField userName;
    public JFXPasswordField password;
    public JFXButton login;
    public Label errorMsg;


    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        if(actionEvent.getSource()==login){
            String username= userName.getText();
            String secure= password.getText();
            if(username.equalsIgnoreCase("admin")&&secure.equalsIgnoreCase("admin")){
                System.out.println("Login success");

                Stage window =(Stage) loginContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/InParkingDetailsForm.fxml"))));

                AnchorPane log = FXMLLoader.load(getClass().getResource("../view/InParkingDetailsForm.fxml"));
                loginContext.getChildren().removeAll();
                loginContext.getChildren().setAll(log);


            }else if
            (userName.getText().isEmpty()&&password.getText().isEmpty()){
                errorMsg.setText("        Please enter your data");
            }else{
                errorMsg.setText("   Wrong username or password!");
            }
        }


    }


    public void moveToPW(ActionEvent actionEvent) {
        password.requestFocus();
    }
}
