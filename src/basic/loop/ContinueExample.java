package basic.loop;

public class ContinueExample {
    public static void main(String[] args) {
        // while과 for문의 continue의 동작이 다르다?


        //for문에서 continue는 증감식이 발동한다.
        for (int i = 1; i <= 10 ; i++) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println("반복문 종료!");


        System.out.println("=============");

        // while에서 continue는 조건식으로 흐름이 이동.
        int  n = 1;
        while(n <= 10) {
            if (n ==5) continue;
            System.out.print(n + " ");
            n++;
        }
        System.out.println("\n반복문 종료");
    }
}
