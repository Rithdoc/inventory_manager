import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/**
 * Created by Shaun on 3/15/2017.
 */
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
