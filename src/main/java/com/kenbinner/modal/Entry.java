package com.kenbinner.modal;

public class Entry {
	private int entryId;
	private String entryTitle;
	private String entryDate;
	private String entryText;
	
	public Entry(int entryId, String entryTitle, String entryDate, String entryText) {
		this.entryId = entryId;
		this.entryTitle = entryTitle;
		this.entryDate = entryDate;
		this.entryText = entryText;
	}

	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public String getEntryTitle() {
		return entryTitle;
	}

	public void setEntryTitle(String entryTitle) {
		this.entryTitle = entryTitle;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getEntryText() {
		return entryText;
	}

	public void setEntryText(String entryText) {
		this.entryText = entryText;
	}
}
