package emjey.dev.workbookfivepointone.repository;

import java.util.ArrayList;
import java.util.List;

import emjey.dev.workbookfivepointone.pojo.Grade;

// This file is made by EmJey
// Project: Workbook 5.1
// FileName: GradeRepository.java
// Date: 2023/12/02
// Modified Date: 2023/1/02
// Email: emjeydev@gmail.com
// Github: emjeydev

public class GradeRepository {

    private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentGrades.get(index);
    }

    public void addGrade(Grade grade) {
        studentGrades.add(grade);
    }

    public void updateGrade(Grade grade, int index) {
        studentGrades.set(index, grade);
    }

    public List<Grade> getGrades() {
        return studentGrades;
    }

}
