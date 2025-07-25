package ex07.teacher;

import java.util.ArrayList;
import java.util.List;

public class LectureDelegator {
    private List<Teacher> teachers = new ArrayList<>();

    public LectureDelegator() {
        teachers.add(new MathTeacher());
        teachers.add(new HistoryTeacher());
    }

    public void delegateLecture(LectureType lectureType) {
        // 공통 로직 수행
        teachers.stream()
                .filter(teacher -> teacher.isSameLecture(lectureType))
                .forEach(teacher -> teacher.doLecture());
    }
}
