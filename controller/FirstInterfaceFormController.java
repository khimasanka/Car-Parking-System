package controller;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FirstInterfaceFormController {

    public Label vehicleTypeContext;
    public Label showSlotContext;
    public Label time;
    public Label date;
    public ComboBox cmbVehicle;
    public ComboBox cmbDriver;
    public AnchorPane firstInterface;


    public void initialize() {
        RunningTime();
        showDate();
        vehicleComboBox();
        driversComboBox();
    }


    private void RunningTime() {
        final Thread thread = new Thread(()->{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm aa ");
            while (true){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                final String times=simpleDateFormat.format(new Date());
                Platform.runLater(()->{
                    time.setText(times);
                });
            }
        });
        thread.start();
    }

    private void showDate() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            date.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    String [] vehicle ={"NA-3434","KA-4563","58-3567","GF-4358","CCB-3568","LM-6679","QA-3369","KB-3668","JJ-9878","GH-5772","XY-4456","YQ-3536","CBB-3566","QH-3444"};
    String [] drivers ={"Sumith Kumara","Amila Pathirana","Jithmal Perera","Sumith Dissanayaka","Suamanasiri Herath","Awantha Fernando","Charith Sudara","Prashan Dineth",
                        "Chethiya Dilan","Dushantha Perera","Sumith Udayanga","Dinesh Udara","Udana Chathuranga","Mohommad Riaz","Sandun Kuamara","Priyanga Perera"};


    public void vehicleComboBox(){
        cmbVehicle.setPromptText("Select Vehicle Number"); 
        cmbVehicle.getItems().addAll(vehicle);

        cmbVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue ) -> {


           if (newValue== vehicle[0]){
               vehicleTypeContext.setText("Bus");
               showSlotContext.setText("14");
           }else{
               if(newValue == vehicle[1]|| newValue == vehicle[2] || newValue == vehicle[3] || newValue ==vehicle[4] || newValue == vehicle[5] || newValue== vehicle[6]){
                   vehicleTypeContext.setText("Van");
               }else{
                   vehicleTypeContext.setText("Cargo Lorry");
               }

           }
        });

    }

    public void driversComboBox(){
        cmbDriver.getItems().addAll(drivers);
        cmbDriver.setPromptText("Select Name");
    }


    public void parkOnAction(ActionEvent actionEvent) throws IOException {



    }


    public void leaveOnAction(ActionEvent actionEvent) {
    }

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene =new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


    }



}

