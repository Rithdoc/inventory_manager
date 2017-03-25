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
    TreeView<String> tree;

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


//        TreeItem<String> root, rithdoc, jypzee;

//        //Root Setup
//        root = new TreeItem<>();
//        root.setExpanded(true);

//        //Rithdoc
//        rithdoc = makeBranch("Rithdoc", root);
//        makeBranch("mostamazing", rithdoc);
//        makeBranch("Twitch", rithdoc);
//        makeBranch("Nerfherder", rithdoc);

//        //Jypzee
//        jypzee= makeBranch("Jypzee", root);
//        makeBranch("Draenei", jypzee);
//        makeBranch("HotStuff", jypzee);

//        //Create tree
//        tree = new TreeView<>(root);
//        tree.setShowRoot(false);

        //Layout
        VBox layout = new VBox();
        layout.getChildren().addAll();
        //layout.setPadding(new Insets(20, 20, 20, 20));
        //layout.getChildren().addAll(button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

//    //Create Branches method
//    public TreeItem<String> makeBranch(String content, TreeItem<String> parent){
//        TreeItem<String> item = new TreeItem(content);
//        item.setExpanded(true);
//        parent.getChildren().add(item);
//        return item;
//    }

}
