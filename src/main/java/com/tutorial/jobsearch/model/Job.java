package com.tutorial.jobsearch.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="tbl_job",
          uniqueConstraints = @UniqueConstraint(
        		  
        		  name="employermail_unique",
        		  columnNames = "employerEmailId"
        		  )
		)
public class Job {
	
	
	@Id
	@SequenceGenerator(
			name = "job_sequence",
			sequenceName = "job_sequence",
			allocationSize = 1
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private Long jobId;
	
	@NotEmpty
	@Size(min =1,max=200)
	private String jobTittle;
	@NotEmpty
	@Size(min =1,max=200)
	private String jobDescription;
	@NotEmpty
	private String jobLocation;
	@Positive
	private Double jobSalary;
	@NotEmpty
	private String companyName;
	@NotEmpty
	@Size(min =1,max=30)
	private String employerName;
	@Email
	private String employerEmailId;
	
	@DateTimeFormat
	@PastOrPresent
	private LocalDate appliedDate;
	@Enumerated(EnumType.STRING)
	  private JobCategory jobType;
	
	
	

	
	
	
	  
	
	


	
	
	
}
