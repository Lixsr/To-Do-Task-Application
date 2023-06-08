package com.example.to_do_task_application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    private Writer writer = new Writer();
    @FXML
    private ListView<String> tasks_ListView;
    @FXML
    private TextField task;
    @FXML
    void onAddTask() throws IOException {
        if (!task.getText().isEmpty()){
        tasks_ListView.getItems().add(task.getText());
        writer.Write(tasks_ListView, "Tasks.txt");
        task.clear();
        }
    }
    @FXML
    void onRemoveTask() throws IOException {
        if (tasks_ListView.getItems().size() != 0 && tasks_ListView.getSelectionModel().getSelectedItem() != null) {
            tasks_ListView.getItems().remove(tasks_ListView.getSelectionModel().getSelectedIndex());
            writer.Write(tasks_ListView, "Tasks.txt");
            tasks_ListView.getSelectionModel().clearSelection();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            Scanner File_READ = new Scanner(new File("Tasks.txt"));
            while (File_READ.hasNext()){
                tasks_ListView.getItems().add(File_READ.nextLine());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FXML
    void clearSelection(){
        tasks_ListView.getSelectionModel().clearSelection();
    }
}