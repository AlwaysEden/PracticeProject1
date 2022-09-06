package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner sc = new Scanner(System.in);

    WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.sc = s;
    }
    @Override
    public Object add() { //데이터 타입이 클래스인 메소드. 그래서 리턴값도 클래스이다. 내가 원하던 그림.
        System.out.println("=>난이도(1,2,3) & 새 단어 입력 : ");
        int level = sc.nextInt();
        String word = sc.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = sc.nextLine();

        return new Word(0,word, level,meaning);
    }
    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어장에 추가되었습니다!!! ");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectone(Object obj) {

    }
}
