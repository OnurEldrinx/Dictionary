package com.teamfour.dictionary;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.collections.FXCollections;

public class App extends Application {

    HomePageController controller;
    DataManager dataManager;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("home-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        dataManager = new DataManager();


        controller = fxmlLoader.getController();

        Word tr = new Word(Config.Languages.TURKISH,"Turkish");
        Word fra = new Word(Config.Languages.FRENCH,"French");
        Word eng = new Word(Config.Languages.ENGLISH,"English");
        Word swe = new Word(Config.Languages.SWEDISH,"Swedish");
        Word gre = new Word(Config.Languages.GREEK,"Greek");
        Word ita = new Word(Config.Languages.ITALIAN,"Italian");
        Word deu = new Word(Config.Languages.GERMAN,"German");

        ObservableList<Word> languageCards = FXCollections.observableArrayList(tr,fra,eng,swe,gre,ita,deu);
        controller.sourceLangComboBox.setItems(languageCards);

        controller.searchButton.setOnAction(event -> controller.SearchButtonAction(languageCards,dataManager));




    }

    public static void main(String[] args) {
        launch();
    }
}