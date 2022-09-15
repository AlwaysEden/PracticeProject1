package org.example;

import java.util.Scanner;

public class WordManager {
    WordCRUD wordCRUD;
    WordManager(){
        wordCRUD = new WordCRUD(new Scanner(System.in)); //Scanner가 여러 클래스 속에 선언될 필요가 없어보여서 WordManager클래스에서는 Scanner를 익명 객체로 선언해주었고 Scanner 기능을 사용하기 위해서는 WordCRUD클래스에서 가져와서 사용하기로 하였다.
    }
    public int selectMenu(){
        System.out.println("*** 영단어 마스터 ***");
        System.out.println();
        System.out.println("*****************");
        System.out.println("1. 모든 단어 보기");
        System.out.println("2. 수준별 단어 보기");
        System.out.println("3. 단어 검색");
        System.out.println("4. 단어 추가");
        System.out.println("5. 단어 수정");
        System.out.println("6. 단어 삭제");
        System.out.println("7. 파일 저장");
        System.out.println("0. 나가기");
        System.out.println("*****************");
        System.out.println("=> 원하는 메뉴는? ");

        return wordCRUD.sc.nextInt();
    }

    public void start(){
        wordCRUD.loadFile();
        while(true) {
            int menu = selectMenu();
            if(menu == 0) {
                System.out.println("프로그램 종료 다음에 만나요~!");
                break;
            }
            if(menu == 4) { //단어 추가
                wordCRUD.addWord();
            }else if(menu == 1){ //모든 단어 출력
                wordCRUD.listAll();
            }else if(menu == 5) { //단어 수정
                wordCRUD.updateWord();
            }else if(menu == 6){ //단어 삭제
                wordCRUD.deleteWord();
            }else if(menu == 7){ //단어 저장
                wordCRUD.saveFile();
            }else if(menu == 2){ //수준별 단어 출력
                wordCRUD.searchLevel();
            }else if(menu == 3){//단어 검색
                wordCRUD.searchWord();
            }
        }
    }
}
