package dev.emjey.gradesubmission.Repository;

import dev.emjey.gradesubmission.Grade;

import java.util.ArrayList;
import java.util.List;

public class GradeSubmissionRepository {

    private List<Grade> studentList = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentList.get(index);
    }

    public void addGrade(Grade grade) {
        studentList.add(grade);
    }

    public void updateGrade(Grade grade, int index) {
        studentList.set(index,grade);
    }

    public List<Grade> getGrades() {
        return studentList;
    }
}
