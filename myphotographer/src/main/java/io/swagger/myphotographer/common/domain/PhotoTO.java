package io.swagger.myphotographer.common.domain;



import io.swagger.myphotographer.common.abstr.AbstractTO;


public class PhotoTO extends AbstractTO{
	private String path;
	private PhotographerTO photographer;
	
	public PhotoTO() {
		
	}

	public PhotoTO(String path, PhotographerTO photographer) {
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

	public PhotographerTO getPhotographer() {
		return photographer;
	}

	public void setPhotographer(PhotographerTO photographer) {
		this.photographer = photographer;
	}
	
}

