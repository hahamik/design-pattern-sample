package ex102;

public class FacebookProfile {
    private int uId;
    private String uName;

    public FacebookProfile(int uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    public String getuName() {
        return uName;
    }

    public int getuId() {
        return uId;
    }
}