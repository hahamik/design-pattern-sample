package ex100;

import java.util.Scanner;

// FacebookProfile -> uId, uName (이게 추가될때 기존 코드를 손되지 않을 수 있게 하는게 목표)
public class App {

    static void mainPage(String username) {
        System.out.println("로그인 하신 아이디는 " + username + " 입니다.");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String provider = sc.nextLine();

        Authentication auth = new Authentication();
        auth.oauthLogin(new GoogleProfile(1, "ssar"));
    }
}