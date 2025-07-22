package ex101;

public class KakaoAdapter extends Profile {
    private KakaoProfile kakaoProfile;

    public KakaoAdapter(KakaoProfile kakaoProfile) {
        this.kakaoProfile = kakaoProfile;
    }

    @Override
    public int getId() {
        return kakaoProfile.getSub();
    }

    @Override
    public String getName() {
        return kakaoProfile.getName();
    }
}
