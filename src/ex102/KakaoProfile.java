package ex102;

public class KakaoProfile {
    private int sub;
    private String name;

    public KakaoProfile(int sub, String name) {
        this.sub = sub;
        this.name = name;
    }

    public int getSub() {
        return sub;
    }

    public String getName() {
        return name;
    }
}