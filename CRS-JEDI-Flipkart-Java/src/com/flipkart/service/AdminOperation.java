/**
 * 
 */
package com.flipkart.service;

import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.dao.AdminDaoInterface;
import com.flipkart.dao.AdminDaoOperation;
import com.flipkart.exception.*;
import com.flipkart.validator.AdminValidator;

/**
 * @author Ananya Varma
 *
 */
public class AdminOperation implements AdminInterface{
	private static volatile AdminOperation instance = null;
	public static AdminOperation getInstance()
	{
		if(instance == null)
		{
			synchronized(AdminOperation.class){
				instance = new AdminOperation();
			}
		}
		return instance;
	}
	AdminDaoInterface adminDaoOperation = AdminDaoOperation.getInstance();
	@Override
	public void deleteCourse(String courseCode, List<Course> courseList)
			throws CourseNotFoundException, CourseNotDeletedException {
		// TODO Auto-generated method stub
		if(!AdminValidator.isValidDropCourse(courseCode, courseList)) {
			System.out.println("courseCode: " + courseCode + " not present in catalog!");
			throw new CourseNotFoundException(courseCode);
		}

		try {
			adminDaoOperation.deleteCourse(courseCode);
		}
		catch(CourseNotFoundException | CourseNotDeletedException e) {
			throw e;
		}
	}

	@Override
	public void addCourse(Course newCourse, List<Course> courseList) throws CourseFoundException {
		// TODO Auto-generated method stub
		if(!AdminValidator.isValidNewCourse(newCourse, courseList)) {
			System.out.println("courseCode: " + newCourse.getCourseCode() + " already present in catalog!");
			throw new CourseFoundException(newCourse.getCourseCode());
		}

		try {
			adminDaoOperation.addCourse(newCourse);
		}
		catch(CourseFoundException e) {
			throw e;
		}
	}

	@Override
	public List<Student> viewPendingAdmissions() {
		// TODO Auto-generated method stub
		return adminDaoOperation.viewPendingAdmissions();
	}

	@Override
	public void approveStudent(int studentId, List<Student> studentList) throws StudentNotFoundForApprovalException {
		// TODO Auto-generated method stub
		if(!AdminValidator.isValidUnapprovedStudent(studentId, studentList)) {
			//logger.error("studentId: " + studentId + " is already approvet/not-present!");
			throw new StudentNotFoundForApprovalException(studentId);
		}

		try {
			adminDaoOperation.approveStudent(studentId);
		}
		catch(StudentNotFoundForApprovalException e) {
			throw e;
		}
	}

	@Override
	public void addProfessor(Professor professor) throws ProfessorNotAddedException, UserIdAlreadyInUseException {
		// TODO Auto-generated method stub
		try {
			adminDaoOperation.addProfessor(professor);
		}
		catch(ProfessorNotAddedException | UserIdAlreadyInUseException e) {
			throw e;
		}

	}

	@Override
	public void assignCourse(String courseCode, String professorId)
			throws CourseNotFoundException, UserNotFoundException {
		// TODO Auto-generated method stub
		try {
			adminDaoOperation.assignCourse(courseCode, professorId);
		}
		catch(CourseNotFoundException | UserNotFoundException e) {
			throw e;
		}
	}

	@Override
	public List<Course> viewCourses(int catalogId) {
		// TODO Auto-generated method stub
		return adminDaoOperation.viewCourses(catalogId);
	}

	@Override
	public List<Professor> viewProfessors() {
		// TODO Auto-generated method stub
		return adminDaoOperation.viewProfessors();
	}
	
	
}
