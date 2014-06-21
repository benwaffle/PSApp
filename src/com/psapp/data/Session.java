package com.psapp.data;

import java.io.Serializable;

/**
 * Analytics for session management. Also allows for saved sessions.
 */
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private transient String password = null;
	
	/**
	 * Instantiates a new user session.
	 * @param user Username
	 * @param pass Password
	 */
	public Session(String user, String pass) {
		username = user;
		password = pass;
	}
	
	/**
	 * Connects to PowerSchool.
	 */
	public void connect() {
		// TODO: PSLib integration: connect to PowerSchool
	}
}
