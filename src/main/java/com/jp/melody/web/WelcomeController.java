package com.jp.melody.web;

import com.jp.melody.service.SongService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Random;

@Controller
public class WelcomeController {

	private static final String TITLE_KEY = "title";
	private static final String INDEX_KEY = "index";
	private static final String SONG_TITLE_KEY = "songtitle";
	private static final String DEFAULT_TITLE = "melody";
	private static final String SONG_ID_KEY = "songid";

	private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	private final SongService songService;

	@Autowired
	public WelcomeController(final SongService songService) {
		this.songService = songService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(final Map<String, Object> model) {
		logger.debug("index() called");
		model.put(TITLE_KEY, DEFAULT_TITLE);
		model.put(SONG_TITLE_KEY, songService.getSongTitle());
		model.put("songid", songService.getSongId());
		return INDEX_KEY;
	}

	@RequestMapping(value = "/rand", method = RequestMethod.GET)
	public ModelAndView rand() {
		logger.debug("rand() called");
		final ModelAndView model = new ModelAndView();
		model.setViewName(INDEX_KEY);
		model.addObject(TITLE_KEY, DEFAULT_TITLE);
		final Random r = new Random();
		model.addObject(SONG_TITLE_KEY, "rand" + r.nextInt());
		model.addObject(SONG_ID_KEY, r.nextLong());
		return model;
	}
}