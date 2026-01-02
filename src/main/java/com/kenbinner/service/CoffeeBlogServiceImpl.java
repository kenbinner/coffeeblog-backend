package com.kenbinner.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kenbinner.modal.Entry;

@Service
public class CoffeeBlogServiceImpl {
	
	public List<Entry> getEntries() throws Exception {
		ArrayList<Entry> entryList = new ArrayList<Entry>();
		Entry entry1 = new Entry(
				1, 
				"02/01/2026", 
				"My First Blog Entry", 
				"Hello world, this is my first blog entry");
		Entry entry2 = new Entry(
				1, 
				"02/01/2026", 
				"My Second Blog Entry", 
				"Hello world, this is my second blog entry");
		
		entryList.add(entry1);
		entryList.add(entry2);
		return entryList;
	}

}
