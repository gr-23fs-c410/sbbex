package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class SbbexApplicationTests {
	
	@Autowired
    private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
	}

	@Test
    void testJpa() {
        Optional<Question> oa = this.questionRepository.findById(1);
        assertTrue(oa.isPresent());
    }
}
