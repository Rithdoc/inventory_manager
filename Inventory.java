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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Our Main JavaFX code will go here! :)

        window = primaryStage;
        window.setTitle("Rithdoc's JavaFX newboston tutorial code");

        window.setOnCloseRequest(e -> {
            closeProgram();
        });

        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        Boolean answer = Part.display("MyTitle", "Sure you want to exit?");
        if(answer)
            window.close();

        //System.out.println("This code ran.");
        //window.close();
    }


}
