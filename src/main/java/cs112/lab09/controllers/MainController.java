package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MainController {
    @FXML
    private ImageView logoImageView;
    @FXML
    private Button startButton;
    @FXML
    private Button quitButton;

    @FXML
    public void initialize() {
        logoImageView.setImage(new Image(getClass().getResourceAsStream("/images/Red-Summer.jpg")));
    }

    @FXML
    protected void onStartButtonClicked(ActionEvent actionEvent) throws IOException {
        //get map view as a scene
        Parent mapView = FXMLLoader.load(RedSummer.class.getResource("map-view.fxml"));
        Scene mapViewScene = new Scene(mapView);

        //get stage
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        //set scene (change) for our stage
        window.setScene(mapViewScene);

        //show the stage
        window.show();
    }

    @FXML
    protected void onQuitButtonClicked() {
        Platform.exit();
    }
}