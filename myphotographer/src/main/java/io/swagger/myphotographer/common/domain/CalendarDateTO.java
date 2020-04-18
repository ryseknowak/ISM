package io.swagger.myphotographer.common.domain;

import io.swagger.myphotographer.common.abstr.AbstractTO;
import io.swagger.myphotographer.common.enums.CalendarDateStatus;

import java.time.LocalDateTime;

public class CalendarDateTO extends AbstractTO {
	private PhotographerTO photographer;
	private LocalDateTime date;
	private String note;
	private CalendarDateStatus status;
	
	public CalendarDateTO() {
		
	}

	public CalendarDateTO(PhotographerTO photographer, LocalDateTime date, String note, CalendarDateStatus status) {
		super();
		this.photographer = photographer;
		this.date = date;
		this.note = note;
		this.status = status;
	}

	public PhotographerTO getPhotographer() {
		return photographer;
	}

	public void setPhotographer(PhotographerTO photographer) {
		this.photographer = photographer;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public CalendarDateStatus getStatus() {
		return status;
	}

	public void setStatus(CalendarDateStatus status) {
		this.status = status;
	}
}

