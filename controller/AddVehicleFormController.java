package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class AddVehicleFormController {
    public AnchorPane addVehicleContext;
    public JFXTextField txtVNumber;
    public JFXTextField txtMWeight;
    public JFXTextField txtPassenger;
    public JFXComboBox cmbVType;

    public void initialize(){
        comboBox();
    }
    public void comboBox(){
        cmbVType.getItems().addAll("Bus","Van","Cargo Lorry");
    }

    public void saveVehicleOnAction(ActionEvent actionEvent) {
    }

    public void moveToWeight(ActionEvent actionEvent) {
        txtMWeight.requestFocus();
    }

    public void moveToPassengers(ActionEvent actionEvent) {
        txtPassenger.requestFocus();
    }
}
