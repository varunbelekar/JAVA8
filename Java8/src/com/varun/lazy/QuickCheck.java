package com.varun.lazy;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class QuickCheck {

	public static void main(String[] args) {
		Random random = new Random();
//		Instant start = Instant.now();
//		Instant end = start.plus(random.nextInt(10), ChronoUnit.HOURS)
//				   .plus(random.nextInt(50), ChronoUnit.MINUTES)
//				   .plus(random.nextInt(50), ChronoUnit.SECONDS)
//				   .plusMillis(random.nextInt(900))
//				   .plusNanos(random.nextInt(900_000_000));
//		
//		System.out.println(Duration.between(start, end));
		
//		--
		
		Duration ninetySeconds = Duration.ofSeconds(90);
		System.out.println(ninetySeconds);
		
		
	}

}
