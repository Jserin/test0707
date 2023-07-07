package com.ll.test0707;

import com.ll.test0707.Board.Article;
import com.ll.test0707.Board.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Test0707ApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void contextLoads() {
		Article a = new Article();
		a.setSubject("테스트");
		a.setContent("테스트내용");
		a.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a);
	}

}
