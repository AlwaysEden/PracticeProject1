package org.example;

public class Word {
    private int id;
    private String word;
    private int level;
    private String meaning;

    Word(){}
    Word(int id, String word, int level, String meaning){
        this.id = id;
        this.word = word;
        this.level = level;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public int getLevel() {
        return level;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
