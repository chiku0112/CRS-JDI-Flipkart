/**
 * 
 */
package com.flipkart.constant;

/**
 * @author Ananya Varma
 *
 */
public enum Role {
	
	ADMIN,PROFESSOR,STUDENT;
	
	/**
	 * Method to get Role object from String
	 * @param role
	 * @return Role object
	 */
	public static Role stringToName(String role) {
		
		Role userRole = null;
		
		if(role.equalsIgnoreCase("Admin"))
			userRole = Role.ADMIN;
		
		else if(role.equalsIgnoreCase("Professor"))
			userRole = Role.PROFESSOR;
		
		else if(role.equalsIgnoreCase("Student"))
			userRole = Role.STUDENT;
		
		return userRole;
		
	}

}
