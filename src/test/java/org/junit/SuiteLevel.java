package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({SampleJunit.class,SampleJunit2.class,SampleJunit3.class})


public class SuiteLevel {
	
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(SuiteLevel.class);
		
		
		int failureCount = runClasses.getFailureCount();
		
		System.out.println("Failure Count: " +failureCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		
		System.out.println("Ignor count: " +ignoreCount);
		
		int runCount = runClasses.getRunCount();
		
		System.out.println("Run Count: " +runCount);
		
		long runTime = runClasses.getRunTime();
		
		System.out.println("Run time: " +runTime);
		
		
		List<Failure> failures = runClasses.getFailures();
		
		for (Failure failure : failures) {
			
			System.out.println(failure);
		}
		
	}

}
