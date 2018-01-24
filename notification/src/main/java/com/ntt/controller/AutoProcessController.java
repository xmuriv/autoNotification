package com.ntt.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import com.ntt.resources.NotificationServiceBean;

@ManagedBean(name="auto")
public class AutoProcessController {

	@Inject
	NotificationServiceBean notificationBean;
	
	
	Notfication notification =new Notfication();

	public Notfication getNotification() {
		return notification;
	}

	public void setNotification(Notfication notification) {
		this.notification = notification;
	}

	public void create() {
		notificationBean.createNotification(notification);
	}

}
