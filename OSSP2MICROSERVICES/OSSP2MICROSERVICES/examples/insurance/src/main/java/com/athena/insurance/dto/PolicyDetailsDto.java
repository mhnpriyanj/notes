package com.athena.insurance.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PolicyDetailsDto {
	private int policyNo;
	private int planNo;
	private String planName;
	private int memberNo;
	private String policyHolderName;
	private LocalDate dob;
	private String gender;
	private LocalDate policyStartDate;
	private LocalDate policyEndDate;
	private double premiumAmount;
	private double insurredAmount;
	private String status;

}
