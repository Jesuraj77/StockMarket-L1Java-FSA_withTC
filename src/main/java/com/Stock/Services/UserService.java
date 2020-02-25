package com.Stock.Services;
import java.awt.Color;
import java.util.Date;
import java.util.List;

import com.Stock.Entities.Chart;
import com.Stock.Entities.Company;
public interface UserService 
{
	 public void updateProfile(int userID);
	 public List<Company> searchCompany(String companyName);
	 public List<Company> filterCompany(String companyName, String companyCode);
	 Chart GetChart(Company company,String stockExchange,Date fromTime,Date toTime);
     List<Company> DisplayChart( List<Color> color);
     boolean ExportDataFromChart(Chart chart);
}
