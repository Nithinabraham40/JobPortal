package com.tutorial.jobsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;



import com.tutorial.jobsearch.model.Job;

import jakarta.transaction.Transactional;

public interface JobRepository  extends JpaRepository<Job, Long>{
	
	List<Job> findByJobTittle(String string);
	Job JobTittleAndJobLocation(String jobtitle,String location );
	
   List<Job>findByJobSalaryGreaterThan(Long salary);
	
	
	
	@Modifying
	@Transactional
	@Query(
			value = "update tbl_job set company_name=:name where EMPLOYER_EMAIL_ID  =:email ",
			nativeQuery = true
			)
	void updateCompanyNameBaseOnEmail(String name,String email);
	
	
	@Modifying
	@Transactional
	@Query(
			value="update tbl_job set company_name=:companyname,job_tittle=:jobtitle,job_Type=:jobtype where EMPLOYER_EMAIL_ID  =:email",
			nativeQuery = true)
	
	void updateCompanyNameJobTittleJobTypeBasedOnEmail(String companyname,String jobtitle,String jobtype,String email );
					
	
	@Modifying
	@Transactional
	@Query(
			value="delete from tbl_job where EMPLOYER_EMAIL_ID  =:email",
			nativeQuery = true
			
			)
	
	void deleteBasedOnEmail(String email);
	
			
			
	
	
	
	

	

}
