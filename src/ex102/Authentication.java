package ex102;

public class Authentication {

    public KakaoProfile kakaoLogin() {
        System.out.println("카카오 로그인 완료");
        return new KakaoProfile(1, "ssar");
    }

    public GoogleProfile googleLogin() {
        System.out.println("구글 로그인 완료");
        return new GoogleProfile(500, "cos");
    }
}