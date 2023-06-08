package com.example.to_do_task_application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<String> Tasks_ListView;
    @FXML
    private TextField task;
    @FXML
    void onAddTask(ActionEvent event) {
        Tasks_ListView.getItems().add(task.getText());
    }

    @FXML
    void onRemoveTask(ActionEvent event) {
        Tasks_ListView.getItems().remove(Tasks_ListView.getSelectionModel().getSelectedIndex());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}