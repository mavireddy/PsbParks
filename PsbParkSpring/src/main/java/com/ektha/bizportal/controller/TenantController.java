package com.ektha.bizportal.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.bizportal.dao.TenantDao;
import com.ektha.bizportal.entity.Tenant;
import com.ektha.bizportal.service.TenantService;

@Controller
public class TenantController {

	@Autowired
	private TenantService tenantService;

	@RequestMapping(value = "/loc")
	public ModelAndView listLocations()

	{
		ModelAndView model = new ModelAndView();
		model.setViewName("location");

		// HashMap<String, List<Tenant>> map = employeeDAO.getAllEmployees();

		HashMap<String, List<Tenant>> map = tenantService.getTenant();
		System.out.println(map);
		model.addObject("finalmap", map);

		return model;
	}

	@RequestMapping(value = "/tenant")
	public ModelAndView listTenant(HttpServletRequest request, HttpServletResponse response)

	{
		String location = request.getParameter("location");
		ModelAndView model = new ModelAndView();
		model.setViewName("tenant");

		// HashMap<String, List<Tenant>> map = employeeDAO.getAllEmployees();

		HashMap<String, List<Tenant>> map = tenantService.getTenant();

		if (map.containsKey(location)) {
			List<Tenant> tenantList = map.get(location);

			model.addObject("finaltenant", tenantList);
			model.addObject("Location",location);

		}

		return model;
	}

}
