package com.upbit.subway.repo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.upbit.subway.vo.Subway;

@Mapper
public interface SubwayRepository {

	ArrayList<Subway> selectAllSubways();

}
