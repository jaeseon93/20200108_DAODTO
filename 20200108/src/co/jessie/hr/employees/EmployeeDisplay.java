package co.jessie.hr.employees;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDisplay {
	public void allSelectList() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		List<EmployeeDto> list = new ArrayList<EmployeeDto>();
		try {
			list = emp.allSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (EmployeeDto dto : list)
			dto.toString();
	}

	public void employeeInsert() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Date date = Date.valueOf("2020-01-10");  //날짜를 생성
		dto.setEmployee_id(222);
		dto.setFirst_name("펭수");
		dto.setLast_name("하");
		dto.setEmail("pengsu");
		dto.setPhone_number("010.1234.5678");
		dto.setHire_date(date);  //날짜값담기
		dto.setJob_id("AD_PRES");
		dto.setSalary(150000);
		dto.setCommission_pct(0);
		dto.setManager_id(100);
		dto.setDepartment_id(60);

		try {
			int n = emp.insert(dto);
			if (n != 0)
				System.out.println("정상적으로 입력되었습니다.");
			else
				System.out.println("입력이 실패되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
