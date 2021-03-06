/**
 * 
 */
package models.apidatas;

import models.User;

/**
 * @author Christophe
 * 
 */
public class UserData {
	private User user;

	/**
	 * @param user the user
	 */
	public UserData(User user) {
		super();
		this.user = user;
	}
	
	public Long getId() {
		return user.id;
	}
	
	public String getFirstName() {
		return user.firstName;
	}
	
	public String getLastName() {
		return user.lastName;
	}
	
	public String getEmail() {
		return user.email;
	}
	
	public String getPicture() {
		return user.picture;
	}

}
