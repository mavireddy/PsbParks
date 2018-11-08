package com.ektha.bizportal.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.ektha.bizportal.entity.Address;
import com.ektha.bizportal.entity.Contact;
import com.ektha.bizportal.entity.Location;

public class LocationDao {
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*returns the Location object*/
	public Location getLocation(String locationName) {

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getLocationInfoNew");
		SqlParameterSource in = new MapSqlParameterSource().addValue("locationName", locationName);
		Map<String, Object> out = simpleJdbcCall.execute(in);

		Location location = new Location();
		Address address = new Address();
		Contact contact = new Contact();

		address.setAddr_line1((String) out.get("out_address_line1"));
		address.setCity((String) out.get("out_city"));
		address.setState((String) out.get("out_state"));
		address.setZipcode(String.valueOf(out.get("out_zipcode")));

		contact.setPhone_number((String) out.get("out_phone"));
		contact.setEmail_id((String) out.get("out_emaild"));

		location.setLocation((String) out.get("out_location_name"));
		location.setAddress(address);
		location.setContact(contact);
		location.setNoOfTenants(Integer.parseInt(String.valueOf(out.get("out_num_of_tenants"))));

		return location;
	}

}
