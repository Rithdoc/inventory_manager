import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    TableView<Product> table;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Our Main JavaFX code will go here! :)

        window = primaryStage;
        window.setTitle("TableView Example");

        //Button
        button = new Button("Click Me!");

        //Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Product, String> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity Column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();


        //Layout
        VBox layout = new VBox();
        layout.getChildren().addAll();
        //layout.setPadding(new Insets(20, 20, 20, 20));
        //layout.getChildren().addAll(button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

}
