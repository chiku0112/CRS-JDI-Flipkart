/**
 * 
 */
package com.flipkart.service;

/**
 * @author Ananya Varma
 *
 */

public class StudentOperation implements StudentInterface {

	@Override
	public int register(String name, String userID, String password, Gender gender, int batch, String branch,
			String address, String country) throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStudentId(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isApproved(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
