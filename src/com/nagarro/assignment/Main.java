package com.nagarro.assignment;
//email-sms startegy, send notification should be main, adapter method shoyuld return properties and add  more obj to it 
import java.util.Scanner;



import com.nagarro.assignment.service.NotificationService;
import com.nagarro.assignment.subscriber.Observer;
import com.nagarro.assignment.subscriber.Subscriber;
import com.nagarro.assignment.utils.Constants;

//Main class to demonstrate the Notification System
public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		Observer user1 = new Subscriber(Constants.USER1);
		Observer user2 = new Subscriber(Constants.USER2);
		Observer user3 = new Subscriber(Constants.USER3);

		NotificationService notificationService = NotificationService.getInstance();
		notificationService.subscribeUser(user1);
		notificationService.subscribeUser(user2);

		do {
			System.out.println(Constants.CHANNEL_TYPE);

			String channelType = scn.nextLine();
			if (!channelType.equalsIgnoreCase(Constants.EMAIL) && !channelType.equalsIgnoreCase(Constants.SMS)) {

				System.out.println(Constants.INVALID_CHANNEL_TYPE);
				continue;
			}
			System.out.println(Constants.SUBJECT);
			String subject = scn.nextLine();
			System.out.println(Constants.MESSAGE);
			String message = scn.nextLine();

			notificationService.setChannel(channelType);

			notificationService.sendNotification(subject, message);
			System.out.println(Constants.DEFAULT_MESSAGE);
			char res = scn.next().charAt(0);
			if (res != 'e') {

				flag = false;
			}
			scn.nextLine();

		} while (flag);
	}
}