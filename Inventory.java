import javafx.application.Application;
import javafx.collections.FXCollections;
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
    Button addButton;
    TableView<Product> table;
    TextField nameInput, priceInput, quantityInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Our Main JavaFX code will go here! :)

        window = primaryStage;
        window.setTitle("TableView Add and Delete");

        //Button
        addButton = new Button("Add");

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

        addButton.setOnAction(e -> addButtonClicked());

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        //Layout
        VBox layout = new VBox();
        layout.getChildren().addAll(table);
        //layout.setPadding(new Insets(20, 20, 20, 20));
        //layout.getChildren().addAll(button);

        scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 859.00, 20));
        products.add(new Product("Bouncy Ball", 2.49, 198));
        products.add(new Product("Toilet", 99.00, 74));
        products.add(new Product("The Notebook DVD", 19.99, 12));
        products.add(new Product("Corn", 1.49, 856));

        return products;
    }

    public void addButtonClicked(){
        
    }

}
