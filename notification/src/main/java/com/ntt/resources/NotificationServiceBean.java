package com.ntt.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.ntt.controller.Notfication;

@Stateless
public class NotificationServiceBean  {

	
	public void createNotification(Notfication n) {
		// TODO Auto-generated method stub
		System.out.println(n.getName()+" type  "+n.getNotificationType()+" msg "+n.getNotificationMsg()+" model "+n.getModels()+" year "+n.getModelYear()+" target "+n.getTargetURL());
		System.out.println("created");
		
		
	}

}
