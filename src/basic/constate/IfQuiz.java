package basic.constate;

import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {

        /*
            키가 140cm 이상, 나이가 8세 이상이어야 탑승할 수 있는
            놀이기구가 있다고 가정하고, 사용자에게 키와 나이를 입력받아서
            놀이기구 탑승 가능 / 불가능 여부를 알려주세요.
            탑승이 불가능 한 경우 불가능한 이유를 말해 주세요.
            ex)
                키가 140 미만이라 탑승이 불가능하다,
                나이가 8세 미만이라 탑승이 불가능 하다 등.
            - 나이가 6세 이상 8세 미만인 경우 보호자 동반 시 탑승이 가능하다고
            얘기해 주세요.

            놀이기구 탑승 가능 여부와 상관없이 '오늘 하루 즐거운 시간 되세요~!'
            를 출력하세요.
         */
        // age 변수는 if 블록 안에서만 유효합니다.
        // if 블록 외부에서는 age를 사용할 수 없습니다.



        System.out.println("키를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        if (height >= 140) {
            System.out.println("나이를 입력하세요: ");
            int age = scanner.nextInt();
            if (age > 8) {
                System.out.println("탑승 가능합니다!");
            } else if ((age >= 6) && (age < 8 )) {
                System.out.println("6세 이상 8세 미만인 경우 보호자 동반 시 탑승 가능합니다.");
            } else {
                System.out.println("탑승 불가합니다. ");
            }
        }
        System.out.println("오늘 하루 즐거운 시간 되세요~!");

        scanner.close();

        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        int max = 0, mid, min;

        System.out.println("첫 번째 정수를 입력하세요: ");
        int first = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요: ");
        int second = scanner.nextInt();
        System.out.println("세 번째 정수를 입력하세요: ");
        int third = scanner.nextInt();

        if ((first > second) && (first > third)){
            max = first;
            if (second > third) {
                mid = second;
                min = third;
            } else {
                mid = third;
                min = second;

            }
        } else if ((second > first) && (second > third)) {    //num2가 max
            max = second;
            if(first > third) {
                mid = first;
                min = third;
            } else {
                mid = third;
                min = first;
            }
        } else {
            max = third;
            if(first > second) {
                mid = first;
                min = second;
            } else {
                mid = second;
                min = first;
            }
        }
        System.out.print(max);
        System.out.print(mid);
        System.out.print(min);
    }
}
