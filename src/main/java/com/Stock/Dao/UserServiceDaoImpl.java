package com.Stock.Dao;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Stock.Entities.Chart;
import com.Stock.Entities.Company;

@Component
@Repository ("userServiceDao")

public class UserServiceDaoImpl implements UserServiceDao {
	
	@Autowired
	
	public void updateProfile(int userID) {
		// TODO Auto-generated method stub

	}

	public List<Company> searchCompany(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> filterCompany(String companyName, String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public Chart GetChart(Company company, String stockExchange, Date fromTime, Date toTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> DisplayChart(List<Color> color) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean ExportDataFromChart(Chart chart) {
		// TODO Auto-generated method stub
		return false;
	}

}
