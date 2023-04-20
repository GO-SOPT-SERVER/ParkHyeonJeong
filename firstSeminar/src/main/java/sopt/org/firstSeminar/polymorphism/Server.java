package sopt.org.firstSeminar.polymorphism;

public class Server extends Sopt {
    private int number;
    private String partLeader;

    public void talkServerSeminar() {
        System.out.println("서버 파트장이 서버 세미나를 진행합니다.");
    }

    // 오버 로딩
    public void talkServerSeminar(String partLeader) {
        System.out.println(partLeader + " 파트장이 서버 세미나를 진행합니다.");
    }

    public void listenServerSeminar() {
        System.out.println("서버 파트원들이 서버 세미나를 듣습니다.");
    }

    // 오버라이딩
    @Override
    public void seminarListen() {
        System.out.println("세미나를 즐겁게 듣습니다.");
    }

    @Override
    public void seminarTalk() {
        System.out.println("세미나를 열정적으로 강의합니다.");
    }
}
