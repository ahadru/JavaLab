package main;

public class Sound {
	public double calculateDistance(double timeInterval) {
		int soundVelocity = 1100;
		
		double distance = timeInterval * soundVelocity;
		return distance;
	}
}