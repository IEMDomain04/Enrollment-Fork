package plm.rafaeltorres.irregularenrollmentsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import plm.rafaeltorres.irregularenrollmentsystem.db.Database;
import plm.rafaeltorres.irregularenrollmentsystem.utils.Maintenance;


import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainScene extends Application {

    @Override
    public void start(Stage stage) throws IOException {
//        Database.generatePassword();
//        Database.generateTableValues();
        FXMLLoader fxmlLoader = new FXMLLoader(MainScene.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}