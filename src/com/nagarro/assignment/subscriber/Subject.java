package com.nagarro.assignment.subscriber;

import java.util.ArrayList;
import java.util.List;

//Subject class to manage and notify Observers (Observer Pattern)
public class Subject {
	private List<Observer> observers = new ArrayList<>();

	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers(String subject, String message) {
		for (Observer observer : observers) {
			observer.update(subject, message);
		}
	}
}