module com.example.to_do_task_application {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.to_do_task_application to javafx.fxml;
    exports com.example.to_do_task_application;
}