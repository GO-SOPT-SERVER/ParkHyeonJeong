package sopt.org.firstSeminar.polymorphism;

// 인터페이스 상속받기
public class MyCar implements Car{
    @Override
    public void runs() {
        System.out.println("나의 차 달리기");
    }

    @Override
    public void stop() {
        System.out.println("나의 차 멈추기");
    }
}
