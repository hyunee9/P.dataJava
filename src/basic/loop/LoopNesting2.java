package basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {

        /*
        *
        **
        ***
        ****
        *****
         */
/*
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=====================");


        //별 찍기 전에 공백부터 만드는  for문
        for (int i = 1; i <= 5 ; i
                ++) {
            for (int l = 4; l >= i; l--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================");
        */

        /*
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        for (int i=1; i<=5; i++){
            for (int j = 0; j <i-1 ; j++) {
                System.out.println(" ");


            }
        }
    }
}
