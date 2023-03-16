package com.teamfour.dictionary;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomePageController {
    @FXML
    protected MFXComboBox<Word> sourceLangComboBox;
    @FXML
    protected MFXButton searchButton;
    @FXML
    protected MFXTextField searchInput;
    @FXML
    protected ImageView flag1;
    @FXML
    protected ImageView flag2;
    @FXML
    protected ImageView flag3;
    @FXML
    protected ImageView flag4;
    @FXML
    protected ImageView flag5;
    @FXML
    protected ImageView flag6;

    @FXML
    protected AnchorPane alphaCard; // 00 01 02 10 11 12

    @FXML
    protected GridPane cardGrid;

    @FXML
    protected Text word1;

    @FXML
    protected Text wordType1;

    @FXML
    protected Text definition1;

    @FXML
    protected Text synonyms1;

    @FXML
    protected Text word2;

    @FXML
    protected Text wordType2;

    @FXML
    protected Text definition2;

    @FXML
    protected Text synonyms2;

    @FXML
    protected Text word3;

    @FXML
    protected Text wordType3;

    @FXML
    protected Text definition3;

    @FXML
    protected Text synonyms3;

    @FXML
    protected Text word4;

    @FXML
    protected Text wordType4;

    @FXML
    protected Text definition4;

    @FXML
    protected Text synonyms4;

    @FXML
    protected Text word5;

    @FXML
    protected Text wordType5;

    @FXML
    protected Text definition5;

    @FXML
    protected Text synonyms5;

    @FXML
    protected Text word6;

    @FXML
    protected Text wordType6;

    @FXML
    protected Text definition6;

    @FXML
    protected Text synonyms6;

    public void SearchButtonAction(ObservableList<Word> cards, DataManager dataManager){



        ArrayList<ImageView> imageViews= new ArrayList<>();
        imageViews.add(flag1);
        imageViews.add(flag2);
        imageViews.add(flag3);
        imageViews.add(flag4);
        imageViews.add(flag5);
        imageViews.add(flag6);

        ArrayList<Text> texts = new ArrayList<>();
        texts.add(word1);
        texts.add(word2);
        texts.add(word3);
        texts.add(word4);
        texts.add(word5);
        texts.add(word6);

        if(sourceLangComboBox.getValue() == null){

            sourceLangComboBox.selectIndex(0);

        }
        Word sourceLang = sourceLangComboBox.getValue();

        ObservableList<Word> temp = FXCollections.observableArrayList();
        temp.addAll(cards);

        temp.remove(sourceLang);



        Word searchTarget = new Word(sourceLang.getLanguage(),searchInput.getText().trim());
        System.out.println(searchTarget.getWord());



        long start = System.nanoTime();

        for (int i = 0; i < imageViews.size(); i++){

            Word w = dataManager.getALL_DICTS().get(i).get(searchTarget.getHashCode());
            if(w != null){

                texts.get(i).setText(w.getWord());
                texts.get(i).setFont(Font.font(10));
                imageViews.get(i).setImage(new Image(w.getFlagImgPath()));

            }

        }

        /*switch (sourceLang.getLanguage()){

            case ENGLISH -> {



            }

            case TURKISH -> {




            }

        }*/

        long end = System.nanoTime() - start;

        System.out.println(end);




        sourceLangComboBox.clearSelection();
        sourceLangComboBox.selectItem(sourceLang);


    }



}