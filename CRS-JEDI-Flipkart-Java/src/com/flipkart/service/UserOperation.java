/**
 * 
 */
package com.flipkart.service;

import com.flipkart.dao.UserDaoInterface;
import com.flipkart.dao.UserDaoOperation;
import com.flipkart.exception.UserNotFoundException;

/**
 * @author Ananya Varma
 *
 */

public class UserOperation implements UserInterface {
	private static volatile UserOperation instance=null;
	UserDaoInterface userDaoInterface= UserDaoOperation.getInstance();
	public static UserOperation getInstance()
	{
		if(instance==null)
		{
			// This is a synchronized block, when multiple threads will access this instance
			synchronized(UserOperation.class){
				instance=new UserOperation();
			}
		}
		return instance;
	}
	@Override
	public boolean updatePassword(String userID, String newPassword) {
		// TODO Auto-generated method stub
		return userDaoInterface.updatePassword(userID, newPassword);
	}

	@Override
	public boolean verifyCredentials(String userID, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		try
		{
			return userDaoInterface.verifyCredentials(userID, password);
		}
		finally
		{

		}
	}

	@Override
	public String getRole(String userId) {
		// TODO Auto-generated method stub
		return userDaoInterface.getRole(userId);
	}

}
