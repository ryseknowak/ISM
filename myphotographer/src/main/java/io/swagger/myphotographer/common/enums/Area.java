package io.swagger.myphotographer.common.enums;

public enum Area {
	DOLNOSLASKIE ("Dolnośląskie"),
	KUJAWSKO_POMORSKIE ("Kujawsko-Pomorskie");
			
    private String areaName; 
  
    public String getAreaName() 
    { 
        return this.areaName; 
    } 
  
    private Area(String areaName) 
    { 
        this.areaName = areaName; 
    } 
}
