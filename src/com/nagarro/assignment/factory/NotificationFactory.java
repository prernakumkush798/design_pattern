package com.nagarro.assignment.factory;

import com.nagarro.assignment.channel.EmailNotification;
import com.nagarro.assignment.channel.NotificationChannel;
import com.nagarro.assignment.channel.SmsNotification;
import com.nagarro.assignment.utils.Constants;

//Factory Pattern to create instances of NotificationChannel
public class NotificationFactory {
	public static NotificationChannel createChannel(String channelType) {
		if (channelType.equalsIgnoreCase(Constants.EMAIL)) {
			return new EmailNotification();
		} else if (channelType.equalsIgnoreCase(Constants.SMS)) {
			return new SmsNotification();
		} else {
			throw new IllegalArgumentException(Constants.INVALID_CHANNEL_TYPE);
		}
	}

}
