/**
 * 
 */
package com.flipkart.bean;

/**
 * @author Ananya Varma
 *
 */
public class Course {
	
	private String courseCode;
	private String courseName;
	private String instructorID;
	private int seats = 10;
	
	
	/**
	 * @param courseCode
	 * @param courseName
	 * @param instructorID
	 * @param seats
	 */
	public Course(String courseCode, String courseName, String instructorID, int seats) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructorID = instructorID;
		this.seats = seats;
	}
	
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the instructorID
	 */
	public String getInstructorID() {
		return instructorID;
	}
	/**
	 * @param instructorID the instructorID to set
	 */
	public void setInstructorID(String instructorID) {
		this.instructorID = instructorID;
	}
	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}
	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}
