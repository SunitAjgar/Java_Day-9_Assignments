import java.util.Random;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmpWageComputation {
	private  int monthlyWage;
	private  int monthlyHrs;
	private  int monthlyDays;
	
    private  int EmpWagePerHr;
	private  int fullWorkingHr;
	private  int partTimeWage;
	private  int partWorkingHr;
	private  int fullWage;
	private  int partTimeWage1;
	private  int CustomfullWorkingHr;
	
  public static void main(String[] args) {
    System.out.println("--Welcome to Employee Wage Computation Program--");
    Scanner sc = new Scanner(System.in);
    EmpWageComputation emp = new EmpWageComputation();

    
    emp.setMonthlyDays(20);
    emp.setEmpWagePerHr(20);
    emp.setFullWorkingHr(8);
    emp.setPartWorkingHr(4);
    emp.setPartTimeWage(20);
    emp.checkEmpWage();
  }
	void checkEmpWage() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(3);
		switch (randomNum) {
		case 0:
		System.out.println("Employee is absent");
		break;
		
		case 1:
		System.out.println("Employee is present");
		fullWage = EmpWagePerHr * fullWorkingHr;
		System.out.println("The Daily Employee Wage for full time Employee is  " + fullWage + "$");
		System.out.println("Calculating Wage of a full time employee for a month");
		monthlyWage = monthlyDays * fullWage;
		System.out.println("The monthly wage of a full time employee is  " + monthlyWage + "$");
		System.out.println("Enter the working hours if it has met 100 hours or more");
		setCustomfullWorkingHr(sc.nextInt());
		int customSal = CustomfullWorkingHr * EmpWagePerHr;
		System.out.println("Calculating wages when working hours "+ CustomfullWorkingHr+ " is "  +customSal+ "$");
		
		break;
		
		case 2:
		System.out.println("Employee is part time present");
		partTimeWage1 = partTimeWage * partWorkingHr;
		System.out.println("The Daily Wage for the Part Time Employee is  " + partTimeWage1 + "$");
		break;
		}

	}
}


 
        