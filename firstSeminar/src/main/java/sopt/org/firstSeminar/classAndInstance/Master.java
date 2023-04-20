package sopt.org.firstSeminar.classAndInstance;

public class Master {
    public static void main(String[] args) {
        // 인스턴스와 객체
        Animal animal = new Animal(); // 실제 사용되는 객체

        // 생성자
        ConvenienceStore goodCu = new ConvenienceStore("CU", "지구 어딘가", 8, "현정박");

        goodCu.addStaffCount();
        System.out.println("goodCu = " + goodCu.getBossName()); // 현정팍


        goodCu.printConvenienceStoreInfo();
    }
}
