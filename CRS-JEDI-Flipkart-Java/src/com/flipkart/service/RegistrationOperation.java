/**
 * 
 */
package com.flipkart.service;

import java.sql.SQLException;
import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.StudentGrade;
import com.flipkart.exception.CourseLimitExceedException;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.SeatNotAvailableException;

/**
 * @author Ananya Varma
 *
 */
public class RegistrationOperation implements RegistrationInterface {

	@Override
	public boolean addCourse(String courseCode, int studentId, List<Course> courseList)

			throws CourseNotFoundException, CourseLimitExceedException, SeatNotAvailableException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dropCourse(String courseCode, int studentId, List<Course> registeredCourseList)
			throws CourseNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> viewCourses(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> viewRegisteredCourses(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentGrade> viewGradeCard(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateFee(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getRegistrationStatus(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRegistrationStatus(int studentId) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
