package ex05;

import ex05.teacher.*;

public class App {
    public static void main(String[] args) {
        Teacher t1 = new JavaTeacher();
        t1.수업시작();

        Teacher t2 = new PythonTeacher();
        t2.수업시작();

        Teacher t3 = new HTMLTeacher();
        t3.수업시작();

        Teacher t4 = new SpringTeacher();
        t4.수업시작();
    }
}
