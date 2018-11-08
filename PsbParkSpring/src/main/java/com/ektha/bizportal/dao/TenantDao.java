package com.ektha.bizportal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ektha.bizportal.entity.Address;
import com.ektha.bizportal.entity.Contact;
import com.ektha.bizportal.entity.Tenant;

@Repository
public class TenantDao
 {
	

    private JdbcTemplate jdbcTemplate;
    // JdbcTemplate setter
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
    
   // public List<Employee> getAllEmployees()
    public HashMap<String, List<Tenant>> getTenant() {
    
    	String sql="SELECT \r\n" + 
				"    contact.email_id,\r\n" + 
				"    contact.phone_number,\r\n" + 
				"    Address.Address_line1,\r\n" + 
				"    Address.Address_line2,\r\n" + 
				"    Address.city,\r\n" + 
				"    Address.state,\r\n" + 
				"    Address.zipcode,\r\n" + 
				"    Location.location_name,\r\n" + 
				"    Tenants.company_name\r\n" + 
				"FROM\r\n" + 
				"    location,\r\n" + 
				"    tenants,\r\n" + 
				"    address,\r\n" + 
				"    contact\r\n" + 
				"WHERE\r\n" + 
				"    location.location_id = tenants.location_id\r\n" + 
				"        AND tenants.address_id = address.address_id\r\n" + 
				"        AND tenants.contact_id = contact.contact_id;\r\n" + 
				"";

    	HashMap<String, List<Tenant>>  tenantmap= jdbcTemplate.query(sql, new ResultSetExtractor<HashMap<String, List<Tenant>>>()
        {
            @Override
            public HashMap<String, List<Tenant>> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
            	HashMap<String, List<Tenant>> map = new HashMap<String, List<Tenant>>();                
                while (rs.next()) {

    				Tenant tenant = new Tenant();
    				Address address = new Address();
    				Contact contact = new Contact();

    				String location = rs.getString("location_name");
    				
    				tenant.setName(rs.getString("company_name"));
    				address.setAddr_line1(rs.getString("Address_line1"));
    				address.setAddr_line2(rs.getString("Address_line2"));
    				address.setCity(rs.getString("city"));
    				address.setState(rs.getString("state"));
    				address.setZipcode(rs.getString("zipcode"));

    				tenant.setAddress(address);

    				contact.setEmail_id(rs.getString("email_id"));
    				contact.setPhone_number(rs.getString("phone_number"));

    				tenant.setContact(contact);

    				if (map.containsKey(location)) {

    					map.get(location).add(tenant);
    				} else {
    					List<Tenant> temp = new ArrayList<Tenant>();
    					temp.add(tenant);
    					map.put(location, temp);
    				}

    			}
                return map;
            }

        });
        return tenantmap;
    }

}


