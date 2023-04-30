package com.tutorial.jobsearch.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.jobsearch.model.Job;
import com.tutorial.jobsearch.services.JobServices;



@RestController
@RequestMapping("/job")
public class JobController {
	
	
	@Autowired
	private JobServices jobServices;
	
	//crud operation
	@PostMapping("/entry")
	
	public String addJobEntry(@RequestBody List<Job>jobentry) {
		
		
		return jobServices.saveAll(jobentry);
	}

	
	@GetMapping("/all")
	public List<Job> findAllJobEntry(){
		
		return jobServices.findAllData();
	}
	
	
	@GetMapping("id/{id}")
	public Job findAllJobById(@PathVariable String id){
		
		return jobServices.findAllJobById(id);
	}
	
	@GetMapping("check/{id}")
	public boolean isPresentWithId(@PathVariable Long id) {
		
		return jobServices.isPresent(id);
		
	}
	
	@DeleteMapping("id/{id}")
	public String deleteById(@PathVariable Long id) {
		
		return jobServices.deleteById(id);
	}
	@DeleteMapping("ids/{ids}")
	
	public void deleteAllWiththeseIds(@PathVariable List<Long>ids) {
		
		jobServices.deleteAllWiththeseIds(ids);
		
	}
	//crud operations
	
	
	
	
	//custom finders
	
	
	@GetMapping("jobtitle/{jobtitle}")
	
	public List<Job>findByJobtittle(@PathVariable String jobtitle){
		
		return jobServices.findJob(jobtitle);
	}
	
	@GetMapping("jobtitle/{jobtitle}/location/{location}")
	
	public Job findByTittleAndLocation(@PathVariable("jobtitle") String jobtitle,@PathVariable("location") String joblocation) {
		
		return jobServices.findByTittleAndLocation(jobtitle,joblocation);
	}
	
	@GetMapping("salary")
	
	public List<Job>getAllJobsWithGreaterSalary(@RequestParam Long salary){
		
		return jobServices.getAllJobsWithGreaterSalary(salary);
	}
	
	
     //custom finders
	
	
	//query
	
	
	@PutMapping("update/{companyname}/email/{email}")
		
		public void updateCompanyNameWhereEmailIs(@PathVariable("companyname")String companyname,@PathVariable("email") String email) {
			
			jobServices.updateCompanyNameWhereEmail(companyname,email );
		
	}
	
	@PutMapping("update/{companyname}/{jobtitle}/{jobtype}/email/{email}")
	
	public void updateCompanyNameJobTitleAndJobTitleWhereEmailIs(@PathVariable("companyname")String companyname,
			
			@PathVariable("jobtitle") String jobtittle,
			@PathVariable("jobtype") String jobtype,
			@PathVariable("email") String email
			
			) {
		
		jobServices.updateCompanyNameJobTitleAndJobTitleWhereEmailIs(companyname,jobtittle,jobtype,email);
	}
	
	@DeleteMapping("delete/email/{email}")
	
	public void deleteWhereEmilIs( @PathVariable ("email") String email) {
		
		jobServices.deleteWhereEmilIs(email);
	}
	
	
}
