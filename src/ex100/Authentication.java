package ex100;

public class Authentication {

    public void oauthLogin(Profile profile) {
        System.out.println(profile.getId() + " " + profile.getName() + "로그인 완료");
    }
}