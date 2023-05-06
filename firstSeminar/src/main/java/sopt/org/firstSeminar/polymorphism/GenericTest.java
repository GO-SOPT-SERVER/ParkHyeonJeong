package sopt.org.firstSeminar.polymorphism;

class GenericClass <T> {
    T type;
}

class GenericMethod {
    public <T> T genericMethod(T type){
        return type;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<Integer>();

        GenericMethod genericMethod = new GenericMethod();
        String str = genericMethod.genericMethod("hi hyeonjeong");
        System.out.println("str = " + str);
    }
}
