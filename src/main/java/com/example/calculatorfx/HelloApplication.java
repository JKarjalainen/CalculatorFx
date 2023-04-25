package com.example.calculatorfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    CalcController calcController = new CalcController();

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        Button resetButton = new Button("Reset");
        Button addButton = new Button("Add");
        TextField numberInput = new TextField();
        Label resultLabel = new Label("Result: " + calcController.getValue());
        addButton.setOnAction(actionEvent -> {
            calcController.add(Float.parseFloat(numberInput.getText()));
            setResult(resultLabel, numberInput);
        });
        resetButton.setOnAction(actionEvent -> {
            calcController.reset();
            resultLabel.setText("Result: " + calcController.getValue());
            numberInput.setText("");
            setResult(resultLabel, numberInput);
        });
        borderPane.setBottom(resultLabel);
        borderPane.setCenter(numberInput);
        borderPane.setLeft(resetButton);
        borderPane.setRight(addButton);


        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }

    // Set result and clear number input
    public void setResult(Label resultLabel, TextField numberInput) {
        resultLabel.setText("Result: " + calcController.getValue());
        numberInput.setText("");
    }

    public static void main(String[] args) {
        launch();
    }
}