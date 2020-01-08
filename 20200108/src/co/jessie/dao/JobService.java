package co.jessie.dao;

import java.util.List;

import co.jessie.dto.JobDto;

public interface JobService {
	public List<JobDto> selectAll() throws Exception;  //테이블 전체 목록
	public JobDto select(JobDto dto) throws Exception; //특정한 한 레코드
	public int update(JobDto dto)throws Exception;    //레코드갱신
	public int delete(JobDto dto)throws Exception;    //레코드삭제
	public int insert(JobDto dto)throws Exception;	  //레코드 추가
	
	
}
