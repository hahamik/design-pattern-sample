package ex04;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();

        Doorman d1 = Doorman.getInstance();

        d1.쫓아내(mouse);
        d1.쫓아내(cat);
    }
}
