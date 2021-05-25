/**
 * 
 */
package com.flipkart.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.EnrolledStudent;
import com.flipkart.bean.Student;
import com.flipkart.constant.Grade;
import com.flipkart.constant.SQLQueriesConstants;
import com.flipkart.dao.ProfessorDaoInterface;
import com.flipkart.dao.ProfessorDaoOperation;
import com.flipkart.exception.GradeNotAddedException;
import com.flipkart.utils.DBUtils;

/**
 * @author Ananya Varma
 *
 */
public class ProfessorOperation implements ProfessorInterface {

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
