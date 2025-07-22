package ex02;


public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();

        DoormanProxy doormanProxy = new DoormanProxy(new Doorman());
        doormanProxy.쫓아내(mouse);
        doormanProxy.쫓아내(cat);
    }
}
