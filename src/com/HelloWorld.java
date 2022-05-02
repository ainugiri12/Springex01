package com;

public class HelloWorld {
	   private String message;
	   int a,b,c;

	   public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setMessage(String message){
	      this.message  = message;
	      
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void sum() {
		   c=a+b;
		   System.out.println("The Sum of "+a +"and "+b+" is "+c);
	   }
	   public void diff() {
		   c=a-b;
		   System.out.println("The difference of "+a +"and "+b+" is "+c);
	   }
	   public void mul() {
		   c=a*b;
		   System.out.println("The multiplication of "+a +"and "+b+" is "+c);
	   }
	   public void div() {
		   c=a/b;
		   System.out.println(a +" divide by "+b+" is "+c);
	   }
	   public void mod() {
		   c=a%b;
		   System.out.println("While dividing "+a +"by "+b+" the remainder is "+c);
	   }
	}