package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        int Input;

        while(true) {
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

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s = bf.readLine();
            Input = Integer.parseInt(s);
            if(Input == 0) break;

            switch(Input){
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    break;
                case 7 :
                    break;
            }

        }

    }

}