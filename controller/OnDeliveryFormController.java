package controller;

import javafx.embed.swing.JFXPanel;
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

public class OnDeliveryFormController {
    public AnchorPane onDeliveryContext;
    public TableColumn colDriverName;
    public TableColumn colonDeliveryVType;
    public TableView tblOnDelivery;
    public TableColumn colOnDeliveryVNumber;
    public TableColumn colOnDeliveryLeftTime;

    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Vehicle");
        stage.show();
    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load =FXMLLoader.load(resource);
        Scene scene =new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Driver");
        stage.show();
    }

    Stage stage;

    public void logOut(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("NO",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to log out?",yes,no);
        alert.setTitle("Log Out");
        Optional<ButtonType>result = alert.showAndWait();

        if(result.orElse(no)==yes){
        stage = (Stage) onDeliveryContext.getScene().getWindow();
        stage.close();

    }else{

        }

}


    public void inParkingOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) onDeliveryContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/InParkingDetailsForm.fxml"))));

    }
}
