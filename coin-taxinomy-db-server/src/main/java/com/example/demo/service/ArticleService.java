package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Article;
import com.example.demo.persistence.ArticleMapper;

public class ArticleService {
	
	@Autowired
	private ArticleMapper articleMapper;
	
	public Collection<Article> getAllArticles() {
		return this.articleMapper.selectAll();
	}
	
	public Article getArticleById(int id) {
		return this.articleMapper.selectById(id);
	}

	public void deleteArticleById(int id) {
		this.articleMapper.deleteById(id);
	}
	
	public void updateArticle(Article Article) {				
		this.articleMapper.update(Article);
	}

	public void insertArticle(Article Article) {
		this.articleMapper.insert(Article);		
	}
}
