package com.nagarro.assignment.service;

import com.nagarro.assignment.channel.NotificationChannel;
import com.nagarro.assignment.factory.NotificationFactory;
import com.nagarro.assignment.subscriber.Observer;
import com.nagarro.assignment.subscriber.Subject;
import com.nagarro.assignment.utils.Constants;

//Implemented singleton class
public class NotificationService {
	private static NotificationService instance;
	private NotificationChannel channel;
	private Subject subject;

	private NotificationService() {
		subject = new Subject();
	}

	public static NotificationService getInstance() {
		if (instance == null) {
			instance = new NotificationService();
		}
		return instance;
	}

	public void setChannel(String channelType) {
		this.channel = NotificationFactory.createChannel(channelType);
	}

	public void subscribeUser(Observer observer) {
		subject.subscribe(observer);
	}

	public void unsubscribeUser(Observer observer) {
		subject.unsubscribe(observer);
	}

	public void sendNotification(String subjectText, String message) {
		if (channel != null) {
			channel.sendNotification(subjectText, message);
			subject.notifyObservers(subjectText, message);
		} else {
			throw new IllegalStateException(Constants.CHANNEL_NOT_SET);
		}
	}

}
