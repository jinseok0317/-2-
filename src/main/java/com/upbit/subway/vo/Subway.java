package com.upbit.subway.vo;

import lombok.Data;

@Data
public class Subway {

	private double station_num;
	
	private String jiyeok;
	
	private String nosun;
	
	private String station;
	
	private String way;

	public double getStation_num() {
		return station_num;
	}

	public void setStation_num(double station_num) {
		this.station_num = station_num;
	}
	
	public String getJiyeok() {
		return jiyeok;
	}

	public void setJiyeok(String jiyeok) {
		this.jiyeok = jiyeok;
	}

	public String getNosun() {
		return nosun;
	}

	public void setNosun(String nosun) {
		this.nosun = nosun;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public Subway(double station_num, String jiyeok, String nosun, String station, String way) {
		super();
		this.station_num = station_num;
		this.jiyeok = jiyeok;
		this.nosun = nosun;
		this.station = station;
		this.way = way;
	}
	
}
