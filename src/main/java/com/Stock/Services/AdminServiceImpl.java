package com.Stock.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Dao.AdminServiceDao;
import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;


@Component
@Service ("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminServiceDao adminServiceDao;
	@Transactional
	
	public void createCompany(String companyName) {
		// TODO Auto-generated method stub

	}

	public boolean deleteCompany(int companyId) {
		return true;
		// TODO Auto-generated method stub
	}

	public Company editCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company getCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> viewCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public IPODetails updateIPODetails(int ipoId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createCompany(Company company) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteCompany(Integer companyId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Company findCompany(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
