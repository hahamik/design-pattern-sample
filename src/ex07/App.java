package ex07;

import ex07.teacher.LectureDelegator;
import ex07.teacher.LectureType;

public class App {
    public static void main(String[] args) {
//        // 단일 진입점을 만들면
//        MathTeacher mathTeacher = new MathTeacher();
//        mathTeacher.doLecture();
//        HistoryTeacher historyTeacher = new HistoryTeacher();
//        historyTeacher.doLecture();

        LectureDelegator lectureDelegator = new LectureDelegator();

        // 수학
        lectureDelegator.delegateLecture(LectureType.MATH);

        // 역사
        lectureDelegator.delegateLecture(LectureType.HISTORY);
    }
}
