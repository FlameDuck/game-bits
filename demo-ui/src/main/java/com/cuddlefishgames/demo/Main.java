package com.cuddlefishgames.demo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Demo-UI");
//        stage.setScene(mapGenerator.getScene());
        stage.show();
    }
}
