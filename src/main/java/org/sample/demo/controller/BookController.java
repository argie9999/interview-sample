package org.sample.demo.controller;

import io.swagger.annotations.Api;
import org.sample.demo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Api(tags="Book Controller", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

	private final BookDao bookDao;

	@Autowired
	public BookController(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
