/**
 * 
 */
package com.flipkart.service;

import com.flipkart.constant.ModeOfPayment;
import com.flipkart.constant.NotificationType;
import com.flipkart.dao.NotificationDaoInterface;
import com.flipkart.dao.NotificationDaoOperation;

import java.sql.SQLException;
import java.util.UUID;

/**
 * @author Ananya Varma
 *
 */
public class NotificationOperation implements NotificationInterface {

	private static volatile NotificationOperation instance=null;
	NotificationDaoInterface notificationDaoInterface= NotificationDaoOperation.getInstance();


	public static NotificationOperation getInstance()
	{
		if(instance==null)
		{
			// This is a synchronized block, when multiple threads will access this instance
			synchronized(NotificationOperation.class){
				instance=new NotificationOperation();
			}
		}
		return instance;
	}
	@Override
	public int sendNotification(NotificationType type, int studentId, ModeOfPayment modeOfPayment, double amount) {
		// TODO Auto-generated method stub
		int notificationId=0;
		try
		{
			notificationId=notificationDaoInterface.sendNotification(type, studentId,modeOfPayment,amount);

		}
		catch(SQLException ex)
		{
			System.out.println("Error occured "+ex.getMessage());
		}
		return notificationId;
	}

	@Override
	public UUID getReferenceId(int notificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
