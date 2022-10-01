import java.util.*;
import java.io.*;
import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {

		String semesters = JOptionPane.showInputDialog("Enter Total Semesters: ");
		int sem = Integer.parseInt(semesters);
		double totalsem = 0.0;

		for(int i=0; i<sem - 1; i++) {
		
			int j = i;	j++;
			double d[] = new double[sem];
			String x = JOptionPane.showInputDialog("Semester " + j + " SGPA: ");
			d[i] = Double.parseDouble(x);
			totalsem += d[i];

		}

		String sizeS = JOptionPane.showInputDialog("Enter Total Subjects: ");
		int size = Integer.parseInt(sizeS);

		int num[] = new int[size];
		double credithrs[] = new double[size];
		double totalCreditHrs = 0.0;
		double total = 0.0;

		for(int i=0; i<size; i++) {

			int j = i;
			j++;
			String x = JOptionPane.showInputDialog("Subject " + j + " Marks: ");
			num[i] = Integer.parseInt(x);

			String y = JOptionPane.showInputDialog("Subject " + j + " Credit Hrs: ");
			credithrs[i] = Double.parseDouble(y);
			totalCreditHrs += credithrs[i];

			if(num[i] >= 85) 
				total = total + (credithrs[i] * 4.00);
			else if(num[i] >= 80 && num[i] <= 84)
				total = total + (credithrs[i] * 3.70);
			else if(num[i] >= 75 && num[i] <= 79)
				total = total + (credithrs[i] * 3.30);
			else if(num[i] >= 70 && num[i] <= 74)
				total = total + (credithrs[i] * 3.00);
			else if(num[i] >= 65 && num[i] <= 69)
				total = total + (credithrs[i] * 2.70);
			else if(num[i] >= 61 && num[i] <= 64)
				total = total + (credithrs[i] * 2.30);
			else if(num[i] >= 58 && num[i] <= 60)
				total = total + (credithrs[i] * 2.00);
			else if(num[i] >= 55 && num[i] <= 57)
				total = total + (credithrs[i] * 1.70);
			else if(num[i] >= 50 && num[i] <= 54)
				total = total + (credithrs[i] * 1.00);
			else if(num[i] < 50)
				total = total + (credithrs[i] * 0.00);

		}

		double sgpa = total / totalCreditHrs;
		JOptionPane.showMessageDialog(null, "SGPA = " + sgpa);

		double tcgpa = totalsem + sgpa;
		double cgpa = tcgpa / sem;
		JOptionPane.showMessageDialog(null, "CGPA = " + cgpa);

	
	}

}