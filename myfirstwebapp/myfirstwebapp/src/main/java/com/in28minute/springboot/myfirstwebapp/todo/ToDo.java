package com.in28minute.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

public class ToDo {

	private Integer id;
	private String username;
	private String description;
	private LocalDate targatDate;
	private boolean done;

	public ToDo( Integer id, String username, String description, LocalDate targatDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targatDate = targatDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargatDate() {
		return targatDate;
	}

	public void setTargatDate(LocalDate targatDate) {
		this.targatDate = targatDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", targatDate="
				+ targatDate + ", done=" + done + "]";
	}

}
