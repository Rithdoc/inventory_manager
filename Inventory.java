import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Shaun on 3/14/2017.
 */
public class Inventory extends Application{

    Stage window;
    Button button;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Our Main JavaFX code will go here! :)

        window = primaryStage;
        window.setTitle("This is Rithdoc's execution of boston's tutorial!");

        //Label label1 = new Label("Welcome to the first scene!");

        button = new Button("Click me like Alice did!");
        button.setOnAction(e -> {
            boolean result = Part.display("Windows Title", "Are you sure you want to do that, Dave?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);

//        //Button 1
//        Button button1 = new Button("Go to scene 2");
//        button1.setOnAction(e -> window.setScene(scene2));
//
//        //Layout 1 - children laid out in vertical column
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1, button1);
//        scene1 = new Scene(layout1, 200, 200);
//
//        //Button 2
//        Button button2 = new Button("This scene sucks, go back to scene 1");
//        button2.setOnAction(e -> window.setScene(scene1));
//
//        //Layout 2
//        StackPane layout2 = new StackPane();
//        layout2.getChildren().add(button2);
//        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene);
        window.show();

    }


}
