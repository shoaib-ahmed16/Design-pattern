package BehavioralPattern.Observer;

import java.util.Observable;

public class ResponseHandler2 implements Observer {  
    private String resp;  
    
    @Override
    public void update(Observable obj, Object arg) {  
        if (arg instanceof String) {  
            resp = (String) arg;  
            System.out.println("\nReceived Response: " + resp );  
        }  
    }  
}