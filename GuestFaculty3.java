package rohit_project;

public class GuestFaculty3 extends Faculty3{
 private int perLactureSalary,totalTime,monthlySalary;
 public void setPerLactureSalary(int perLactureSalary)
 {
	 this.perLactureSalary=perLactureSalary;
 }
 public void setTotalTime(int totalTime)
 {
	 this.totalTime=totalTime;
 }
 public void setMonthlySalary()
 {
	 monthlySalary=perLactureSalary*26;
 }
 public int getPerLactureSalary()
 {
	 return perLactureSalary;
 }
 public int getTotalTime()
 {
	 return totalTime;
 }
 public int getMonthlySalary()
 {
	 return monthlySalary;
 }
}
