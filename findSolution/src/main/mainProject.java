package main;

import java.util.ArrayList;
import java.util.List;

public class mainProject {

	private static List<Integer> calender(boolean isLeap) {
		List<Integer> listOfYear = new ArrayList<Integer>();
		listOfYear.add(31);
		listOfYear.add(28);
		listOfYear.add(31);
		listOfYear.add(30);
		listOfYear.add(31);
		listOfYear.add(30);
		listOfYear.add(31);
		listOfYear.add(31);
		listOfYear.add(30);
		listOfYear.add(31);
		listOfYear.add(30);
		listOfYear.add(31);
		if (isLeap) {
			listOfYear.set(1, 29);
		}

		return listOfYear;
	}

	private static void calculator(StringBuilder result, List<Integer> dayOfMoth, int year) {
		int sum = 0;
		int moth = 1;
		for (Integer day : dayOfMoth) {
			sum = sum + day;
			moth++;
			if (sum > 256) {
				sum = sum - day;
				moth--;
				int a = 256 - sum;
				if (moth < 10) {
					result.append(a > 9 ? a : "0" + a).append(".").append(0).append(moth).append(".").append(year);
				} else {
					result.append(a > 9 ? a : "0" + a).append(".").append(moth).append(".").append(year);

				}
				break;
			}

		}

	}

	public static String dayOfProgrammer(int year) {
		StringBuilder result = new StringBuilder();
		List<Integer> dayOfMoth;
		if (year < 1918) {
			if (year % 4 == 0) {
				dayOfMoth = calender(true);
				calculator(result, dayOfMoth, year);
			} else {
				dayOfMoth = calender(false);
				calculator(result, dayOfMoth, year);
			}
		} else if (year == 1918) {
			result.append("26.09.1918");
		} else {
			if (year % 4 == 0 && year % 100 != 0) {
				dayOfMoth = calender(true);
				calculator(result, dayOfMoth, year);
			} else {
				if (year % 400 == 0) {
					dayOfMoth = calender(true);
				} else {
					dayOfMoth = calender(false);
				}
				calculator(result, dayOfMoth, year);
			}
		}

		// Write your code here
		return result.toString();
	}

	public static int pageCount(int n, int p) {
		int turning = 0;
		int turningBack = 0;
		int pagingP = (int) (p / 2);
		turning = pagingP;
		turningBack = (int) (n / 2) - pagingP;
		if (turning > turningBack) {
			return turningBack;
		}

		return turning;
	}

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// Write your code here
		int sum = 0;
		int average = 0;
		int count = 0;
		for (Integer billNumber : bill) {
			if (count != k) {
				sum = sum + billNumber;
			}
		}
		average = sum / (bill.size() - 1);
		System.out.print(average - b);
	}

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		/*
		 * Write your code here.
		 */
		int indexKeyboards = - 1;
		int indexDrives = -1 ;
		int saveResult= -1 ;
		for (int cKeyboards = 0; cKeyboards < keyboards.length; cKeyboards++) {
			for (int cDrives = 0; cDrives < drives.length; cDrives++) {
				int calcultator = b - keyboards[cKeyboards] - drives[cDrives] ;
				if (calcultator >= 0) {
					if(saveResult == -1) {
						indexKeyboards = cKeyboards;
						indexDrives = cDrives;
						saveResult = calcultator;
					}
					if (saveResult > calcultator) {
						indexKeyboards = cKeyboards;
						indexDrives = cDrives;
						saveResult = calcultator;
					} 

				}
			}
		}
		if ( indexKeyboards == -1 ) {
			return -1;
		}
		return keyboards[indexKeyboards] + drives[indexDrives];
	}
	static String catAndMouse(int x, int y, int z) {
		String result = "";
		int distanCatA = Math.abs(z-x);
		int distanCatB = Math.abs(z-y);
		if( distanCatA == distanCatB) {
			result = "Mouse C";
		}
		if ( distanCatA > distanCatB) {
			result = "Mouse B";
		} 
		if ( distanCatA < distanCatB) {
			result = "Mouse A";
		} 
		
		
		
		return result ;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(pageCount(5, 4));
		int[] a = new int[] {3,1};
		int[] b = new int[] {5,2,8};
		System.out.print(getMoneySpent(a,b,10));
		if (  false || false) {
			System.out.print("asdasd");
		}
	}

}
