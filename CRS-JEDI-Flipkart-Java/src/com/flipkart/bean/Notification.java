/**
 * 
 */
package com.flipkart.bean;

import com.flipkart.constant.NotificationType;

/**
 * @author Ananya Varma
 *
 */
public class Notification {
	
	private int notificationID;
	private int studentID;
	private NotificationType type;
	private String referenceID;
	
	
	/**
	 * @param notificationID
	 * @param studentID
	 * @param type
	 * @param referenceID
	 */
	public Notification(int notificationID, int studentID, NotificationType type, String referenceID) {
		super();
		this.notificationID = notificationID;
		this.studentID = studentID;
		this.type = type;
		this.referenceID = referenceID;
	}
	
	/**
	 * @return the notificationID
	 */
	public int getNotificationID() {
		return notificationID;
	}
	/**
	 * @param notificationID the notificationID to set
	 */
	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
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
	 * @return the type
	 */
	public NotificationType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(NotificationType type) {
		this.type = type;
	}
	/**
	 * @return the referenceID
	 */
	public String getReferenceID() {
		return referenceID;
	}
	/**
	 * @param referenceID the referenceID to set
	 */
	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}
	
	
}
