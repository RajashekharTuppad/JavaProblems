package com.kd.SortingOfComplex_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee s1 = new Employee(01, "Raj", 50000);
		Employee s2 = new Employee(02, "RoyalRaj", 65000);
		Employee s3 = new Employee(03, "Rajashekhar", 60000);

		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(s1);
		employeelist.add(s2);
		employeelist.add(s3);

		System.out.println(":::::Before Sorting:::::");
		System.out.println(employeelist);

		/*
		 * 
		 * Collections.sort(studentlist); this method is not applicable directly because
		 * of complex sorting that's reason we have to use 1) Comparable(I) 2)
		 * Comparator(I)
		 * 
		 */

		// Collections.sort(studentlist);

		// only in java 8 version
		System.out.println("-----------------------------------------");
		Collections.sort(employeelist, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				if (s1.empId > s2.empId) {
					return 1;
				} else if (s1.empId < s2.empId) {
					return -1;
				} else {
					return 0;
				}

			}
		});

		System.out.println("");
		System.out.println(":::::After Sorting Based on employeeId Ascending::::");
		System.out.println(employeelist);

		System.out.println("-----------------------------------------");
		Collections.sort(employeelist, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				return s1.getEmpName().compareTo(s2.getEmpName());
			}
		});
		System.out.println("");
		System.out.println(":::::After Sorting Based on Employee Name Ascending::::");
		System.out.println(employeelist);

		System.out.println("-----------------------------------------");
		Collections.sort(employeelist, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				if (s1.salary > s2.salary) {
					return 1;
				} else if (s1.salary < s2.salary) {
					return -1;
				} else {
					return 0;
				}

			}
		});
		System.out.println("");
		System.out.println(":::::After Sorting Based on salary Ascending::::");
		System.out.println(employeelist);

		System.out.println("-----------------------------------------");
		Collections.sort(employeelist, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				if (s1.empId > s2.empId) {
					return -1;
				} else if (s1.empId < s2.empId) {
					return 1;
				} else {
					return 0;
				}

			}
		});

		System.out.println("");
		System.out.println(":::::After Sorting Based on employeeId Descending::::");
		System.out.println(employeelist);

		System.out.println("-----------------------------------------");
		Collections.sort(employeelist, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				return s2.getEmpName().compareTo(s1.getEmpName());
			}
		});
		System.out.println("");
		System.out.println(":::::After Sorting Based on Employee Name Descending::::");
		System.out.println(employeelist);

		System.out.println("-----------------------------------------");
		Collections.sort(employeelist, new Comparator<Employee>() {
			public int compare(Employee s1, Employee s2) {
				if (s1.salary > s2.salary) {
					return -1;
				} else if (s1.salary < s2.salary) {
					return 1;
				} else {
					return 0;
				}

			}
		});
		System.out.println("");
		System.out.println(":::::After Sorting Based on salary Descending::::");
		System.out.println(employeelist);

	}

}
