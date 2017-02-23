package com.nabenik.heaven.rest;

public class MovieDTO {
	private String title;
	private int year;
	private String link;
	
	public MovieDTO(String title, int year, String link) {
		super();
		this.title = title;
		this.year = year;
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "MovieDTO [title=" + title + ", year=" + year + ", link=" + link + "]";
	}
	
	

	
	
	
}
