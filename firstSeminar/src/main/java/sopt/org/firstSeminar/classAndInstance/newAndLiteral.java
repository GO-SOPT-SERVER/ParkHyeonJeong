package sopt.org.firstSeminar.classAndInstance;

public class newAndLiteral {
    public static void main(String[] args) {
        String str1 = "hyeons";
        String str2 = new String("hyeons");

        // == 연산자 방식
        if(str1 == str2) {
            System.out.println("두개의 값이 같음.");
        } else {
            System.out.println("두개의 값이 같지 않음."); // 이거 출력
        }

        // equals 방식
        if(str1.equals(str2)) {
            System.out.println("두개의 값이 같음."); // 이거 출력
        } else {
            System.out.println("두개의 값이 같지 않음.");
        }
    }
}
