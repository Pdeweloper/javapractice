class Multilevel_InheritanceMain
{
	public static void main(String...x)
	{
		//here we create obj of Employee Class and inheriting features of Admin and Manager class.
		Employee em = new Employee();
		
		em.setname("Raja");
		em.setid(121);
		em.setsalary(12000);
		em.setproject_name("Welding");
		
		//here we create obj of Manager Class and inheriting features of Admin class.
		Manager mg = new Manager();
		
		mg.setname("Shayam");
		mg.setid(21);
		mg.setsalary(50000);
		
		//here we create obj of Admin Class.
		Admin ad = new Admin();
		
		ad.setname("Ram");
		ad.setid(1);
		
		//Displaying Data of Admin, Manager and Employee
		System.out.println(String.format("Admin name : %s \nAdmine ID : %d",ad.getname(),ad.getid()));
		
		System.out.println();
		
		System.out.println(String.format("Manager name : %s \nManager ID : %d \nManager Salary : %d",mg.getname(),mg.getid(),mg.getsalary()));
		
		System.out.println();
		
		System.out.println(String.format("Employee name : %s \nEmployee ID : %d \nEmployee Salary : %d \nEmployee Project Name : %s",em.getname(),em.getid(),em.getsalary(),em.getproject_name()));
	}
}