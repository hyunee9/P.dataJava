package basic.operator;

public class UnaryOperator {
    public static void main(String[] args) {

        //증감연산자(++, --)
        //변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.
        int i = 1;
        int j = i++; //후위 연산 (선연산 후증감)
        int k = i--;

        j = ++i; //전위 연산 (선증감 후연산)
        k = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

    }
}
