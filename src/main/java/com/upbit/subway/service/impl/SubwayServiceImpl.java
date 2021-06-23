package com.upbit.subway.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upbit.subway.repo.SubwayRepository;
import com.upbit.subway.service.SubwayService;
import com.upbit.subway.vo.Subway;

@Service
public class SubwayServiceImpl implements SubwayService {

	@Autowired
	private SubwayRepository repo;

	@Override
	public ArrayList<Subway> searchAllSubways() {
		return repo.selectAllSubways();

	}
}
