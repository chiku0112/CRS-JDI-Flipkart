/**
 * 
 */
package com.flipkart.bean;

/**
 * @author Ananya Varma
 *
 */
public class StudentGrade {
	
	private String courseCode;
	private String courseName;
	private String grade;
	
	/**
	 * @param courseCode
	 * @param courseName
	 * @param grade
	 */
	public StudentGrade(String courseCode, String courseName, String grade) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.grade = grade;
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
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
