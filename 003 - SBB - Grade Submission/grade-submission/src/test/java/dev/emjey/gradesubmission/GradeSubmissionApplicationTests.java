package dev.emjey.gradesubmission;

import dev.emjey.gradesubmission.controller.GradeSubmissionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// This file is made by EmJey
// Project: GradeSubmission.java
// FileName: GradeSubmissionApplicationTests.java
// Date: 2023/09/11
// Modified Date: 2023/12/06
// Email: emjeydev@gmail.com
// Github: emjeydev

@SpringBootTest
@AutoConfigureMockMvc
class GradeSubmissionApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
        assertNotNull(mockMvc);
    }

    @Test
    public void showGradeFormTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/?id=123");

        mockMvc.perform(request)
                .andExpect(status().is2xxSuccessful())
                .andExpect(view().name("form"))
                .andExpect(model().attributeExists("grade"));
    }

    @Test
    public void successfulSubmissionTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
                .param("name", "EmJey")
                .param("subject", "Data Structure")
                .param("score", "A+");

        mockMvc.perform(request)
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/grades"));
    }

    @Test
    public void unsuccessfulSubmissionTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
                .param("name", "  ")
                .param("subject", "      ")
                .param("score", "R++");

        mockMvc.perform(request)
                .andExpect(status().is2xxSuccessful())
                .andExpect(view().name("form"));
    }

    @Test
    public void getGradesTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/grades");

        mockMvc.perform(request)
                .andExpect(status().is2xxSuccessful())
                .andExpect(view().name("grades"))
                .andExpect(model().attributeExists("grades"));
    }

}
