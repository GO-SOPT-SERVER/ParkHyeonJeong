package sopt.org.firstSeminar.inheritance;

public class Server extends Sopt{
    private int number;
    private String partLeader;

    public void talkServerSeminar() {
        System.out.println("서버 파트장이 서버 세미나를 진행합니다.");
    }

    public void listenServerSeminar() {
        System.out.println("서버 파트원들이 서버 세미나를 듣습니다.");
    }
}
