package com.mysite.sbb.question;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionTests {
	
	@Autowired
    private QuestionRepository questionRepository;

	@Test
    void testJpa() {        
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        this.questionRepository.save(q1);  // 첫번째 질문 저장
    }
}
