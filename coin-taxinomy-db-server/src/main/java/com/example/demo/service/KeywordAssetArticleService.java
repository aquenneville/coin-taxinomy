package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.KeywordAssetArticle;
import com.example.demo.persistence.KeywordAssetArticleMapper;

@Component
public class KeywordAssetArticleService {
		
	@Autowired
	private KeywordAssetArticleMapper keywordAssetArticleMapper;
	
	public Collection<KeywordAssetArticle> getAllKeywordAssetArticles() {
		return this.keywordAssetArticleMapper.selectAll();
	}
	
	public KeywordAssetArticle getKeywordAssetArticleById(int id) {
		return this.keywordAssetArticleMapper.selectById(id);
	}

	public void deleteKeywordAssetArticleById(int id) {
		this.keywordAssetArticleMapper.deleteById(id);
	}
	
	public void updateKeywordAssetArticle(KeywordAssetArticle keywordAssetArticle) {				
		this.keywordAssetArticleMapper.update(keywordAssetArticle);
	}

	public void insertKeywordAssetArticle(KeywordAssetArticle keywordAssetArticle) {
		this.keywordAssetArticleMapper.insert(keywordAssetArticle);		
	}
}
