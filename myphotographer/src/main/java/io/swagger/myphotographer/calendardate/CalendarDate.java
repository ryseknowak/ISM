package io.swagger.myphotographer.calendardate;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.myphotographer.common.abstr.AbstractEntity;
import io.swagger.myphotographer.common.enums.CalendarDateStatus;
import io.swagger.myphotographer.photographer.Photographer;

@Entity
public class CalendarDate extends AbstractEntity {

	@ManyToOne
	@JoinColumn(nullable = false)
	private Photographer photographer;
	
	@Column(nullable = false)
	private LocalDateTime date;
	
	private String note;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CalendarDateStatus status;
	
	public CalendarDate() {
		
	}

	public CalendarDate(Photographer photographer, LocalDateTime date, String note, CalendarDateStatus status) {
		super();
		this.photographer = photographer;
		this.date = date;
		this.note = note;
		this.status = status;
	}

	public Photographer getPhotographer() {
		return photographer;
	}

	public void setPhotographer(Photographer photographer) {
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
