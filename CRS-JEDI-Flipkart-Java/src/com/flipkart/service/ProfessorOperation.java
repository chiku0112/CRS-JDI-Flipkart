/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.EnrolledStudent;
import com.flipkart.exception.GradeNotAddedException;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Ananya Varma
 *
 */
public class ProfessorOperation implements ProfessorInterface {

	@Override
	public boolean addGrade(int studentId, String courseCode, String grade) throws GradeNotAddedException {
		return false;
	}

	@Override
	public List<EnrolledStudent> viewEnrolledStudents(String profId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getCourses(String profId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProfessorById(String profId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
