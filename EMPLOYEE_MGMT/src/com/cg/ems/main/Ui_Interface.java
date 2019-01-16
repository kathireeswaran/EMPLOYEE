package com.cg.ems.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class Ui_Interface {

	public static void main(String[] args) throws EMSException {
		Scanner scanner = new Scanner(System.in);
		boolean result = false;
		DateTimeFormatter formatter = null;
		LocalDate date = null;
		LocalDate joindate=null;
		boolean flag = false;
		EmployeeService service=null;
		do {
			System.out.println("Enter Username");
			String username = scanner.nextLine();
			System.out.println("Enter Password");
			String password = scanner.nextLine();

			 service = new EmployeeServiceImpl();
			try {
				result = service.validateFields(username, password);

				if (result == true) {
					int choice = 0;
					do {
						System.out.println("******EMPLOYEMENT MANAGEMENT ADMIN CONSOLE**********");
						System.out.println("1:Insert Employee Details :");
						System.out.println("2:Update Employee Details :");
						System.out.println("3:View Employee Details :");
						System.out.println();
						System.out.println("Enter Your Choices");
						choice = scanner.nextInt();
						scanner.nextLine();
						switch (choice) {
						case 1:
							System.out.println("Enter Your First Name");
							String firstname = scanner.nextLine();
							System.out.println("Enter Your Last Name");
							String lastname = scanner.nextLine();
							String dob = null;
							do {

								System.out.println("date of birth (dd-MM-yyyy)");
								dob = scanner.nextLine();

								formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

								try {
									date = LocalDate.parse(dob, formatter);
									flag = true;

								} catch (DateTimeParseException e) {
									flag = false;
									System.err.println(
											"date is not in the given format, give the date in dd-MM-yyyy format ");
								}
							} while (!flag);
							String joiningDate = null;
							do {

								System.out.println("date of joining (dd-MM-yyyy)");
								joiningDate = scanner.nextLine();

								formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

								try {
									joindate = LocalDate.parse(joiningDate, formatter);
									flag = true;

								} catch (DateTimeParseException e) {
									flag = false;
									System.err.println(
											"date is not in the given format, give the date in dd-MM-yyyy format ");
								}
							} while (!flag);
							int dchoice = 0;
							int deptId = 0;
							String design=null;
							do {
								System.out.println("Select Your Department");
								System.out.println("1:CLERK");
								System.out.println("2:SALESMAN");
								System.out.println("3:MANAGER");
								System.out.println("4:ANALYST");
								System.out.println();
								System.out.println("Enter Your Department");
								dchoice = scanner.nextInt();
								scanner.nextLine();
								switch (dchoice) {
								case 1:
									deptId = 10;
									design="CLERK";
									break;
								case 2:
									deptId = 20;
									design="SALESMAN";
									break;
								case 3:
									deptId = 30;
									design="MANAGER";
									break;
								case 4:
									deptId = 40;
									design="ANALYST";
									break;

								default:
									System.out.println("Invalid Selection");
									break;
								}

							} while (!(dchoice >= 1 && dchoice <= 4));
							String grade = null;
							int gchoice = 0;
							do {
								System.out.println("Select Your Grade");
								System.out.println("1.M1");
								System.out.println("2.M2");
								System.out.println("3.M3");
								System.out.println("4.M4");
								System.out.println("5.M5");
								System.out.println("6.M6");
								System.out.println("7.M7");
								System.out.println();
								System.out.println("Enter Your Grade");
								gchoice = scanner.nextInt();
								switch (gchoice) {
								case 1:
									grade = "M1";
									break;
								case 2:
									grade = "M2";
									break;
								case 3:
									grade = "M3";
									break;
								case 4:
									grade = "M4";
									break;
								case 5:
									grade = "M5";
									break;
								case 6:
									grade = "M6";
									break;
								case 7:
									grade = "M7";
									break;

								default:
									System.out.println("Invalid Selection");
									break;
								}

							} while (!(gchoice >= 1) && gchoice <= 7);
							int mchoice;
							String gender = null;
							do {
								System.out.println("select the gender");
								System.out.println("1.male");
								System.out.println("2.female");
								System.out.println("Select Your Choice");
								mchoice = scanner.nextInt();
								switch (mchoice) {
								case 1:
									gender = "M";
									break;
								case 2:
									gender = "F";
									break;
								default:
									System.out.println("Invalid Selection");
									break;
								}
							} while (!(mchoice > 0 && mchoice < 3));
							System.out.println("Enter Basic Salary");
							double basic = scanner.nextDouble();
							int martialchoice;
							String MartialStatus = null;
							do {
								System.out.println("Select Your Martial Status");
								System.out.println("1.Single");
								System.out.println("2.Married");
								System.out.println("3.Divorced");
								System.out.println("4.Separated");
								System.out.println("5.Windowed");
								System.out.println();
								System.out.println("Select Your Choice");
								martialchoice = scanner.nextInt();
								scanner.nextLine();
								switch (martialchoice) {
								case 1:
									MartialStatus = "Single";
									break;
								case 2:
									MartialStatus = "Married";
									break;
								case 3:
									MartialStatus = "Divorced";
									break;
								case 4:
									MartialStatus = "Separated";
									break;
								case 5:
									MartialStatus = "Widowed";
									break;

								default:
									System.out.println("Invalid Selection");
									break;
								}
							} while (!(martialchoice >= 1 && martialchoice <= 5));
							System.out.println("Enter Your Home Address");
							String address = scanner.nextLine();
							System.out.println("Enter Your phone");
							long phonenumber = scanner.nextLong();
							/*
							 * System.out.println(firstname); System.out.println(lastname);
							 * System.out.println(dob); System.out.println(joiningDate);
							 * System.out.println(deptId); System.out.println(design);
							 * System.out.println(grade); System.out.println(gender);
							 * System.out.println(basic); System.out.println(MartialStatus);
							 * System.out.println(address); System.out.println(phonenumber);
							 */
							Employee employee=new Employee();
							employee.setFirstName(firstname);
							employee.setLastName(lastname);
							employee.setDob(date);
							employee.setJoiningDate(joindate);
							employee.setDeptId(deptId);
							employee.setDesgn(design);
							employee.setGradeCode(grade);
							employee.setBasic(basic);
							employee.setMartialStatus(MartialStatus);
							employee.setAddress(address);
							employee.setPhonenumber(phonenumber);
							
							
							break;
						case 2:
							System.out.println("update");
							break;
						case 3:
							System.out.println("view");
							break;
						default:
							System.out.println("Invalid Selection Try Again");
							System.out.println();
							break;
						}
					} while (!(choice >= 1 && choice <= 3));

				} else {
					System.out.println("username/password mismatched");
					result = false;
				}
			} catch (EMSException e) {
				throw new EMSException("services doesnt established");
			}
		} while (!result);
		scanner.close();
	}

}
