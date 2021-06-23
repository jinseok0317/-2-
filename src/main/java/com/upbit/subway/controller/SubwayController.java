package com.upbit.subway.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upbit.subway.service.SubwayService;
import com.upbit.subway.vo.Subway;

@RestController
public class SubwayController {
	@Autowired
	private SubwayService service;

	@GetMapping("/api/Subway/searchAll")
	public ResponseEntity<?> searchAllSubways() {
		ArrayList<Subway> ret = service.searchAllSubways();
		return ResponseEntity.ok(ret);
	}
}
