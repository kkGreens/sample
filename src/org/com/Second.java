package org.com;

public class Second {
	
	//method creation
		private void empId() {
			System.out.println("001");
		}
		
		private void empName() {
			System.out.println("Naveen");
		}
		
		public static void main(String[] args) {
			
			// object creation
			Second e = new Second();
			
			// method calling
			e.empId();
			e.empName();
		}

}
