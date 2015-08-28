package com.jp.melody.service;

import com.jp.melody.model.Song;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class SongService {

	private static final Logger logger = LoggerFactory.getLogger(SongService.class);
	private final Song customSong = new Song(1, "yuck");

	public long getSongId() {
		logger.debug("getSongId() called");
		return customSong.getId();
	}

	public String getSongTitle() {
		logger.debug("getSongTitle() called");
		return customSong.getTitle();
	}
}