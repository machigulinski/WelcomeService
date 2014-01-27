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
	return this.currentTime + " " + this.guestName;
    }
    
    public void setGuestName(String guestName) {
	this.guestName = guestName;
    
    }
    
    
	
	
	
    }
