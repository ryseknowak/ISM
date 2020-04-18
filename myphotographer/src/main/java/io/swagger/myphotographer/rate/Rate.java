package io.swagger.myphotographer.rate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.myphotographer.common.abstr.AbstractEntity;
import io.swagger.myphotographer.photographer.Photographer;
import io.swagger.myphotographer.user.User;

@Entity
@Table(name = "RATE")
public class Rate extends AbstractEntity {

	@ManyToOne
	@JoinColumn (nullable = false)
	private Photographer photographer;
	
	@ManyToOne
	@JoinColumn (nullable = false)
	private User user;
	
	@Column (name = "rate_value", nullable = false)
	private int rateValue;
	
	private String comment;
	
	public Rate() {
		
	}
	
	public Rate(Photographer photographer, User user, int rateValue, String comment) {
		super();
		this.photographer = photographer;
		this.user = user;
		this.rateValue = rateValue;
		this.comment = comment;
	}

	public Photographer getPhotographer() {
		return photographer;
	}

	public void setPhotographer(Photographer photographer) {
		this.photographer = photographer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRateValue() {
		return rateValue;
	}

	public void setRateValue(int rateValue) {
		this.rateValue = rateValue;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
