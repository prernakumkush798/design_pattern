package com.nagarro.assignment.channel;

import com.nagarro.assignment.utils.Constants;

//Concrete implementation of NotificationChannel (Strategy Pattern)
public class SmsNotification implements NotificationChannel {
	@Override
	public void sendNotification(String subject, String message) {
		System.out.println(Constants.SMS_CHANNEL);
		
	}

}
