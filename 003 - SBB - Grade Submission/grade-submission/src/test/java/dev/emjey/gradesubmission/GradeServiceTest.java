package dev.emjey.gradesubmission;

import dev.emjey.gradesubmission.pojo.Grade;
import dev.emjey.gradesubmission.repository.GradeSubmissionRepository;
import dev.emjey.gradesubmission.service.GradeSubmissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {

    @Mock
    private GradeSubmissionRepository gradeSubmissionRepository;

    @InjectMocks
    private GradeSubmissionService gradeSubmissionService;

    @Test
    public void getGradesFromRepoTest() {

//        Arrange
        when(gradeSubmissionRepository.getGrades()).thenReturn(Arrays.asList(
                new Grade("Harry", "Math", "A+"),
                new Grade("Smile", "Chemistry", "B+")
        ));

//        Act
        List<Grade> result = gradeSubmissionService.getGrades();

//        Assert
        assertEquals("Harry", result.get(0).getName());
        assertEquals("Chemistry", result.get(1).getSubject());
    }

    @Test
    public void gradeIndexTest() {
        Grade grade = new Grade("Harry", "Math", "A+");

        when(gradeSubmissionRepository.getGrades()).thenReturn(Arrays.asList(grade));

        int valid = gradeSubmissionService.getGradeIndex(grade.getId());
        int invalid = gradeSubmissionService.getGradeIndex("123");

        assertEquals(0, valid);
        assertEquals(Constants.NOT_FOUND, invalid);
    }

    @Test
    public void returnGradeById() {
        Grade grade = new Grade("Harry", "Math", "A+");

        when(gradeSubmissionRepository.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeSubmissionRepository.getGrade(0)).thenReturn(grade);

        String id = grade.getId();
        Grade result = gradeSubmissionService.getGradeById(id);

        assertEquals(grade, result);
    }

    @Test
    public void addGradeTest() {
        Grade newGrade = new Grade("EmJey", "Programming", "A+");
        gradeSubmissionService.addGrade(newGrade);

        verify(gradeSubmissionRepository, times(1)).addGrade(newGrade);
    }

    @Test
    public void updateGradeTest() {
        Grade grade = new Grade("Harry", "Math", "B+");

        when(gradeSubmissionRepository.getGrades()).thenReturn(Arrays.asList(grade));

        grade.setScore("A-");
        gradeSubmissionService.submitGrade(grade);

        verify(gradeSubmissionRepository, times(1)).updateGrade(grade, 0);
    }
}
