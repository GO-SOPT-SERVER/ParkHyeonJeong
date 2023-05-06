package sopt.org.firstSeminar.classAndInstance;

// 생성자 사용 이유 - 초기 변수 할당을 위해서
public class ConvenienceStore {
    // 편의점 브랜드
    String brand;
    // 편의점 주소
    String address;
    // 직원 수
    int staffCount;
    // 편의점 사장
    String boss;

    // this() 생성자로 다른 생성자를 호출한다.
    ConvenienceStore() {
        this("GS", "몰라", 1, "현정");
    }

    public ConvenienceStore(String brand, String address, int staffCount, String boss) {
        this.brand = brand;
        this.address = address;
        this.staffCount = staffCount;
        this.boss = boss;
    }

    public void addStaffCount() {
        staffCount++;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public String getBossName() {
        return boss;
    }


    public void printConvenienceStoreInfo() {
        System.out.println("편의점 브랜드: " + brand);
        System.out.println("편의점 주소: " + address);
        System.out.println("편의점 직원 수: " + staffCount);
        System.out.println("편의점 주인: " + boss);
    }
}
