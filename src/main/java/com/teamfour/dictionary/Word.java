package com.teamfour.dictionary;

import java.util.HashMap;

public class Word {

    private Config.Languages language; // which contains this word
    private String word;
    private String definition;
    private String type; // pronoun,noun,verb etc.
    private String synonyms;
    private String flagImgPath;
    private int hashCode;
    private Object[][] translationData; // translation of this word object into other 6 languages


    public Word(Config.Languages countryName,String word) {
        this.language = countryName;
        this.word = word;

        if (this.word != null) {
            this.hashCode = this.word.hashCode();
        }

        switch (this.language){

            case ENGLISH -> this.flagImgPath = Config.englandFlagImg;
            case FRENCH -> this.flagImgPath = Config.franceFlagImg;
            case GERMAN -> this.flagImgPath = Config.germanyFlagImg;
            case GREEK -> this.flagImgPath = Config.greeceFlagImg;
            case SWEDISH -> this.flagImgPath = Config.swedenFlagImg;
            case ITALIAN -> this.flagImgPath = Config.italyFlagImg;
            case TURKISH -> this.flagImgPath = Config.turkeyFlagImg;

        }

        translationData = new Object[6][1];
    }

    public Config.Languages getLanguage() {
        return language;
    }

    public void setLanguage(Config.Languages languageName) {
        this.language = languageName;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getFlagImgPath() {
        return flagImgPath;
    }

    public void setFlagImgPath(String flagImgPath) {
        this.flagImgPath = flagImgPath;
    }

    @Override
    public String toString() {
        return language.toString();
    }


    public Object[][] getTranslationData() {
        return translationData;
    }

    public void setTranslationData(Object[][] translationData) {
        this.translationData = translationData;
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }
}
