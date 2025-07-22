package ex100;

public class KakaoProfile extends Profile {
    private int sub;
    private String name;

    public KakaoProfile(int sub, String name) {
        this.sub = sub;
        this.name = name;
    }

    @Override
    public int getId() {
        return sub;
    }

    @Override
    public String getName() {
        return name;
    }
}