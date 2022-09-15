package org.example;

public class Word {
    private int id;
    private String word;
    private int level;
    private String meaning;

    Word(int id, String word, int level, String meaning) {
        this.id = id;
        this.word = word;
        this.level = level;
        this.meaning = meaning;
    }

    public int getLevel() {
        return level;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() { //toString은 Object라는 최상위 클래스에 속해있는 자메소드이기 때문에 다시 재정의해서 사용하기 위해서는 overriding을 해줘야한다.
        String slevel = "";
        for(int i = 0; i < level; i++) slevel += "*";
        String str = String.format("%-3s",slevel) + String.format("%15s ",word) + meaning;
        return str;
    }

    public String toFileString(){
        return this.level + "|" + this.word + "|" + this.meaning;
    }
}
