package com.oozinoz.firework;

import com.oozinoz.simulation.*;

public class OozinozRocket extends PhysicalRockets implements RocketSim{
	private double time;

	public OozinozRocket(
			double burnArea,
			double burnRate,
			double fuelMass,
			double totalMass){
		super(burnArea, burnRate, fuelMass, totalMass);
	}

	public double getMass(){
		return getMass(time);
	}

	public double getThrust(){
		return getThrust(time);
	}

	public void setsimTime(double time){
		this.time = time;
	}
}