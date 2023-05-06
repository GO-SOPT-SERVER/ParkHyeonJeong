package sopt.org.firstSeminar.polymorphism;

public class Master {
    public static void main(String[] args) {
        Server server = new Server();

        server.talkServerSeminar();
        server.talkServerSeminar("이승헌");
    }
}
