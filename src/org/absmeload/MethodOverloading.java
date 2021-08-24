package org.absmeload;

public class MethodOverloading {

public void empinfo() {
System.out.println("Employee info : ");
}	
		public void empinfo(String name) {
System.out.println("Employee name is  "+name);
		}
		public void empinfo(String add, int id) {
System.out.println("Employee address is " +add);
System.out.println("Employee id is " + id);
		}
		public void empinfo(long mobno,String email) {
System.out.println("Employee mobile number is"+ mobno);
System.out.println("Employee email is " + email);
		}
		
		public static void main(String[] args) {
			MethodOverloading m = new MethodOverloading();
			m.empinfo("Monisha");
			m.empinfo("Virugambakkam", 82);
			m.empinfo(8027474, "swarnamonisha@gmail.com");
			
		}
		
	}

