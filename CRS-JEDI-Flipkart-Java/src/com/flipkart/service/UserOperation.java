/**
 * 
 */
package com.flipkart.service;

import com.flipkart.exception.UserNotFoundException;

/**
 * @author Ananya Varma
 *
 */

public class UserOperation implements UserInterface {

	@Override
	public boolean updatePassword(String userID, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyCredentials(String userID, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getRole(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
