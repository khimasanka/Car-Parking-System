package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Driver;
import model.DriverPass;

import java.io.IOException;
import java.util.ArrayList;

public class AddDriverFormController {
    public AnchorPane addDriverContext;
    public TextField txtDName;
    public TextField txtNIC;
    public TextField txtLNo;
    public TextField txtContact;
    public TextArea txtAddress;

    FirstInterfaceFormController myFrame;

    static ArrayList<Driver> driverArrayList=new ArrayList();

    public void moveToNIC(ActionEvent actionEvent) {
        txtNIC.requestFocus();
    }

    public void moveToLNo(ActionEvent actionEvent) {
        txtLNo.requestFocus();
    }

    public void moveToAddress(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }

    public void moveToContact(MouseEvent mouseEvent) {
        txtContact.requestFocus();
    }

    public void saveDriverOnAction(ActionEvent actionEvent) {

    }
}
