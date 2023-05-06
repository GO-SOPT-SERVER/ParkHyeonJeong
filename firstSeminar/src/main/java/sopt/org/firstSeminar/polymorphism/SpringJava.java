package sopt.org.firstSeminar.polymorphism;
// 추상클래스 상속받기
public class SpringJava extends Programming{
    @Override
    public void coding() {
        System.out.println("spring 언어 코딩하기");
    }

    // develop은 추상메소드는 아니라서 필수 선언은 아니다.
    @Override
    public void develop() {
        System.out.println("spring 언어 개발하기");
    }
}
