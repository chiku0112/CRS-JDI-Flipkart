/**
 * 
 */
package com.flipkart.service;

import java.sql.SQLException;
import java.util.UUID;

import org.apache.log4j.Logger;

import com.flipkart.constant.ModeOfPayment;
import com.flipkart.constant.NotificationType;
import com.flipkart.dao.NotificationDaoInterface;
import com.flipkart.dao.NotificationDaoOperation;

/**
 * @author Ananya Varma
 *
 */
public class NotificationOperation implements NotificationInterface {

	@Override
	public int sendNotification(com.flipkart.service.NotificationType type, int studentId,
			com.flipkart.service.ModeOfPayment modeOfPayment, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UUID getReferenceId(int notificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
