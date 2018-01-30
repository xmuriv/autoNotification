package com.ntt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="NOTIFICATION")
public class Notification {
	
	public Notification() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String notificationType;
	private String notificationMsg;
	@Transient
	private String models;
	private String modelYear;
	private String targetURL;
	private List<String> modelTypes = new ArrayList<String>();
	
	public List<String> getModelTypes() {
		modelTypes.add("BMW1");
		modelTypes.add("BMW2");
		modelTypes.add("BMW3");
System.out.println(modelTypes.size());
		return modelTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getNotificationMsg() {
		return notificationMsg;
	}

	public void setNotificationMsg(String notificationMsg) {
		this.notificationMsg = notificationMsg;
	}

	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	public String getModelYear() {

		
		System.out.println("modelTypes:   " + models);
		if (models != null) {
			if (models.equals("BMW1")) {
				modelYear = "2000";
			}

			if (models.equals("BMW2")) {
				modelYear = "2005";
			}

			if (models.equals("BMW3")) {
				modelYear = "2017";
			}
		}
		System.out.println("modelyear:  " + modelYear);
		return modelYear;

	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getTargetURL() {
		return targetURL;
	}

	public void setTargetURL(String targetURL) {
		this.targetURL = targetURL;
	}

	public void setModelTypes(List<String> modelTypes) {
		this.modelTypes = modelTypes;
	}

}
