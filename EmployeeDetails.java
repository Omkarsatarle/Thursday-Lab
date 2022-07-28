 class EmployeeInfo 

{
    String Name;
    int Year;
    String Address;
    
    EmployeeInfo(String name,int years,String address)
    {
    	Name=name;
    	Year=years;
    	Address=address;
    }
    void Sam()
    {
    System.out.println(" "+Name+ "              "+"  "+Year+"                "+Address+"");
    }
    void Robert()
    {
    System.out.println(" "+Name+ "            "+" "+Year+"                "+Address+"");
    }
    void John()
    {
    System.out.println(" "+Name+ "              "+" "+Year+"                "+Address+"");
    }
}
class EmployeeDetails
{
	public static void main(String[] args) 
	{
		System.out.println("Name"+"       Year of Joining"+"                    Address");
        EmployeeInfo e=new EmployeeInfo ("Sam",          2000,               "680-WallsStreet");
        e.Sam(); 
        EmployeeInfo e1=new EmployeeInfo("Robert",       1994,               "64C-WallsStreet");
        e1.Robert();
        EmployeeInfo e2=new EmployeeInfo ("John",        1999,               "26B-WallsStreet");
        e2.John();
	}
}