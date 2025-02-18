package ru.globux.spring.ch5;

import ru.globux.spring.ch2.common.Guitar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ComplexAdvice {
	public void simpleBeforeAdvice(JoinPoint joinPoint, Guitar value) {
		if(value.getBrand().equalsIgnoreCase("Gibson")) {
			System.out.println("Executing: " +
					joinPoint.getSignature().getDeclaringTypeName() + " "
					+ joinPoint.getSignature().getName());
		}
	}

	public Object simpleAroundAdvice(ProceedingJoinPoint pjp, Guitar value) throws Throwable {
		System.out.println("Before execution: " +
				pjp.getSignature().getDeclaringTypeName() + " "
				+ pjp.getSignature().getName()
				+ " argument: " + value.getBrand());

		Object retVal = pjp.proceed();

		System.out.println("After execution: " +
				pjp.getSignature().getDeclaringTypeName() + " "
				+ pjp.getSignature().getName()
				+ " argument: " + value.getBrand());

		return retVal;
	}
}
