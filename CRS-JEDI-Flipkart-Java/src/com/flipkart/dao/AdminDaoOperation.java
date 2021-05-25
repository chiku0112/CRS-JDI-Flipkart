/**
 * 
 */
package com.flipkart.dao;

/**
 * @author Ananya Varma
 *
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
import com.flipkart.constant.Gender;
import com.flipkart.constant.Role;
import com.flipkart.constant.SQLQueriesConstants;
import com.flipkart.exception.CourseFoundException;
import com.flipkart.exception.CourseNotDeletedException;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.ProfessorNotAddedException;
import com.flipkart.exception.StudentNotFoundForApprovalException;
import com.flipkart.exception.UserIdAlreadyInUseException;
import com.flipkart.exception.UserNotAddedException;
import com.flipkart.exception.UserNotFoundException;
import com.flipkart.utils.DBUtils;


/**
 * @author JEDI-03
 * Dao Class Operations for Admin
 * 
 */
public class AdminDaoOperation implements AdminDaoInterface{

	private static volatile AdminDaoOperation instance = null;
	
	private PreparedStatement statement = null;
	
	/**
	 * Default Constructor
	 */
	private AdminDaoOperation(){}
	
	/**
	 * Method to make AdminDaoOperation Singleton
	 * @return
	 */
	public static AdminDaoOperation getInstance()
	{
		if(instance == null)
		{
			synchronized(AdminDaoOperation.class){
				instance = new AdminDaoOperation();
			}
		}
		return instance;
	}
	
	Connection connection = DBUtils.getConnection();
	
	/**
	 * Delete Course using SQL commands
	 * @param courseCode
	 * @throws CourseNotFoundException
	 * @throws CourseNotDeletedException 
	 */
	@Override
	public void deleteCourse(String courseCode) throws CourseNotFoundException, CourseNotDeletedException{
		
		statement = null;
		try {
			String sql = SQLQueriesConstants.DELETE_COURSE_QUERY;
			statement = connection.prepareStatement(sql);
			
			statement.setString(1,courseCode);
			int row = statement.executeUpdate();
			
			
			if(row == 0) {
				
				throw new CourseNotFoundException(courseCode);
			}

			
			
		}catch(SQLException se) {
			

			throw new CourseNotDeletedException(courseCode);
		}
		
	}

	/**
	 * Add Course using SQL commands
	 * @param course
	 * @throws CourseFoundException
	 */
	@Override
	public void addCourse(Course course) throws CourseFoundException{
		
		statement = null;
		try {
			
			String sql = SQLQueriesConstants.ADD_COURSE_QUERY;
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, course.getCourseCode());
			statement.setString(2, course.getCourseName());
			
			statement.setInt(3, 1);
			int row = statement.executeUpdate();
			
			
			if(row == 0) {
				
				throw new CourseFoundException(course.getCourseCode());
			}
			
			
			
		}catch(SQLException se) {
			
			
			throw new CourseFoundException(course.getCourseCode());
			
		}
		
	}

	/**
	 * Fetch Students yet to approved using SQL commands
	 * @return List of Students yet to approved
	 */
	@Override
	public List<Student> viewPendingAdmissions() {
		
		statement = null;
		List<Student> userList = new ArrayList<Student>();
		try {
			
			String sql = SQLQueriesConstants.VIEW_PENDING_ADMISSION_QUERY;
			statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			while(resultSet.next()) {
				
				Student user = new Student();
				user.setUserID(resultSet.getString(1));
				user.setName(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				user.setRole(Role.stringToName(resultSet.getString(4)));
				user.setGender(Gender.stringToGender( resultSet.getString(5)));
				user.setAddress(resultSet.getString(6));
				user.setCountry(resultSet.getString(7));
				user.setStudentId(resultSet.getInt(8));
				userList.add(user);
				
			}
			
			
			
		}catch(SQLException se) {
			
			
			
		}
		
		return userList;
		
	}

	/**
	 * Approve Student using SQL commands
	 * @param studentId
	 * @throws StudentNotFoundException
	 */
	@Override
	public void approveStudent(int studentId) throws StudentNotFoundForApprovalException {
		
		statement = null;
		try {
			String sql = SQLQueriesConstants.APPROVE_STUDENT_QUERY;
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1,studentId);
			int row = statement.executeUpdate();
			
			
			if(row == 0) {
				
				throw new StudentNotFoundForApprovalException(studentId);
			}
			
			
			
		}catch(SQLException se) {
			
			
			
		}
		
	}

	/**
	 * Method to add user using SQL commands
	 * @param user
	 * @throws UserNotAddedException
	 * @throws UserIdAlreadyInUseException 
	 */
	@Override
	public void addUser(User user) throws UserNotAddedException, UserIdAlreadyInUseException{
		
		statement = null;
		try {
			
			String sql = SQLQueriesConstants.ADD_USER_QUERY;
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, user.getUserID());
			statement.setString(2, user.getName());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getRole().toString());
			statement.setString(5, user.getGender().toString());
			statement.setString(6, user.getAddress());
			statement.setString(7, user.getCountry());
			int row = statement.executeUpdate();
			
			
			if(row == 0) {
				
				throw new UserNotAddedException(user.getUserID()); 
			}

			
			
		}catch(SQLException se) {
			
			
			throw new UserIdAlreadyInUseException(user.getUserID());
			
		}
		
	}

	/**
	 * Add professor using SQL commands
	 * @param professor
	 * @throws UserIdAlreadyInUseException 
	 * @throws ProfessorNotAddedException 
	 */
	@Override
	public void addProfessor(Professor professor) throws UserIdAlreadyInUseException, ProfessorNotAddedException {
		
		try {
			
			this.addUser(professor);
			
		}catch (UserNotAddedException e) {
			
			
			throw new ProfessorNotAddedException(professor.getUserID());
			
		}catch (UserIdAlreadyInUseException e) {
			
			
			throw e;
			
		}
		
		
		statement = null;
		try {
			
			String sql = SQLQueriesConstants.ADD_PROFESSOR_QUERY;
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, professor.getUserID());
			statement.setString(2, professor.getDepartment());
			statement.setString(3, professor.getDesignation());
			int row = statement.executeUpdate();

			
			if(row == 0) {
				
				throw new ProfessorNotAddedException(professor.getUserID());
			}
			
			
			
		}catch(SQLException se) {
			
			
			throw new UserIdAlreadyInUseException(professor.getUserID());
			
		} 
		
	}
	
	/**
	 * Assign courses to Professor using SQL commands
	 * @param courseCode
	 * @param professorId
	 * @throws CourseNotFoundException
	 * @throws UserNotFoundException 
	 */
	@Override
	public void assignCourse(String courseCode, String professorId) throws CourseNotFoundException, UserNotFoundException{
		
		statement = null;
		try {
			String sql = SQLQueriesConstants.ASSIGN_COURSE_QUERY;
			statement = connection.prepareStatement(sql);
			
			statement.setString(1,professorId);
			statement.setString(2,courseCode);
			int row = statement.executeUpdate();
			
			
			if(row == 0) {
				
				throw new CourseNotFoundException(courseCode);
			}
			
			
		
		}catch(SQLException se) {
			
			
			throw new UserNotFoundException(professorId);
			
		}
		
	}
	
	/**
	 * View courses in the catalog
	 * @param Catalog ID
	 * @return List of courses in the catalog
	 */
	public List<Course> viewCourses(int catalogId) {
		
		statement = null;
		List<Course> courseList = new ArrayList<>();
		try {
			
			String sql = SQLQueriesConstants.VIEW_COURSE_QUERY;
			statement = connection.prepareStatement(sql);
			statement.setInt(1, catalogId);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				Course course = new Course();
				course.setCourseCode(resultSet.getString(1));
				course.setCourseName(resultSet.getString(2));
				course.setInstructorId(resultSet.getString(3));
				courseList.add(course);
				
			}
			
			
			
		}catch(SQLException se) {
			
			
			
		}
		
		return courseList; 
		
	}
	
	/**
	 * View professor in the institute
	 * @return List of the professors in the institute  
	 */
	@Override
	public List<Professor> viewProfessors() {
		
		statement = null;
		List<Professor> professorList = new ArrayList<>();
		try {
			
			String sql = SQLQueriesConstants.VIEW_PROFESSOR_QUERY;
			statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				Professor professor = new Professor();
				professor.setUserID(resultSet.getString(1));
				professor.setName(resultSet.getString(2));
				professor.setGender(Gender.stringToGender(resultSet.getString(3)));
				professor.setDepartment(resultSet.getString(4));
				professor.setDesignation(resultSet.getString(5));
				professor.setAddress(resultSet.getString(6));
				professor.setCountry(resultSet.getString(7));
				professor.setRole(Role.PROFESSOR);
				professor.setPassword("*********");
				professorList.add(professor);
				
			}
			
			
			
		}catch(SQLException se) {
			
			
			
		}
		return professorList;
	}
}
