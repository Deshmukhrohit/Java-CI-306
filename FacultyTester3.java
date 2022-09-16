package rohit_project;

public class FacultyTester3 {

	public static void main(String[] args) {
		Faculty f=new Faculty();
		f.setName("Raj");
		f.setSub("DBMS");
		f.setSalary(30000);
		f.setAnnualSalary();
		f.setCheck();
		System.out.println("Faculty Name = "+f.getName());
		System.out.println("Subject = "+f.getSub());
		System.out.println("Salary = "+f.getSalary());
		System.out.println("Annual Salary = "+f.getAnnualSalary());

		GuestFaculty gf=new GuestFaculty();
		gf.setName("Monoj");
		gf.setSub("Operating System");
		gf.setPerLactureSalary(400);
		gf.setTotalTime(2);
		gf.setMonthlySalary();
		System.out.println("GuestFaculty Name = "+gf.getName());
		System.out.println("Subject = "+gf.getSub());
		System.out.println("Salary per Lacture = "+gf.getPerLactureSalary());
		System.out.println("Total Time = "+gf.getTotalTime());
		System.out.println("Monthly Salary of Guest Faculty = "+gf.getMonthlySalary());
		
		ContractFaculty cf=new ContractFaculty();
		cf.setName("Anil");
		cf.setSub("TOC");
		cf.setContractAmount(20000);
		cf.setContractDuraction(15);
		System.out.println("Contract Faculty Name = "+cf.getName());
		System.out.println("Subject = "+cf.getName());
		System.out.println("Contract Amount = "+cf.getContractAmount());
		System.out.println("Contract Duraction = "+cf.getContractDuraction());


	}

}
