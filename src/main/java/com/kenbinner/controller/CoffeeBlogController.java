package com.kenbinner.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.kenbinner.modal.Entry;

public interface CoffeeBlogController {
	
	public ResponseEntity<List<Entry>> getEntries() throws Exception;

}
