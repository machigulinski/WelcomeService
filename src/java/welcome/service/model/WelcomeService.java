package welcome.service.model;

/**
 *
 * @author Machi
 */
public class WelcomeService {
    
    private String guestName;
    
    
    public WelcomeService(String guestName) {
	this.guestName = guestName;
    
    }
    public String getGuestName() {    
	return "Hello" + this.guestName;
    }
    
}
