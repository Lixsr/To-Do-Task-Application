package com.example.to_do_task_application;
import javafx.scene.control.ListView;
import java.io.*;

public class Writer {
    public void Write(ListView<String> list, String fileName) throws IOException {
        FileWriter File_WRITE = new FileWriter(fileName);
        for (String s : list.getItems()){
            File_WRITE.write(s + '\n');
        }
        File_WRITE.close();
    }
}
