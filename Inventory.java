import javafx.application.Application;
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

/**
 * Created by Shaun on 3/14/2017.
 * based on newboston's tutorial series on Youtube.
 */
public class Inventory extends Application{

    Stage window;
    Scene scene;
    Button button;

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


        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().add("Pineapple");
        choiceBox.getItems().add("Pen");
        choiceBox.getItems().addAll("Ham", "ApplePen", "PineapplePen");

        choiceBox.setValue("PineapplePen");

        //Listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));

        //button.setOnAction(e -> getChoice(choiceBox));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

//    private void getChoice(ChoiceBox<String> choiceBox){
//        String food = choiceBox.getValue();
//        System.out.println(food);
//    }

}
