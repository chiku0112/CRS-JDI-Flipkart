/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Student;
import com.flipkart.constant.Gender;
import com.flipkart.constant.Role;
import com.flipkart.dao.StudentDaoInterface;
import com.flipkart.dao.StudentDaoOperation;
import com.flipkart.exception.StudentNotRegisteredException;

/**
 * @author Ananya Varma
 *
 */

public class StudentOperation implements StudentInterface {
	private static volatile StudentOperation instance=null;
	StudentDaoInterface studentDaoInterface= StudentDaoOperation.getInstance();
	public static StudentOperation getInstance()
	{
		if(instance==null)
		{
			// This is a synchronized block, when multiple threads will access this instance
			synchronized(StudentOperation.class){
				instance=new StudentOperation();
			}
		}
		return instance;
	}
	@Override
	public int register(String name, String userID, String password, Gender gender, int batch, String branch,
						String address, String country) throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		int studentId;
		try
		{
			//call the DAO class, and add the student record to the DB
			Student newStudent=new Student(userID,name, Role.STUDENT,password,gender,address,country,branch,0,batch,false);
			studentId=studentDaoInterface.addStudent(newStudent);

		}
		catch(StudentNotRegisteredException ex)
		{
			throw ex;
		}
		return studentId;
	}

	@Override
	public int getStudentId(String userId) {
		// TODO Auto-generated method stub
		return studentDaoInterface.getStudentId(userId);
	}

	@Override
	public boolean isApproved(int studentId) {
		// TODO Auto-generated method stub
		return studentDaoInterface.isApproved(studentId);
	}

	

}
