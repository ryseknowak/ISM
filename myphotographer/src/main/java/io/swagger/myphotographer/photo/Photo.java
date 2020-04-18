package io.swagger.myphotographer.photo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.myphotographer.common.abstr.AbstractEntity;
import io.swagger.myphotographer.photographer.Photographer;

@Entity
@Table(name = "PHOTO")
public class Photo extends AbstractEntity {

	@Column(name = "path", nullable = false)
	private String path;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Photographer photographer;

	public Photo() {

	}

	public Photo(String path, Photographer photographer) {
		super();
		this.path = path;
		this.photographer = photographer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Photographer getPhotographer() {
		return photographer;
	}

	public void setPhotographer(Photographer photographer) {
		this.photographer = photographer;
	}

}
