package basic.loop;

public class WhileExample2 {
    public static void main(String[] args) {

        //48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해보세요.
        int start = 48;
        while (start <= 150) {
            if (start % 8 == 0) {
                System.out.print(start + " ");
            }
            start++;
        }
        System.out.println(); //단순 줄 개행

        // 1 ~ 100 까지의 정수 중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력해 보세요.

        int count = 1;
        while(count <= 100){
            if ((count % 4 == 0) & (count % 8 != 0)) {
                System.out.print(count + " ");
            }
            count++;
        }
        System.out.println();

        //1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력.
        int num = 1;
        int c = 0;
        while(num <= 30000) {
            if(num % 258 == 0) {
                c += 1;
            }
            num++;
        }
        System.out.println(c);


        // 1000의 약수의 개수를 출력
        int d = 1, cnt = 0;
        while (d <= 1000){
            if (1000 % d == 0) {
                cnt += 1;
            }
            d ++;
        }
        System.out.println(cnt);

    }
}
