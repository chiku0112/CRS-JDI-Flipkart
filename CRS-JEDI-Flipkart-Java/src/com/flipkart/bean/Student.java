/**
 * 
 */
package com.flipkart.bean;

import com.flipkart.constant.Role;

/**
 * @author Ananya Varma
 *
 */
public class Student extends User{
	
	private String branchName;
	private int studentID;
	private int batch;
	private boolean isApproved;

	/**
	 * @param userID
	 * @param name
	 * @param role
	 * @param password
	 * @param address
	 */
	public Student(String userID, String name, Role role, String password, String address) {
		super(userID, name, role, password, address);
	}


	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the batch
	 */
	public int getBatch() {
		return batch;
	}
	/**
	 * @param batch the batch to set
	 */
	public void setBatch(int batch) {
		this.batch = batch;
	}
	/**
	 * @return the isApproved
	 */
	public boolean isApproved() {
		return isApproved;
	}
	/**
	 * @param isApproved the isApproved to set
	 */
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
	
	
}
