package com.ektha.bizportal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.bizportal.dao.LocationDao;
import com.ektha.bizportal.dao.TenantDao;
import com.ektha.bizportal.entity.Location;
import com.ektha.bizportal.entity.Tenant;
import com.ektha.bizportal.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;

	/*@RequestMapping(value = "/locdetails/{locid}")
	public ModelAndView listLocations(@PathVariable("locid") String locid)

	{	
		ModelAndView model = new ModelAndView();
		model.setViewName("locationdetails");
		
		ArrayList<Location> locationlist= locationService.getLocation();
		
		//model.addObject("Location", locid);
		
		Location location = null ;
		
		for (Location loc: locationlist)
		{
			if((loc.getLocation()).equals(locid))
			{
				location= loc;
			}
		}
		model.addObject("Location",location);

		return model;
	}*/
	
	@RequestMapping(value = "/locdetails/{locid}")
	public ModelAndView listLocations(@PathVariable("locid") String locid)

	{	
		ModelAndView model = new ModelAndView();
		model.setViewName("locationdetails");
		
		Location location= locationService.getLocation(locid);
		
		model.addObject("Location",location);

		return model;
	}

}
