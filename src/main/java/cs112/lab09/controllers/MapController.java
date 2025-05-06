package cs112.lab09.controllers;

import com.sun.tools.javac.Main;
import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    protected void onSanFranciscoButtonClick() throws IOException {
        //get FXML file for popup window (event-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RedSummer.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        //pass data to new controller for that view!
        EventController eventController = loader.getController();
        eventController.initData("San Francisco, Ca",
                new RevisedHistoricalEvent(
                        "a minor riot between Black and White soldiers occred in the Presidio in San Francisco",
                        new Date(5, 15, 1919),
                        "a minor riot between Black and White soliders occured in the Presidio in San Francisco after a dispute about a Thai soldier who was moved from the 'colored quarters' to the white military housing. Despite defending our country, housing for Black soliders was not only segregated but often inferior. Black soldiers also faced increased attacks and other forms of discrimination upon returning home",
                        "https://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en"
                ));


        //create a new stage for my popup window
        Stage popupStage = new Stage();

        //extra step: change modality of window
        popupStage.initModality(Modality.APPLICATION_MODAL);

        //set scene
        popupStage.setScene(new Scene(eventViewParent));

        //show scene
        popupStage.show();
    }

    @FXML
    protected void onBisbeeAzButtonClick() throws IOException {
        //get FXML file for popup window (event-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RedSummer.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        //create a new stage for my popup window
        Stage popupStage = new Stage();

        //extra step: change modality of window
        popupStage.initModality(Modality.APPLICATION_MODAL);

        //set scene
        popupStage.setScene(new Scene(eventViewParent));

        //show scene
        popupStage.show();
    }
}
