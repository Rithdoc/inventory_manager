import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import sun.rmi.runtime.Log;

import java.awt.*;

/**
 * Created by Shaun on 3/14/2017.
 */
public class Inventory extends Application{

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Our Main JavaFX code will go here! :)

        window = primaryStage;
        window.setTitle("Rithdoc's JavaFX newboston tutorial code");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input
        TextField nameInput = new TextField("Shaun");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();

    }

}
