package com.jp.melody.model;

public class Song {

	private final long id;
	private final String title;

	public Song(final long id, final String title) {
		this.id = id;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
}
