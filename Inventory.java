import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import sun.rmi.runtime.Log;

import java.awt.*;
import java.util.Observable;

/**
 * Created by Shaun on 3/14/2017.
 * based on newboston's tutorial series on Youtube.
 */
public class Inventory extends Application{

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Our Main JavaFX code will go here! :)

        window = primaryStage;
        window.setTitle("ChoiceBox Example");

        //Button
        button = new Button("Click Me!");

        listView = new ListView<>();
        listView.getItems().addAll(
                "Contact",
                "Might Joe Young",
                "Moana",
                "Maleficent",
                "Rocksteady",
                "Bebop",
                "Shredder",
                "Krang",
                "Splinter"
        );
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private void buttonClicked(){
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m : movies){
            message += m + "\n";
        }

        System.out.println(message);
    }

}
