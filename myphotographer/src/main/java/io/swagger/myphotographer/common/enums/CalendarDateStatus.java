package io.swagger.myphotographer.common.enums;

public enum CalendarDateStatus {
	AVAILABLE ("available"),
	UNAVAILABLE ("unavailable");
	
	private String status; 
	  
    public String getStatus() 
    { 
        return this.status; 
    } 
  
    private CalendarDateStatus(String status) 
    { 
        this.status = status; 
    } 
}
