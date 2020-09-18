package com.dhony.learning.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plants")
public class Plant {

	@Id
	private String id;
	private String plantName;
	private String botanicalName;
	private String latinName;
	private String status;
	private boolean combination;
	private String useTerapy;
	private String url;
	
	@Override
	public String toString() {
		return "Plant [id=" + id + ", plantName=" + plantName + ", botanicalName=" + botanicalName + ", latinName="
				+ latinName + ", status=" + status + ", combination=" + combination + ", useTerapy=" + useTerapy
				+ ", url=" + url + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public String getBotanicalName() {
		return botanicalName;
	}
	public void setBotanicalName(String botanicalName) {
		this.botanicalName = botanicalName;
	}
	public String getLatinName() {
		return latinName;
	}
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isCombination() {
		return combination;
	}
	public void setCombination(boolean combination) {
		this.combination = combination;
	}
	public String getUseTerapy() {
		return useTerapy;
	}
	public void setUseTerapy(String useTerapy) {
		this.useTerapy = useTerapy;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
