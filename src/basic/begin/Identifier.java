package basic.begin;

import java.util.Scanner;

public class Identifier {

    public static void main(String[] args) {

        // 1. 식별자는 대/소문자를 철저하게 구분함
        int age = 25;

        int Age = 40;

        // 2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 안됨!
//        int 700 = 365;
//        int 7number = 7;
        int number7 = 7;


        //3. 식별자에 공백 못들어감
//        int my birth day = 20040808;
        int myBirthDay = 20040808; //camel case 표기법


        //4. 식별자에 특수기호는 밑줄(_) + 달러기호($) 뿐입니다.
        //사용을 권장하지는 않습니다. 이미 사용하기로 약속한 곳이 있어요.
        String $hello = "안녕";


        //5. 키워드(예약어)는 식별자로 사용할 수 없음!
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.
//        String class = "8반"; (X)
        String Class = "8반"; //권장하지 않습니다.
        String myClass = "8반"; //이거 추천


        //6. 한글이나 한자 같은 식별자도 문법적으로 허용
        //권장 안함
        int 숫자 = 10;
        int sagwa = 20;



    }

}
