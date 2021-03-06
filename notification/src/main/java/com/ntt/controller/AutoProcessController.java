package com.ntt.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import com.ntt.resources.NotificationServiceBean;

@ManagedBean(name="auto")
public class AutoProcessController {

	@Inject
	NotificationServiceBean notificationBean;
	
	@Inject
	Notification notification;

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public void create() {
		System.out.println("Create()     :"+notification);
		notificationBean.createNotification(notification);
	}

}
