package quaternary3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Calculator.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("QuanCalc");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) { launch(args); }
}
