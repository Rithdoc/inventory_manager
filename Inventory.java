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
import javafx.scene.control.CheckBox;

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
        window.setTitle("Checkbox Example");

        //Form
        TextField nameInput = new TextField("Rithdoc");

        //CheckBoxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        CheckBox box3 = new CheckBox("Spinach");
        CheckBox box4 = new CheckBox("Chicken");
        CheckBox box5 = new CheckBox("Cheese");
        box5.setSelected(true);

        //Button
        button = new Button("Order Now!");
        button.setOnAction(e -> handleOptions(box1, box2, box3, box4, box5));


        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, box3, box4, box5, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();

    }

    //Handle Checkbox Options
    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5){
        String message = "User's order:\n";

        if(box1.isSelected())
        {
            message += "Bacon\n";
        }
        if(box2.isSelected())
        {
            message += "Tuna\n";
        }
        if(box3.isSelected())
        {
            message += "Spinach\n";
        }
        if(box4.isSelected())
        {
            message += "Chicken\n";
        }
        if(box5.isSelected())
        {
            message += "Cheese\n";
        }

        System.out.println(message);
    }

    private boolean isInt(TextField input, String message)
    {
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not a valid age");
            return false;
        }
    }

}
