//*******************************************************************
// James Rangel - Assignment 1
//
// Objective: Design an algorithm to find the weighted average of six
// test scores and the weighted average of six assignment scores and
// then get the master average between the two weighted averages.
//
// Test Scores and Weights
// 75  0.10
// 95  0.20
// 85  0.25
// 55  0.25
// 65  0.10
// 70  0.10
//
// Assignment Scores and Weights
// 55  0.05
// 65  0.10
// 65  0.15
// 60  0.25
// 55  0.25
// 50  0.20
//*******************************************************************

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args)
	{
		int testScore1, testScore2, testScore3, 
		testScore4, testScore5, testScore6;
		
		int assignmentScore1, assignmentScore2, assignmentScore3, 
		assignmentScore4, assignmentScore5, assignmentScore6;
		
		double testWeight1, testWeight2, testWeight3, 
		testWeight4, testWeight5, testWeight6;
		
		double assignmentWeight1, assignmentWeight2, assignmentWeight3, 
		assignmentWeight4, assignmentWeight5, assignmentWeight6;
		
		double weightedTest;
		double weightedAssignment;
		double masterAverage;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Test Score: ");
		testScore1 = scan.nextInt();
		
		System.out.println("Enter 1st Test Score Weight: ");
		testWeight1 = scan.nextDouble();
		
		System.out.println("Enter 2nd Test Score: ");
		testScore2 = scan.nextInt();
		
		System.out.println("Enter 2nd Test Score Weight: ");
		testWeight2 = scan.nextDouble();
		
		System.out.println("Enter 3rd Test Score: ");
		testScore3 = scan.nextInt();
		
		System.out.println("Enter 3rd Test Score Weight: ");
		testWeight3 = scan.nextDouble();
		
		System.out.println("Enter 4th Test Score: ");
		testScore4 = scan.nextInt();
		
		System.out.println("Enter 4th Test Score Weight: ");
		testWeight4 = scan.nextDouble();
		
		System.out.println("Enter 5th Test Score: ");
		testScore5 = scan.nextInt();
		
		System.out.println("Enter 5th Test Score Weight: ");
		testWeight5 = scan.nextDouble();
		
		System.out.println("Enter 6th Test Score: ");
		testScore6 = scan.nextInt();
		
		System.out.println("Enter 6th Test Score Weight: ");
		testWeight6 = scan.nextDouble();
		
		System.out.println("Enter 1st Assignment Score: ");
		assignmentScore1 = scan.nextInt();
		
		System.out.println("Enter 1st Assignment Score Weight: ");
		assignmentWeight1 = scan.nextDouble();
		
		System.out.println("Enter 2nd Assignment Score: ");
		assignmentScore2 = scan.nextInt();
		
		System.out.println("Enter 2nd Assignment Score Weight: ");
		assignmentWeight2 = scan.nextDouble();
		
		System.out.println("Enter 3rd Assignment Score: ");
		assignmentScore3 = scan.nextInt();
		
		System.out.println("Enter 3rd Assignment Score Weight: ");
		assignmentWeight3 = scan.nextDouble();
		
		System.out.println("Enter 4th Assignment Score: ");
		assignmentScore4 = scan.nextInt();
		
		System.out.println("Enter 4th Assignment Score Weight: ");
		assignmentWeight4 = scan.nextDouble();
		
		System.out.println("Enter 5th Assignment Score: ");
		assignmentScore5 = scan.nextInt();
		
		System.out.println("Enter 5th Assignment Score Weight: ");
		assignmentWeight5 = scan.nextDouble();
		
		System.out.println("Enter 6th Assignment Score: ");
		assignmentScore6 = scan.nextInt();
		
		System.out.println("Enter 6th Assignment Score Weight: ");
		assignmentWeight6 = scan.nextDouble();
		
		weightedTest = ((testScore1 * testWeight1) + (testScore2 * testWeight2) + 
				(testScore3 * testWeight3) + (testScore4 * testWeight4) + 
				(testScore5 * testWeight5) + (testScore6 * testWeight6));
		
		weightedAssignment = ((assignmentScore1 * assignmentWeight1) + (assignmentScore2 * assignmentWeight2) + 
				(assignmentScore3 * assignmentWeight3) + (assignmentScore4 * assignmentWeight4) + 
				(assignmentScore5 * assignmentWeight5) + (assignmentScore6 * assignmentWeight6));
		
		masterAverage = ((weightedTest + weightedAssignment) / 2);
		
		
		System.out.println("Weighted Test Score: " + (weightedTest) + "%");
		System.out.println("Weighted Assignment Score: " + (weightedAssignment) + "%");
		System.out.println("Master Average: " + (masterAverage) + "%");
		
	}
}
