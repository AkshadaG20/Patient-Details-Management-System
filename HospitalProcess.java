package studentMiniProj;

import java.util.*;
import java.io.*;
public class HospitalProcess 
{
	static ArrayList<Patient> arl = new ArrayList<Patient>(); 
	
	public static void main(String[] args) throws IOException 
	{
		char l='i'; 
		System.out.println("\t======================== Hospital Management System ========================\n");
		Patient p1 = new Patient(1,"Hari", "Hyderabad", 40, "Fever", 250f); 
		arl.add(p1);
		Patient p2 = new Patient(2,"Rani", "Pune", 45, "Cough", 250f);
		arl.add(p2);
		Patient p3 = new Patient(3,"James", "Mumbai", 56, "Cancer", 250f); 
		arl.add(p3); 
		 
		do
		{
			Patient p = new Patient(); 
			System.out.println("Enter 1 to register a Patient \n================== \n 2 to update Patient details\n================== \n 3 to Deactivate Patient details\n================== \n 4 to display Patient details\n==================");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int choice = Integer.parseInt(br.readLine());
			switch(choice) 
			{
			case 1: p.registerPatient();
			System.out.println("Patient Registered Successfully !!!");
			p.showPatientDetails(); 
			System.out.println("\n============================="); 
			break; 
			case 2: p.showPatientDetails(); 
			p.updatePatientDetails();
			System.out.println("\n============================="); 
			break;
			case 3: p.removeInactivePatient();
			System.out.println("\n============================="); 
			break;
			case 4: Collections.sort(arl);
			p.showPatientDetails(); 
			System.out.println("\n============================="); 
			break;
			default: System.out.println("Patient does not exist with the entered ID");
			System.out.println("Try again");
			System.out.println("\n============================="); 
			break;
			}
			System.out.println("Do you want to continue selecting options (y/n):");
			l=(char)br.read();
			}
		while(l=='y');
		}
	} 