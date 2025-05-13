package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {
    @FXML
    ImageView imageView;

    @FXML
    Button SFButton, BBButton;

    public void handleSFButton() throws IOException {
        handleShowModal(Constants.Event.SAN_FRANCISCO);
    }

    public void handleBBButton() throws IOException {
        handleShowModal(Constants.Event.BISBEE);
    }

    public void handleShowModal(Constants.Event eventIndex) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);

        System.out.println("In handle");
        CityController cityController = fxmlLoader.getController();
        cityController.initData(eventIndex);

        stage.show();
    }

//    public void initialize() {
//        System.out.println("In initialize");
//        Image image = new Image("/resources/images/Red-Summer.jpg");
//        imageView.setImage(image);
//    }
}
