package plm.rafaeltorres.irregularenrollmentsystem.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import plm.rafaeltorres.irregularenrollmentsystem.MainScene;
import plm.rafaeltorres.irregularenrollmentsystem.controllers.Controller;
import plm.rafaeltorres.irregularenrollmentsystem.model.User;

import java.io.IOException;
import java.util.EventObject;

public class SceneSwitcher {
    public static void switchScene(EventObject eo, String fxml, User arg) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainScene.class.getResource(fxml));
        Scene scene = new Scene(loader.load());
        Controller c = loader.getController();
        c.setUser(arg);
        Stage stage = (Stage)((Node)eo.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(StringUtils.addSpacesOnPascalCase(fxml.replace(".fxml", "")));
    }
    public static void switchScene(EventObject eo, String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainScene.class.getResource(fxml));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage)((Node)eo.getSource()).getScene().getWindow();
        stage.setTitle(StringUtils.addSpacesOnPascalCase(fxml).replace(".fxml", ""));
        stage.setScene(scene);
    }
}
