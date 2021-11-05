package com.example.demofx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class HelloFxmlAppController {

    @FXML
    public BorderPane boarderPane;

    @FXML
    public void onClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void onNew(ActionEvent actionEvent) {
        TextArea text = new TextArea("New FXML");
        boarderPane.setCenter(text);
    }

    @FXML
    public void onOpenDialog(ActionEvent actionEvent) {
        DialogLayout layout = new DialogLayout();
        boarderPane.setCenter(layout.createInputPane());
    }

    @FXML
    public void onAbout(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
    }
}
