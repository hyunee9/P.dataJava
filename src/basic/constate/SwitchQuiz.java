package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. (+, -, *, /)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약, 사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면
         연산할 수 없는 입력값이라고 얘기 해 주세요.
        */
        int result = 0;
        boolean flag = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 피연산자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("연산자를 하나 입력하세요(+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("두 번째 피연산자를 입력하세요: ");
        int num2 = scanner.nextInt();

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("연산할 수 없는 입력값입니다.");
                    flag = true;
                    break;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("연산자를 똑바로 입력하세요");
                break; //default문은 break 안넣어줘도 됨.
        }
        if (!flag) {
            System.out.println("연산의 결과: " + result);
        }

        scanner.close();
    }
}
