import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Shaun on 3/14/2017.
 */
public class Inventory extends Application implements EventHandler{

    Button button;

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Our Main JavaFX code will go here! :)

        primaryStage.setTitle("Title of the Window");

        button = new Button("First Text on the Button");
        button.setText("Click Me, like Alice did!");
        button.setOnAction(this);

        //We need to make a layout!

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(Event event)
    {
        if(event.getSource()==button)
        {
            System.out.println("Aaah, it tingles me, do it again!");
        }
    }


}
