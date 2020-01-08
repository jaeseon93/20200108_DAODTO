package co.jessie.dto;
//DTO = Talbe => 1:1 
//테이블 칼럼명을 그대로 변수에.
public class JobDto { //jobs table
	private String job_id;
	private String job_title;
	private int min_salary;
	private int max_salary;
	
	public JobDto() {
		
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}

	public int getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}

	@Override
	public String toString() {   //일반적인 DTO에서는 toString만들지않음. 지금은 출력해보려고 만든는 것.
//		return "JobDto [job_id=" + job_id + ", job_title=" + job_title + ", min_salary=" + min_salary + ", max_salary="
//				+ max_salary + "]";
		System.out.print(job_id + " ");
		System.out.print(job_title + " ");
		System.out.print(min_salary + " ");
		System.out.println(max_salary + " ");
		return null;
	}
	
	
	
	
}
