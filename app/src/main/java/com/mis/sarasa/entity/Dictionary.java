package com.mis.sarasa.entity;

/**
 * Created by Hanifmhd on 14/11/2017.
 */

public class Dictionary {
    private int id;
    private String word;
    private String translate;

    public Dictionary() {
    }

    public Dictionary(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
