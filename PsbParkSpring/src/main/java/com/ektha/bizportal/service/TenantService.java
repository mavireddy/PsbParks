package com.ektha.bizportal.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ektha.bizportal.dao.LocationDao;
import com.ektha.bizportal.dao.TenantDao;
import com.ektha.bizportal.entity.Tenant;

public class TenantService {
	
	private TenantDao tenantDao;
	
	public void setTenantDao(TenantDao tenantDao) {
		this.tenantDao = tenantDao;
	}
	
	@RequestMapping
	public HashMap<String, List<Tenant>> getTenant() {
	
	HashMap<String, List<Tenant>> tenantmap = tenantDao.getTenant();
	return tenantmap;
	
	}

}
