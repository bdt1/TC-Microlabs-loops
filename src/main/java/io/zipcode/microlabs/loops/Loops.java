package io.zipcode.microlabs.loops;

//import java.util.Collections; //this is not used, wanted to use for problem with reverse loop TBC

public class Loops {

    public static String printArray(String[] input){
        String response = "*** Output ***";
        for(int x=0; x< input.length; x++){
            response +="\n" + input[x];
        }
        return response;
        
    }
    
    public static String printLastElement(String[] input){
        String response = "*** Output ***";
        int x = (input.length - 1);
            response +="\n" + input[x];
            return response;
            
        //both methods work
        //for(int x=0; x< input.length; x = input.length - 1){
           // response +="\n" + input[x];
       // }
        
    }

    public static String printLastButOne(String[] input){
        String response = "*** Output ***";
        int x = (input.length - 2);
            response +="\n" + input[x];
        
            return response;
    }

    public static String printReverse(String[] input){
        String response = "*** Output ***";
        for(int x= input.length - 1; x>=0; x--) {
            response +="\n" + input[x];
        }
        return response;
        
        /* Would like to learn to use ArrayList
        Collections.reverse(input).asList;
        */
        
        
    }

    public static Boolean printPalindrome(String[] input){ 	
        // Cool efficient solution I found digging online :)
        int i1 = 0;
        int i2 = input.length -1;
        while (i2 > i1) {
        	if (input[i1] != input[i2]) {
        		return false;
        	}
        	++i1;
        	--i2;
        }
		return true;
		
    	/* this method also works
    	if(Loops.printArray(input).equals(Loops.printReverse(input)))
		return true;
			else 
		return false;*/ 
    }


    public static String printCompress(int[] input){
        String response = "*** Output ***\n";
        	response += input[0];
            for (int i = 1; i < input.length - 1; i++) {
                if (input[i] != input[i - 1]){
                	response += "\n" + input[i];	
                }
                         }
            return response;  
	}

               
    public static String printPack(char[] input){
        	String response = "*** Output ***\n";
        	response += input[0];
            for (int i = 1; i < input.length; i++) {
                
            	if
                (input[i] == input[i - 1])
                	response += input[i];
            	
            	else if (input[i] != input[i - 1])
            		response += ", " + input[i];

            }	
            return response;
                        
    } 
}


