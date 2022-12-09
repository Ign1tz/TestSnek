package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;
import java.awt.*;
import java.io.IOException;

import static java.awt.Color.darkGray;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        //Drawing a Rectangle
        Rectangle level = new Rectangle();
        Rectangle player = new Rectangle();

        //Setting the properties of the rectangle
        level.setX(150.0f);
        level.setY(75.0f);
        level.setWidth(300.0f);
        level.setHeight(300.0f);
        level.setFill(Paint.valueOf("green"));

        player.setX(playerMovement.moveX);
        player.setY(100);
        player.setWidth(20);
        player.setHeight(20);
        player.setFill(Paint.valueOf("darkGreen"));

        //Creating a Group object
        Group root = new Group(level, player);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 600);

        //Setting title to the Stage
        stage.setTitle("Drawing a Rectangle");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}