package welcome.service.model;

import org.joda.time.DateTime;

/**
 *
 * @author Machi
 */
public final class WelcomeService {
    
    private String guestName;
    public DateTime currentTime;
    
    
    public WelcomeService(String guestName) {
	this.currentTime = new DateTime();
	setGuestName(guestName);
    
    }
    public String outputWelcomeMessage() {    
	return this.getWelcomeMessage() + ", " + this.guestName;
    }
    
    public void setGuestName(String guestName) {
	this.guestName = guestName;
    
    }
    
    public String getWelcomeMessage() {
	String msg = null;
	int hourNow = this.currentTime.getHourOfDay();
	
	if(hourNow > 0 && hourNow < 12) {	    
	    msg = "Good Morning";
	} else if(hourNow > 17 && hourNow < 20) {
	    msg = "Good Afternoon";    
	} else   {	    
	    msg = "Good Evening";
	}
	
	return msg;
    
    }
  
}
