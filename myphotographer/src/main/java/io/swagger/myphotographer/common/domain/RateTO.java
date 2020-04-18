package io.swagger.myphotographer.common.domain;

import io.swagger.myphotographer.common.abstr.AbstractTO;

public class RateTO extends AbstractTO{
	private PhotographerTO photographer;
	private UserTO user;
	private int rateValue;
	private String comment;
	
	public RateTO() {
		
	}
	
	public RateTO(PhotographerTO photographer, UserTO user, int rateValue, String comment) {
		super();
		this.photographer = photographer;
		this.user = user;
		this.rateValue = rateValue;
		this.comment = comment;
	}

	public PhotographerTO getPhotographer() {
		return photographer;
	}

	public void setPhotographer(PhotographerTO photographer) {
		this.photographer = photographer;
	}

	public UserTO getUser() {
		return user;
	}

	public void setUser(UserTO user) {
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

