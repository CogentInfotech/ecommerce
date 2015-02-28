package com.ecommerce.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	// @Around("execution(* *(..)) && @annotation(Loggable)")
	
	@Around("execution(* org.springframework.web.servlet.mvc.Controller.*(. .))")
	public void loggingController(ProceedingJoinPoint joinPoint)
			throws Throwable {

		joinPoint.proceed();
		System.out
				.println("************************************************************");
		System.out.println("Service Around() is running!");
		System.out.println(" ECommerce AOP Logging: "
				+ joinPoint.getSignature().getName());
		System.out
				.println("************************************************************");
	}

	@After("execution(* org.springframework.web.servlet.mvc.Controller.*(. .))")
	public void loggingAfter(JoinPoint jp) throws Throwable {

		System.out
				.println("************************************************************");
		System.out.println("Service After() is running!");

		System.out
				.println("************************************************************");
	}

	@Before("execution(* org.springframework.web.servlet.mvc.Controller.*(. .))")
	public void loggingBefore(JoinPoint jp) throws Throwable {

		// joinPoint.proceed();
		System.out
				.println("************************************************************");
		System.out.println("Service Before () is running!");

		System.out
				.println("************************************************************");
	}

	/*
	 * @Around("execution(* com.ecommerce.rest.SearchService.getProducts(..))")
	 * public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
	 * 
	 * System.out.println("logAround() is running!");
	 * System.out.println("hijacked method : " +
	 * joinPoint.getSignature().getName());
	 * System.out.println("hijacked arguments : " +
	 * Arrays.toString(joinPoint.getArgs()));
	 * 
	 * System.out.println("Around before is running!"); joinPoint.proceed();
	 * System.out.println("Around after is running!");
	 * 
	 * System.out.println("******");
	 * 
	 * }
	 */
}