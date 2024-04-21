package com.imagemanagementtool.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    public static void main(String[] args) throws Exception {
        Application.launch(args);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        primaryStage.setScene(new Scene(root));

        primaryStage.show();

    }

    }
