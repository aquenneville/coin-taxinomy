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

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;



@RestController
@RequestMapping("/api/articles")
public class RestArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Article> getAllKeywordAssetArticles() {		
		
		return articleService.getAllArticles();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public Article getAssetById(@PathVariable("id")int id) {		 
		return articleService.getArticleById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteAssetById(@PathVariable("id") int id, HttpServletResponse response) {
		articleService.deleteArticleById(id);		
		//return "redirect:/";
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAsset(@RequestBody Article article) {
		articleService.updateArticle(article);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertAsset(@RequestBody Article article, HttpServletResponse response) {
		articleService.insertArticle(article);
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
