package org.test;

public abstract class Company {      //partical abstract
	                       //parent class
	                       //abstract class have both abstract & non abstract methods
     public void compName() {
	   System.out.println("capgameni");
	}
     
     public void compBranch(){
    	 System.out.println("Delhi");
     }
     
     public void compId() {
    	 System.out.println("cg10001");
     }
     
     //abstract method (doesnot contain method body and bussiness logic details
     public abstract void compTrunOver();
     
}
