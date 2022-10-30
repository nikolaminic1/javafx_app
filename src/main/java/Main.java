package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/main/java/base.fxml"));
        primaryStage.setTitle("qm2 Studio");
        Scene scene = new Scene(root, 1000, 850);
        scene.getStylesheets().add("/main/resources/main/fxml/style/layout.css");
        primaryStage.setScene(scene);
//        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
