package com.nagarro.assignment.subscriber;

import com.nagarro.assignment.utils.Constants;

//Concrete implementation of Observer (Observer Pattern)
public class Subscriber implements Observer
{
	private String name;

	public Subscriber(String name) {
        this.name = name;
    }

	@Override
	public void update(String subject, String message) {
		System.out.println(Constants.RECEIVER+ this.name+Constants.SUBJECT_IS+ subject+ Constants.MESSAGE_IS+ message);
		
	}
}