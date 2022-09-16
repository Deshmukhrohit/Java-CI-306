package rohit_project;

public class Faculty3 {
  private String name,sub;
  private int salary,annualSalary,tax=0;
  public void setName(String name)
  {
	  this.name=name;
  }
  public void setSub(String sub)
  {
	  this.sub=sub;
  }
  public void setSalary(int salary)
  {
	  this.salary=salary;
  }
  public void setAnnualSalary()
  {
	  annualSalary=salary*12;
  }
  public void setCheck()
  {
	  if(annualSalary>500000)
	  {
		  tax=(int) (annualSalary*(0.1));
	  }
  }
  public String getName()
  {
	  return name;
  }
  public String getSub()
  {
	  return sub;
  }
  public int getSalary()
  {
	  return salary;
  }
  public int getAnnualSalary()
  {
	  
	  return (annualSalary-tax);
  }
}
