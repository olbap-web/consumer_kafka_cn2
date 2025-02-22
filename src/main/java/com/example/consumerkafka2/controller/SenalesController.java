package com.example.consumerkafka2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumerkafka2.service.ConsumerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SenalesController {

    @Autowired
    ConsumerService service;
    @GetMapping("senales/")
	public ResponseEntity<List<String>> readsenales() {
		return ResponseEntity.ok(service.getSenales());
	}
}
