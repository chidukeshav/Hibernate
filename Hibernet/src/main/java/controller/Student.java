package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	private String std_name;
	@Id
	private int std_id;
	private char std_sec;

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public char getStd_sec() {
		return std_sec;
	}

	public void setStd_sec(char std_sec) {
		this.std_sec = std_sec;
	}

}
