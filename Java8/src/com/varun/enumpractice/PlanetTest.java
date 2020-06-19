package com.varun.enumpractice;

import java.util.stream.Stream;

public class PlanetTest {
	private static double weightOnEarth = 56d;
    private static double mass = weightOnEarth/Planet.EARTH.surfaceGravity();
	
	public static void printWeightOnPlanet(Planet planet) {
		System.out.printf("Your weight on %s is %f \n", planet, planet.surfaceWeight(mass));
	}
	
	public static void main(String[] args) {
		
		Stream.of(Planet.values())
			  .forEach(PlanetTest::printWeightOnPlanet);
	}
}
