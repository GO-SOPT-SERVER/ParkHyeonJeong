package sopt.org.firstSeminar.polymorphism;

/*
인터페이스 -> 접근제어자, 메소드, 변수 형식 제한되어 있음
abstract 메소드는 반드시 상속 받았을 때 오버라이드 해야함
 */
public interface Car {
    public abstract void runs();
    public abstract void stop();
}
