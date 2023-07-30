package org.phds.schema;

public class Patient {

	public String redEye;
	public String history;
	public String painLevel;
	public String rednessPattern;
	public String eyeLidStatus;
	public String ptosis;
	public String vision;
	public String conjectival;
	public String typeDisrcharge;
	public String itching;
	public String message;
	
	public Patient(String rde) {
		this.redEye = rde;
	}

	public String getRedEye() {
		return redEye;
	}

	public void setRedEye(String redEye) {
		this.redEye = redEye;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getPainLevel() {
		return painLevel;
	}

	public void setPainLevel(String painLevel) {
		this.painLevel = painLevel;
	}

	public String getRednessPattern() {
		return rednessPattern;
	}

	public void setRednessPattern(String rednessPattern) {
		this.rednessPattern = rednessPattern;
	}

	public String getEyeLidStatus() {
		return eyeLidStatus;
	}

	public void setEyeLidStatus(String eyeLidStatus) {
		this.eyeLidStatus = eyeLidStatus;
	}

	public String getPtosis() {
		return ptosis;
	}

	public void setPtosis(String ptosis) {
		this.ptosis = ptosis;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public String getConjectival() {
		return conjectival;
	}

	public void setConjectival(String conjectival) {
		this.conjectival = conjectival;
	}

	public String getTypeDisrcharge() {
		return typeDisrcharge;
	}

	public void setTypeDisrcharge(String typeDisrcharge) {
		this.typeDisrcharge = typeDisrcharge;
	}

	public String getItching() {
		return itching;
	}

	public void setItching(String itching) {
		this.itching = itching;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
