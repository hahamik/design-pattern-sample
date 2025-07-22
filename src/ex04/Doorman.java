package ex04;

public class Doorman {
    private static Doorman instance = new Doorman();

    private Doorman() {
    }

    public static Doorman getInstance() {
        return instance;
    }

    // 객체의 책임
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + " 나가");
    }
}
