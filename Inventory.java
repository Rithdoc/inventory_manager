import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
            e.consume();
            closeProgram();
        });

        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("Deal");
        Button buttonE = new Button("Eat");
        Button buttonF = new Button("Freeze");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(borderPane, 300, 250);

        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        Boolean answer = Part.display("MyTitle", "Sure you want to exit?");
        if(answer)
            window.close();

    }


}
