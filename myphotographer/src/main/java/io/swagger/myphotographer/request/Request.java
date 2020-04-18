package io.swagger.myphotographer.request;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.myphotographer.common.abstr.AbstractEntity;
import io.swagger.myphotographer.photographer.Photographer;
import io.swagger.myphotographer.user.User;

@Entity
@Table(name = "REQUEST")
public class Request extends AbstractEntity {

	@ManyToOne
	@JoinColumn (nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn (nullable = false)
	private Photographer photographer;
	
	private String message;
	
	private LocalDateTime date;
	
	@Column (name = "post_date", nullable = false)
	private LocalDateTime postDate;
	
	private boolean viewed;
	
	public Request() {
		
	}

	public Request(User user, Photographer photographer, String message, LocalDateTime date, LocalDateTime postDate,
			boolean viewed) {
		super();
		this.user = user;
		this.photographer = photographer;
		this.message = message;
		this.date = date;
		this.postDate = postDate;
		this.viewed = viewed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Photographer getPhotographer() {
		return photographer;
	}

	public void setPhotographer(Photographer photographer) {
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
