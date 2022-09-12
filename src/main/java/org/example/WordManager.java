package org.example;

import java.util.Scanner;

public class WordManager {

    Scanner sc = new Scanner(System.in);
    WordCRUD wordCRUD;
    WordManager(){
        wordCRUD = new WordCRUD(sc);
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

        int menu = sc.nextInt();
        return menu;
    }

    public void start(){
        while(true) {
            int menu = selectMenu();
            if(menu == 0) {
                System.out.println("프로그램 종료 다음에 만나요~!");
                break;
            }
            if(menu == 4) {
                wordCRUD.addWord();
            }else if(menu == 1){
                wordCRUD.listAll();
            }else if(menu ==5) {
                wordCRUD.updateWord();
            }else if(menu ==6){
                wordCRUD.deleteWord();
            }
        }
    }
}
