package com.kenbinner.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.kenbinner.modal.Entry;
import com.kenbinner.service.CoffeeBlogService;

@RestController
public class CoffeeBlogControllerImpl {
	
	@Autowired 
	CoffeeBlogService coffeeBlogService;
	
	@GetMapping(value = "getEntries")
	public ResponseEntity<List<Entry>> getEntries() throws Exception {
		try {
			List<Entry> entryList = coffeeBlogService.getEntries();
			return new ResponseEntity<List<Entry>>(entryList, HttpStatus.OK);
		}catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
	
}
