package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;


public class InParkingDetailsFormController {
    public AnchorPane inParkingFull;
    public TableView tblParking;
    public TableColumn colVNumber;
    public TableColumn colVType;
    public TableColumn colSlot;
    public TableColumn colTime;
    public Label test;
    Stage stage;



    public void initialize(){


    }


    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene =new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Vehicle");
        stage.show();
    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene =new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Driver");
        stage.show();
    }

    public void logOut(ActionEvent actionEvent) {
      ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
      ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

       Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
               "Are you sure you want to log out?", yes, no);
        alert.setTitle("Log Out");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(no) == yes) {
            stage = (Stage) inParkingFull.getScene().getWindow();
            stage.close();
        } else {

        }
    }

    public void onDeliveryOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) inParkingFull.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/OnDeliveryForm.fxml"))));

    }








}
