/**
 * 
 */
package com.flipkart.service;

import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.exception.*;

/**
 * @author Ananya Varma
 *
 */
public class AdminOperation implements AdminInterface{

	@Override
	public void deleteCourse(String courseCode, List<Course> courseList)
			throws CourseNotFoundException, CourseNotDeletedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourse(Course course, List<Course> courseList) throws CourseFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> viewPendingAdmissions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void approveStudent(int studentId, List<Student> studentList) throws StudentNotFoundForApprovalException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProfessor(Professor professor) throws ProfessorNotAddedException, UserIdAlreadyInUseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignCourse(String courseCode, String professorId)
			throws CourseNotFoundException, UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> viewCourses(int catalogId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professor> viewProfessors() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
