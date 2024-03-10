// Controller class
package com.swe642.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swe642.spring.Entries;
import com.swe642.spring.Repository;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private Repository rep;
	
	// Constructor based dependency
	public Controller(Repository rep) {
		super();
		this.rep = rep;
	}

	@GetMapping("/survey")
	public Repository getEntry() {
        return rep;
    }
	
	@PostMapping
	public Repository setEntry(@RequestParam String name) {
        return rep;
    }
	
	@DeleteMapping("/delete")
    public ResponseEntity<String> deleteEntity(@PathVariable Long name) {
		boolean deleted = rep.deleteEntry();
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

}
