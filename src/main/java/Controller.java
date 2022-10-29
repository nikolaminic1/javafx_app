package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

import javax.xml.parsers.DocumentBuilder;
import java.io.File;
import java.io.IOException;


public class Controller {

    @FXML
    MenuItem file_close_btn = new MenuItem();
    private String main_path = System.getProperty("user.home");
    private String folder_path = "/AppData/Local/qm2_studio/";
    private String file_path = "qm2.txt";

    public void file_close_btn_action()
    {
        String complete_path = main_path + folder_path;
        System.out.println(complete_path);
        File f1 = new File(complete_path);
        try
        {
            boolean value = f1.mkdir();
            boolean file_value;

            if (value)
            {
                System.out.println("Success");
                String full_path = complete_path + file_path;
                File f2 = new File(full_path);
                file_value = f2.createNewFile();
            }
            else {
                System.out.println("Error");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }

}
