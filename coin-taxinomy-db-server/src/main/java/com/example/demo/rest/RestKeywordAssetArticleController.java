package com.example.demo.rest;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.KeywordAssetArticle;
import com.example.demo.service.KeywordAssetArticleService;



@RestController
@RequestMapping("/keyword-asset-articles")
public class RestKeywordAssetArticleController {
	
	@Autowired
	private KeywordAssetArticleService keywordAssetArticleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<KeywordAssetArticle> getAllKeywordAssetArticles() {		
		
		return keywordAssetArticleService.getAllKeywordAssetArticles();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public KeywordAssetArticle getKeywordAssetArticleById(@PathVariable("id")int id) {		 
		return keywordAssetArticleService.getKeywordAssetArticleById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteKeywordAssetArticleById(@PathVariable("id") int id, HttpServletResponse response) {
		keywordAssetArticleService.deleteKeywordAssetArticleById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateKeywordAssetArticle(@RequestBody KeywordAssetArticle keywordAssetArticle) {
		keywordAssetArticleService.updateKeywordAssetArticle(keywordAssetArticle);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertKeywordAssetArticle(@RequestBody KeywordAssetArticle keywordAssetArticle, HttpServletResponse response) {
		keywordAssetArticleService.insertKeywordAssetArticle(keywordAssetArticle);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
