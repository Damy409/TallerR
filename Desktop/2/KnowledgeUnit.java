package model;

import java.time.LocalDate;

public class KnowledgeUnit {

	private String id;
	private String description;
	private String type;
	private String learnedLessons;
	private String status;
	private LocalDate date;

	public KnowledgeUnit(String id, String description, String type,  String learnedLessons, LocalDate date) {

		this.id = id;
		this.description = description;
		this.type = type;
	
		this.learnedLessons = learnedLessons;
		this.status = "Por definir";
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLearnedLessons() {
		return learnedLessons;
	}

	public void setLearnedLessons(String learnedLessons) {
		this.learnedLessons = learnedLessons;
	}
	
	public String getStatus(){
		return status;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public LocalDate getDate(){
		return date;
	}

	public void setDate(LocalDate date){
		this.date = date;
	}

	public String toString(){

		String msg = "";

		msg = "\nID:" +id+ "\nDescription:" +description+ "\nType:" +type+ "\nLearned Lesson:" +learnedLessons+ "\nStatus:" +status+ "\nDate:" +date;

		return msg;
	}

	public String ShowIdDescription(){

		String msg = "";

		msg = "\nId: " +id+ "\nDescription: " +description;

		return msg;
	}





}
