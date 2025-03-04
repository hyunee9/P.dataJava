package oop.inter;

// 인터페이스 : 여러 종류의 게임 컨트롤러가 반드시 구현해야 하는 메서드를 정의.
public interface GameController {

    // 인터페이스에서 변수를 선언하면 상수로 인식한다.
    // public  static final
    int NUM = 5;

    // 인터페이스는 생성자를 가질 수 없다.
    // 객체화 될 수 없는 개념입니다.
    // public GameController() {}


    // 인터페이스에서 메서드를 선언하면 추상 메서드로 인식? 지정? 된다.
    void moveCharacter(String direction);
    void action ();
    void pause();

}
