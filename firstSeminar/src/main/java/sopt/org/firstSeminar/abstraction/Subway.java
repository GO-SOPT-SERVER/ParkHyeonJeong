package sopt.org.firstSeminar.abstraction;

// 추상화 : 클래스들의 공통적인 요소 뽑아서 상위 클래스 만드는 것
public class Subway {
    private String startLocation;
    private String arrivalLocation;
    private int line;
    private String station;

    public void run() {
        System.out.println("지하철이 출발합니다.");
    }

    public void stop(){
        System.out.println("지하철이 멈춥니다.");
    }

    public void lastStop() {
        System.out.println("이번역은 종점입니다.");
    }
}
