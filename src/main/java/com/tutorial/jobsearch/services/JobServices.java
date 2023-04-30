package com.tutorial.jobsearch.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.jobsearch.model.Job;
import com.tutorial.jobsearch.repository.JobRepository;

import jakarta.transaction.Transactional;




@Service
public class JobServices {

	
	@Autowired
	private JobRepository jobRepository;
	
	

	public String saveAll(List<Job> jobentry) {
	
		List<Job>jobEntry=jobRepository.saveAll(jobentry);
		
		if(jobEntry!=null) {
			return "Sucess !!!";
		}return "Failed to Post";
		
		
	}



	public List<Job> findAllData() {
		
		return jobRepository.findAll();
	}



	public Job findAllJobById(String id) {
		
		Long ID=Long.parseLong(id);
		
		
		Optional<Job>jobByid=jobRepository.findById(ID);
		
		if(jobByid.isPresent()) {
			return jobByid.get();
		}return null;
		
	}



	public boolean isPresent(Long id) {
		// TODO Auto-generated method stub
		return jobRepository.existsById(id);
	}


@Transactional
	public String deleteById(Long id) {
				if(id!=null) {
		
		jobRepository.deleteById(id);
		return "success";}
				
				return "check your Id";
		
	}


@Transactional
	public void deleteAllWiththeseIds(List<Long> ids) {
		jobRepository.deleteAllById(ids);
		
	}



public List<Job> findJob(String jobtitle) {
	
	return jobRepository.findByJobTittle(jobtitle);
}






public Job findByTittleAndLocation(String jobtitle, String joblocation) {

	return jobRepository.JobTittleAndJobLocation(jobtitle,joblocation);
}



public List<Job> getAllJobsWithGreaterSalary(Long salary) {
	
	return jobRepository.findByJobSalaryGreaterThan(salary);
}



public void updateCompanyNameWhereEmail(String companyname, String email) {
	jobRepository.updateCompanyNameBaseOnEmail(companyname, email);
	
}



public void updateCompanyNameJobTitleAndJobTitleWhereEmailIs(String companyname, String jobtittle, String jobtype,
		String email) {

	
	jobRepository.updateCompanyNameJobTittleJobTypeBasedOnEmail(companyname, jobtittle, jobtype, email);
	
}



public void deleteWhereEmilIs(String email) {
  
	
	jobRepository.deleteBasedOnEmail(email);
	
}



	
	
	
	
}
