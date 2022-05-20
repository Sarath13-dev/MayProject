package com.abstractclass;

public class ControlStatements {

	private void votingEligibility(int age) {
		// 10>=18 - false
		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}
	}

	private void eligibilityForGym(int age, int weight, int height) {
		// 10>=18(F) 30>=50(F) F || F
		if (age >= 18 && weight >= 50 || height >= 120) {
			System.out.println("eligible for GYM");
		} else {
			System.out.println("not eligible");
		}
	}

	private void eligiblityForHalfticket(int age, int weight) {
		// 10>=12(F) || 60>=50(T)
		if (age >= 12 || weight >= 50) {
			System.out.println("full ticket");
		} else {
			System.out.println("half ticket");
		}
	}

	private void physicalCheckForArmy(int height, int weight, int marks) {
		if (height >= 170) {
			if (marks >= 70 && weight > 60) {
				System.out.println("joining the army");
			} else {
				System.out.println("Eligible for Selection, height is satisfied but marks or weight is not satisfied");
			}
		} else {
			System.out.println("height not satisfied not eligible for Selection");
		}
	}

	private void tallestStudent(int a, int b, int c) {
		// 170>170(F)
		if (a > b && a > c) {
			System.out.println("a is tallest");
		} else if (b > c && b > a) { // 170>130(T) && 170>170(F)
			System.out.println("b is tallest");
		} else {
			System.out.println("c is tallest");
		}
	}

	public static void main(String[] args) {
		ControlStatements a = new ControlStatements();
		a.votingEligibility(10);
		a.votingEligibility(30);
		a.eligiblityForHalfticket(10, 60);
		a.eligibilityForGym(10, 30, 100);
		a.physicalCheckForArmy(100, 70, 90);
		a.physicalCheckForArmy(180, 60, 50);
		a.physicalCheckForArmy(180, 70, 80);
		a.tallestStudent(170, 170, 130);

	}

}
