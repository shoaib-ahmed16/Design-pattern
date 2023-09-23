package BehavioralPattern.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {  
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter the first value: ");  
        float value1=Float.parseFloat(br.readLine());  
        System.out.print("Enter the second value: ");  
        float value2=Float.parseFloat(br.readLine());  
        Context context = new Context(new Addition()); 
        System.out.println("Please enter the Serial number to do calculation operation");
        System.out.println("1. Multiplication");
        System.out.println("2. Divison");
        System.out.println("3. Addition");
        System.out.println("4. Subtraction");
        int perform=Integer.parseInt(br.readLine()); 
        
        switch(perform){
        	case 1:{
        		  context = new Context(new Multiplication());        
        	      System.out.println("Multiplication = " + context.executeStrategy(value1, value2));
        	      break;
        	}
        	case 2:{
	      		  context = new Context(new Division());        
	      	      System.out.println("Divison = " + context.executeStrategy(value1, value2));
	      	      break;
        	}
        	case 3:{
	      		  context = new Context(new Addition());        
	      		  System.out.println("Addition = " + context.executeStrategy(value1, value2)); 
	      	      break;
        	}
        	case 4:{
	        		context = new Context(new Subtraction());       
	                System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  
	                break;
        	}
        	default:{
        		System.out.println("Invalid Mathematical Operation action");
        	    break;
        	}
        }  
	}
}
