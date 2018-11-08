package com.ektha.bizportal.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

import com.ektha.bizportal.dao.LocationDao;
import com.ektha.bizportal.entity.Location;

public class LocationService {
	
	private LocationDao locationDao;

	
	
	public void setLocationDao(LocationDao locationDao) {
		this.locationDao = locationDao;
	}


/*
	@RequestMapping
	public ArrayList<Location> getLocation()
	{
		ArrayList<Location> locationList = locationDao.getLocation();
		return locationList;
	}*/
	
	@RequestMapping
	public Location getLocation(String locationName)
	{
		Location location = locationDao.getLocation(locationName);
		return location;
	}

}
