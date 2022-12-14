package studentMiniProj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Patient implements Comparable<Patient> 
{
	int patientID;
	String patientName; 
	String patientAddress; 
	int age;
	String patientIllness;
	float amountForAppointment;
	HospitalProcess hm = new HospitalProcess();
	Patient()
	{}
	public int compareTo(Patient p) 
	{
		return this.patientID = p.patientID; 
		}
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Patient(int patientID,String patientName,String patientAddress,int age,String patientIllness,float amountForAppointment)
	{
		this.patientID=patientID;
		this.patientName=patientName;
		this.patientAddress=patientAddress; 
		this.age=age;
		this.patientIllness=patientIllness;
		this.amountForAppointment=amountForAppointment;
		} 
	void registerPatient()throws IOException //function to insert new patient records
	{
		Patient pr = new Patient();
		int patientID= hm.arl.size();
		pr.patientID = patientID+1;
		System.out.println("Enter Patient name:");
		pr.patientName = br.readLine();
		System.out.println("Enter Patient Address:");
		pr.patientAddress = br.readLine();
		System.out.println("Enter Patient Age:"); 
		pr.age = Integer.parseInt(br.readLine());
		System.out.println("Enter Patient Illness:");
		pr.patientIllness = br.readLine(); 
		System.out.println("Enter the amount patient needs to pay for appointment:");
		pr.amountForAppointment = Float.parseFloat(br.readLine()); 
		hm.arl.add(pr);
		}
	
	void removeInactivePatient() throws IOException //function to remove patient records
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter Patient ID:"); 
		System.out.println("\n============================="); 
		int id1 = Integer.parseInt(br.readLine()); 
		
		for(int i=0; i<hm.arl.size(); i++)
		{
			if(id1 == hm.arl.get(i).patientID)
			{
				hm.arl.remove(hm.arl.get(i));
				System.out.println("Record deleted successfully!!");
				}
			
				else
				{
					System.out.println("No record available!!");
				}
			}

	
	}
	
	void updatePatientDetails() throws IOException 
	{
		char l='n';
		Patient p2 = new Patient(patientID, patientName, patientAddress, age, patientIllness, amountForAppointment);
		do
		{
			System.out.println("Enter patient ID you want to update:"); 
			System.out.println("\n============================="); 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int idnum = Integer.parseInt(br.readLine());
			for(int i=0; i<hm.arl.size();i++)
			{
				if(idnum == hm.arl.get(i).patientID) 
				{
					System.out.println("Enter \n 1 to change patient's name.\n==================== \n 2 to change patient's address.\n==================== \n 3 to change patient's age.\n==================== \n 4 to change patient's illness. \n====================\n 5 to change registration fees along with the medical expenses.\n====================");
					int ch = Integer.parseInt(br.readLine());
					switch(ch)
					{
					case 1: System.out.println("Enter new patient's name:");
					System.out.println("\n============================="); 
					p2.patientName = br.readLine(); 
					p2.patientID= hm.arl.get(i).patientID;
					p2.patientAddress= hm.arl.get(i).patientAddress;
					p2.age=hm.arl.get(i).age; 
					p2.patientIllness = hm.arl.get(i).patientIllness;
					p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
					hm.arl.set(i,p2); 
					System.out.println("Patient details updated !!!");
					System.out.println("\n============================="); 
					break; 
					case 2: System.out.println("Enter new patient Address:");
					System.out.println("\n============================="); 
					p2.patientAddress = br.readLine();
					p2.patientID = hm.arl.get(i).patientID;
					p2.patientName = hm.arl.get(i).patientName; 
					p2.age = hm.arl.get(i).age;
					p2.patientIllness = hm.arl.get(i).patientIllness; 
					p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
					hm.arl.set(i,p2);
					System.out.println("Patient details updated !!!");
					System.out.println("\n============================="); 
					break;
					case 3: System.out.println("Enter new Patient age:");
					System.out.println("\n============================="); 
					p2.age = Integer.parseInt(br.readLine());
					p2.patientID = hm.arl.get(i).patientID;
					p2.patientName = hm.arl.get(i).patientName;
					p2.patientAddress = hm.arl.get(i).patientAddress;
					p2.patientIllness = hm.arl.get(i).patientIllness;
					p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
					hm.arl.set(i,p2);
					System.out.println("Patient details updated !!!");
					System.out.println("\n============================="); 
					break;
					case 4: System.out.println("Enter new Patient illness:");
					System.out.println("\n============================="); 
					p2.age = hm.arl.get(i).age;
					p2.patientID= hm.arl.get(i).patientID;
					p2.patientName = hm.arl.get(i).patientName;
					p2.patientAddress = hm.arl.get(i).patientAddress;
					p2.patientIllness = br.readLine();
					p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
					hm.arl.set(i,p2); 
					System.out.println("Patient details updated !!!");
					System.out.println("\n============================="); 
					break; 
					case 5: System.out.println("Enter the new amount that patient needs to pay:");
					System.out.println("\n============================="); 
					p2.age = hm.arl.get(i).age;
					p2.patientID = hm.arl.get(i).patientID;
					p2.patientName = hm.arl.get(i).patientName;
					p2.patientAddress = hm.arl.get(i).patientAddress;
					p2.patientIllness = hm.arl.get(i).patientIllness;
					p2.amountForAppointment = Float.parseFloat(br.readLine());
					hm.arl.set(i,p2); 
					System.out.println("Patient details updated !!!");
					System.out.println("\n============================="); 
					break;
					default: System.out.println("Invalid choice.");
					System.out.println("\n============================="); 
					break;
					} 
				}
			} 
			System.out.println("Do you want to continue updating (y/n):");
			System.out.println("\n============================="); 
			l=(char)br.read();
			}while(l=='y');
		} 
	void showPatientDetails() 
	{
		System.out.println("patient-ID \t Patient-Name \t Address \t Age  \t Illness \t Fees");
		System.out.println("\n============================="); 
		for(int i=0; i<hm.arl.size(); i++)
		{
			System.out.println(hm.arl.get(i).patientID + " \t\t "+hm.arl.get(i).patientName+" \t\t "+hm.arl.get(i).patientAddress+" \t "+hm.arl.get(i).age+" \t "+" \t "+hm.arl.get(i).patientIllness+" \t"+hm.arl.get(i).amountForAppointment); 
			System.out.println("\n============================="); 
			}
		}


}

