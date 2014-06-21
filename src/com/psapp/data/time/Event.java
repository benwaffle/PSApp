package com.psapp.data.time;

/**
 * An Event is a record of something taking place in time, whether this be
 * an objective or appointment.
 */
public abstract class Event {
	private String title, description;
	private boolean completed = false;
	
	/**
	 * Creates a new event.
	 * @param title A brief title of the event
	 * @param description A longer description of the event
	 */
	public Event(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	/**
	 * @return This event's title
	 */
	public String title() { return title; }
	
	/**
	 * @return A description of this event
	 */
	public String descr() { return description; }
	
	/**
	 * Has this event been completed or not?
	 */
	public boolean done() { return completed; }
}
