package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner sc = new Scanner(System.in);

    WordCRUD(Scanner s){ //WordCURD 생성자에서 Scanner를 파라미터로 두는 이유는 여러 클래스에서 Scanner를 선언해놓고 사용하는게 비효율적인 의도인거 같다고 설명해주셨다. by TA
        //하지만 나의 의견은 생성자에 이렇게 선언해두고 사용할거라면 WordManager클래스에서 Scanner선언 안하고 WordCRUD를 통해서 사용하면 될거 같은데 물어봐야겠다.
        list = new ArrayList<>();
        this.sc = s;
    }
    @Override
    public Word add() { //데이터 타입이 클래스인 메소드. 그래서 리턴값도 클래스이다. 교수님이 하셨던 방법은 우리가 만든 Word클래스 대신
        // Java의 Object클래스를 사용하셨었는데 어차피 리턴타입이 Word가 될꺼면 Word클래스 메소드를 만들어도 괜찮지 않을까 생각했었고 구현해보니 진짜 작동한다.
        System.out.println("=>난이도(1,2,3) & 새 단어 입력 : ");
        int level = sc.nextInt();
        String word = sc.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = sc.nextLine();

        return new Word(0,word, level,meaning);
    }
    public void addWord(){
        Word one = add(); //add() 메소드에서의 리턴값의 타입은 Object이다. Object클래스 타입으로 만든 메소드이기 때문이다. 그래서 Word클래스로 casting 시켜준 것이다.
        list.add(one);
        System.out.println("새 단어장에 추가되었습니다!!! ");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    public void updateWord(){

        System.out.println("=> 수정할 단어 검색 : ");
        String keyword = sc.next();
        ArrayList<Integer> idlist = this.listAll(keyword);
        System.out.println("=> 수정할 번호 선택 : ");
        int updateNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("=> 뜻 입력 : ");
        String meaning = sc.nextLine();
        Word word = list.get(idlist.get(updateNumber-1));
        word.setMeaning(meaning);
        System.out.println("단어가 수정되었습니다.");
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    public void deleteWord(){
        System.out.println("=> 삭제할 단어 검색 : ");
        String keyword = sc.next();
        ArrayList<Integer> idlist = this.listAll(keyword);
        System.out.println("=> 삭제할 번호 선택 : ");
        int deleteNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("=> 정말로 삭제하실래요?(Y/n) : ");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("y")){
            list.remove((int)idlist.get(deleteNumber-1));
            System.out.println("단어가 삭제되었습니다.");
        }else{
            System.out.println("취소되었습니다.");
        }
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
    public ArrayList<Integer> listAll(String keyword){ //5. 단어 수정에서 수정할 단어를 검색했을 때 그 단어가 포함된 단어만 출력해야한다.
        ArrayList<Integer> idlist = new ArrayList<>();
        int j = 0;
        System.out.println("---------------------");
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i).toString();
            if(word.contains(keyword)) {
                System.out.print((j + 1) + " ");
                System.out.println(word);
                idlist.add(i);
                j++;
            }
        }
        System.out.println("---------------------");
        return idlist;
    }
}

