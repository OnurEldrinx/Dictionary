package com.teamfour.dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DataManager {

    private HashMap<Integer, Word> ENG_TUR_DICT;
    private HashMap<Integer, Word> ENG_FRA_DICT;
    private HashMap<Integer, Word> ENG_GER_DICT;
    private HashMap<Integer, Word> ENG_ITA_DICT;
    private HashMap<Integer, Word> ENG_GRE_DICT;
    private HashMap<Integer, Word> ENG_SWE_DICT;


    private ArrayList<HashMap<Integer, Word>> ALL_DICTS;

    public DataManager() {


        ALL_DICTS = new ArrayList<>();

        ENG_TUR_DICT = new HashMap<>();
        ENG_FRA_DICT = new HashMap<>();
        ENG_GER_DICT = new HashMap<>();
        ENG_ITA_DICT = new HashMap<>();
        ENG_GRE_DICT = new HashMap<>();
        ENG_SWE_DICT = new HashMap<>();

        LoadDictionaries();

        ALL_DICTS.add(ENG_TUR_DICT);
        ALL_DICTS.add(ENG_FRA_DICT);
        ALL_DICTS.add(ENG_GER_DICT);
        ALL_DICTS.add(ENG_ITA_DICT);
        ALL_DICTS.add(ENG_GRE_DICT);
        ALL_DICTS.add(ENG_SWE_DICT);

    }

    public void LoadDictionaries(){

        //parsing

        try {
            List<String> eng_tur_eng = Files.readAllLines(Paths.get(Config.ENG_TUR_ENG_TXT));
            List<String> eng_tur_tur = Files.readAllLines(Paths.get(Config.ENG_TUR_TUR_TXT));

            for (int i=0;i<eng_tur_eng.size();i++){

                Word eng = new Word(Config.Languages.ENGLISH,eng_tur_eng.get(i).trim().toLowerCase());
                Word tur = new Word(Config.Languages.TURKISH,eng_tur_tur.get(i).trim().toLowerCase());

                ENG_TUR_DICT.put(eng.getHashCode(), tur);
                //System.out.println(eng_tur_eng.get(i) + " - " + eng_tur_tur.get(i));

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        /*Word wEng = new Word(Config.Languages.ENGLISH,"Life");

        Word wTur = new Word(Config.Languages.TURKISH,"Hayat");

        Word wFra = new Word(Config.Languages.FRENCH,"Vie");

        Word wGer = new Word(Config.Languages.GERMAN,"Leben");

        Word wSwe = new Word(Config.Languages.SWEDISH,"Liv");

        Word wIta = new Word(Config.Languages.ITALIAN,"Vita");

        Word wGre = new Word(Config.Languages.GREEK,"ΖΩΗ");*/

        /*wEng.getTranslationData().put(wTur.getLanguage(),wTur);
        wEng.getTranslationData().put(wFra.getLanguage(),wFra);
        wEng.getTranslationData().put(wGer.getLanguage(),wGer);
        wEng.getTranslationData().put(wSwe.getLanguage(),wSwe);
        wEng.getTranslationData().put(wIta.getLanguage(),wIta);
        wEng.getTranslationData().put(wGre.getLanguage(),wGre);*/

        /*wEng.getTranslationData()[0][0] = wTur;
        wEng.getTranslationData()[1][0] = wFra;
        wEng.getTranslationData()[2][0] = wGer;
        wEng.getTranslationData()[3][0] = wSwe;
        wEng.getTranslationData()[4][0] = wIta;
        wEng.getTranslationData()[5][0] = wGre;


        ENG_TUR_DICT.put(wEng.getHashCode(),wTur);
        ENG_SWE_DICT.put(wEng.getHashCode(),wSwe);
        ENG_FRA_DICT.put(wEng.getHashCode(),wFra);
        ENG_GRE_DICT.put(wEng.getHashCode(),wGre);
        ENG_GER_DICT.put(wEng.getHashCode(),wGer);
        ENG_ITA_DICT.put(wEng.getHashCode(),wIta);*/


    }


    public HashMap<Integer, Word> getENG_TUR_DICT() {
        return ENG_TUR_DICT;
    }

    public void setENG_TUR_DICT(HashMap<Integer, Word> ENG_TUR_DICT) {
        this.ENG_TUR_DICT = ENG_TUR_DICT;
    }

    public HashMap<Integer, Word> getENG_FRA_DICT() {
        return ENG_FRA_DICT;
    }

    public void setENG_FRA_DICT(HashMap<Integer, Word> ENG_FRA_DICT) {
        this.ENG_FRA_DICT = ENG_FRA_DICT;
    }

    public HashMap<Integer, Word> getENG_GER_DICT() {
        return ENG_GER_DICT;
    }

    public void setENG_GER_DICT(HashMap<Integer, Word> ENG_GER_DICT) {
        this.ENG_GER_DICT = ENG_GER_DICT;
    }

    public HashMap<Integer, Word> getENG_ITA_DICT() {
        return ENG_ITA_DICT;
    }

    public void setENG_ITA_DICT(HashMap<Integer, Word> ENG_ITA_DICT) {
        this.ENG_ITA_DICT = ENG_ITA_DICT;
    }

    public HashMap<Integer, Word> getENG_GRE_DICT() {
        return ENG_GRE_DICT;
    }

    public void setENG_GRE_DICT(HashMap<Integer, Word> ENG_GRE_DICT) {
        this.ENG_GRE_DICT = ENG_GRE_DICT;
    }

    public HashMap<Integer, Word> getENG_SWE_DICT() {
        return ENG_SWE_DICT;
    }

    public void setENG_SWE_DICT(HashMap<Integer, Word> ENG_SWE_DICT) {
        this.ENG_SWE_DICT = ENG_SWE_DICT;
    }

    public ArrayList<HashMap<Integer, Word>> getALL_DICTS() {
        return ALL_DICTS;
    }

    public void setALL_DICTS(ArrayList<HashMap<Integer, Word>> ALL_DICTS) {
        this.ALL_DICTS = ALL_DICTS;
    }

}
