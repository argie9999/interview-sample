package org.sample.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Validated
@Api(tags="Ping Controller", produces = MediaType.APPLICATION_JSON_VALUE)
public class PingController {

	private final BookDao bookDao;

	@Autowired
	public PingController(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@GetMapping(value = "/ping")
	public ResponseEntity checkServer() {
		Map<String, String> result = Collections.singletonMap("server", "UP");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
