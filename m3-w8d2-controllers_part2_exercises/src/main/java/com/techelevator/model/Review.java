package com.techelevator.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Review {
	private Long id;
	
	@NotBlank (message="Your username is required")
	private String username;
	
	@Min(value=0, message="You cannot submit less than 0 stars") @Max(value=5, message="You cannot rate higher than 5 stars") 
	private int rating;
	
	@NotBlank (message="Please include a title for your review")
	private String title;
	
	@NotBlank (message="Please write a review before you submit.")
	private String text;
	private LocalDateTime dateSubmitted;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(LocalDateTime dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
}
