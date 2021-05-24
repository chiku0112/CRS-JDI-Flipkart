/**
 * 
 */
package com.flipkart.bean;

/**
 * @author Ananya Varma
 *
 */
public class EnrolledStudent {
	
	private String courseCode;
	private String courseName;
	private int studentID;
	
	
	/**
	 * @param courseCode
	 * @param courseName
	 * @param studentID
	 */
	public EnrolledStudent(String courseCode, String courseName, int studentID) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.studentID = studentID;
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
	
	

}
