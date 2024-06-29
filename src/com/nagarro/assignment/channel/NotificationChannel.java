package com.nagarro.assignment.channel;

//Created interface acting as an Adapter to standardize different notification mechanisms.
public interface NotificationChannel {
	
    void sendNotification(String subject, String message);
    
}
