package io.swagger.myphotographer.common.domain;

import java.time.LocalDateTime;

import io.swagger.myphotographer.common.abstr.AbstractTO;

public class RequestTO extends AbstractTO {
	private UserTO user;
	private PhotographerTO photographer;
	private String message;
	private LocalDateTime date;
	private LocalDateTime postDate;
	private boolean viewed;
	
	public RequestTO() {
		
	}

	public RequestTO(UserTO user, PhotographerTO photographer, String message, LocalDateTime date, LocalDateTime postDate,
			boolean viewed) {
		super();
		this.user = user;
		this.photographer = photographer;
		this.message = message;
		this.date = date;
		this.postDate = postDate;
		this.viewed = viewed;
	}

	public UserTO getUser() {
		return user;
	}

	public void setUser(UserTO user) {
		this.user = user;
	}

	public PhotographerTO getPhotographer() {
		return photographer;
	}

	public void setPhotographer(PhotographerTO photographer) {
		this.photographer = photographer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public LocalDateTime getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}

	public boolean isViewed() {
		return viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
}

