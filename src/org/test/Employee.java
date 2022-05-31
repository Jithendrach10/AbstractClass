package org.test;

public class Employee extends Company {
	 public void compName() {
		   System.out.println("Capgemini");
		}
	     
	     public void compBranch(){
	    	 System.out.println("chennai");
	     }
	     
	     public void compId() {
	    	 System.out.println("cg100456");
	     }
	     
	     //abstract method (doesnot contain method body and bussiness logic details
	     public void compTrunOver() {
	    	 System.out.println("90000000");
	     }
	     public void compTrunOver(long a) {
	    	 System.out.println(a);
	     }
	     
	     public void compArea() {
	    	 System.out.println("Thoraipakkam");
	     }
	     
	     public static void main(String[] args) {
	    	 Employee e = new Employee();
	    	 e.compName();
	    	 e.compBranch();
	    	 e.compId();
	    	 e.compTrunOver();
	    	 e.compTrunOver(900000000l);
	    	 e.compArea();
	     }
	  
}
