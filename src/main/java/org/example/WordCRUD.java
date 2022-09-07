package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner sc = new Scanner(System.in);

    WordCRUD(){ //현재 생성자 파라미터로 있었던 Scanner를 뺀 상태. 어떤 영향이 있을까 탐구 중.
        list = new ArrayList<>();
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
    public void listAll(){
        System.out.println("---------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.print((i+1)+ " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("---------------------");
    }
}

