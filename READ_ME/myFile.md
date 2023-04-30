# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - **Eclipse >=4.55.0**
 - **Postman >=10.13**
 


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - **Framework :  SpringBoot**
 - **Language :  Java**

 # Dependencies Required

 - **spring-boot-starter-validation**
 - **spring-boot-starter-web**
 - **spring-boot-devtools**
 - **lombok**
 - **spring-boot-starter-test**
 - **spring-boot-starter-data-jpa**
 - **com.h2database**

# DataFlow

<b><span style="color: white;">CRUD</span></b>

1. *saveAll(jobentry)*

2. *findAll()*

3. *findById(id)*
4. *existsById(id)*
5.  *deleteById(id)*

  


<b><span style="color: white;">Custom finder</span></b>

 * List<Job> findByJobTittle(String string);*

 * Job JobTittleAndJobLocation(String jobtitle,String location );*

 * List<Job>findByJobSalaryGreaterThan(Long salary);*







<b><span style="color: white;">Custom queries</span></b>
  
   ```

   @Modifying
	@Transactional
	@Query(
			value = "update tbl_job set company_name=:name where EMPLOYER_EMAIL_ID  =:email ",
			nativeQuery = true
			)
	void updateCompanyNameBaseOnEmail(String name,String email);
	
	
```

 ```

   
	@Modifying
	@Transactional
	@Query(
			value="update tbl_job set company_name=:companyname,job_tittle=:jobtitle,job_Type=:jobtype where EMPLOYER_EMAIL_ID  =:email",
			nativeQuery = true)
	
	void updateCompanyNameJobTittleJobTypeBasedOnEmail(String companyname,String jobtitle,String jobtype,String email );
					
	
	
	
```

 ```

   
@Modifying
	@Transactional
	@Query(
			value="delete from tbl_job where EMPLOYER_EMAIL_ID  =:email",
			nativeQuery = true
			
			)
	
	void deleteBasedOnEmail(String email);
					
	
	
	
```




	



# Database Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

*h2Database*



</details>

 # Database Design

 - **Primary Key :  jobId**
 - **UniqueConstraints :  employerEmailId**
 - **Columns Used:  job_id, job_tittle, job_describtion,job_location, job_salary, company_name, employe_name,employe_emailid, applied_date, job_type**





# Summary

 Spring Project that is a Job Search Portal.
The model will have the following attribute
**jobid**,
**jobtittle**,
**jobdescribtion**,
**joblocation**,
**jobsalary**,
**appliedDate**,
**employeemail**,
**companyname**,
**employeename**
**jobtype**. Along with these proper validations are also provided.Used CRUD operation,Custom finders and Custom Query
to do necessary operations






# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  

