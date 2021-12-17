package com.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Aishwarya_Time 
{
	public static void main(String[] args) 
	{
		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime pastTime=currentTime.plusHours(7);
		System.out.println(pastTime);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Todays date & time "+ldt);
		
		LocalDateTime birthday=LocalDateTime.of(1997, 8, 30, 10, 30);
		
		Duration duration=Duration.between(birthday,ldt);
		System.out.println("I have lived for "+duration.toDays()+"days");
		
		long years=ChronoUnit.YEARS.between(birthday, ldt);
		System.out.println("Your age is "+years+" years");
	
	}
}

