package quaternary3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setTitle("QuanCalc");
        stage.setScene(scene);
        stage.show();
        System.out.println("Hello world!");
    }

    public static void main(String[] args) { launch(args); }
}
