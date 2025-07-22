package ex100;

public class FacebookProfile extends Profile {
    private int uId;
    private String uName;

    public FacebookProfile(int uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    @Override
    public int getId() {
        return uId;
    }

    @Override
    public String getName() {
        return uName;
    }
}