package com.example.demo.model;

import java.nio.file.Path;
import java.time.LocalDate;

public class Article {

	private long id;
	private String title;
	private LocalDate articleDate;
	private String url;
	private Path path;
	private String summary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getArticleDate() {
		return articleDate;
	}
	public void setArticleDate(LocalDate articleDate) {
		this.articleDate = articleDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
