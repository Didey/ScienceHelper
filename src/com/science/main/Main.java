package com.science.main;

import javax.swing.*;

public class Main {
	
	public static void findDensity() {
		String GET_MASS = JOptionPane.showInputDialog(null, "What is the mass of the substance?");
		int CUR_MASS = Integer.parseInt(GET_MASS);
		String GET_VOL = JOptionPane.showInputDialog(null, "What is the volume of the substance?");
		int CUR_VOL = Integer.parseInt(GET_VOL);
		int FINAL_DENSITY = CUR_MASS / CUR_VOL;
		JOptionPane.showMessageDialog(null, "The density of the substance is: " + String.valueOf(FINAL_DENSITY));
	}
	
	public static void findMass(){
		String GET_DENSITY = JOptionPane.showInputDialog(null, "What is the density of the substance?");
		int CUR_DENSITY = Integer.parseInt(GET_DENSITY);
		String GET_VOLUME = JOptionPane.showInputDialog(null, "What is the volume of the substance?");
		int CUR_VOLUME = Integer.parseInt(GET_VOLUME);
		int FINAL_MASS = CUR_DENSITY * CUR_VOLUME;
		JOptionPane.showMessageDialog(null, "The mass of the substance is " + String.valueOf(FINAL_MASS));
	}
	
	public static void findVolume(){
		String GET_MASS = JOptionPane.showInputDialog(null, "What is the mass of the substance?");
		int CUR_MASS = Integer.parseInt(GET_MASS);
		String GET_DENSITY = JOptionPane.showInputDialog(null, "What is the density of the substance?");
		int CUR_DENSITY = Integer.parseInt(GET_DENSITY);
		int FINAL_VOLUME = CUR_MASS / CUR_DENSITY;
		JOptionPane.showMessageDialog(null,  "The volume of the substance is " + String.valueOf(FINAL_VOLUME));
	}

	public static void main(String args[]) {
		findDensity();
		// there is no need to be upset - ninjaflame555
	}

}
