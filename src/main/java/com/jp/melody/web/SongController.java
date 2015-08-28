package com.jp.melody.web;

import com.jp.melody.model.Song;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SongController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/trash")
	public Song song() {
		return new Song(counter.incrementAndGet(), "garbage");
	}
}
