package co.jessie.dto;

import co.jessie.dao.EmployeeDao;

public class MainApp {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		JobDisplay jd = new JobDisplay();
		jd.allSelectDisplay();
	}

}
