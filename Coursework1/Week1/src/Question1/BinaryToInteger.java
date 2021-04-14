package Question1;

import java.util.HashSet;
import java.util.LinkedList;


public class BinaryToInteger {
	
	@SuppressWarnings("unchecked")
	static LinkedList<Integer> mylist = new LinkedList();

    public static void printArray(int[] z) {
        
        System.out.println("");
        for(int i=0; i<z.length; i++)
            System.out.print(z[i]);
            
    }
    
    public static void swap(int[] z, int i, int j) {
        int temp=z[i];
        z[i]=z[j];
        z[j]=temp;
        
    }
    
    public static void printPermutation(int[] z, int ca) {
        if (ca == z.length-1) {
           toBinary(z);
            return;
        }
         
        HashSet<Integer>hash = new HashSet<Integer>();
        for (int i=ca; i<z.length; i++) {
            if(hash.contains(z[i])==true)
                continue;
            hash.add(z[i]);
            
            swap(z, i , ca);
            printPermutation(z, ca+1);
            swap(z, i, ca);
        }
    }
    
    public static void toBinary(int binary[]) {	    	
        
        int decimal = 0;
       
        int length = binary.length;
        for (int i=length-1;i>=0;i--){

            decimal = (int) (decimal + binary[i]* Math.pow(2,length-1-i));
        }
        mylist.add(decimal);

    }
    public static void main(String[] args) {
        int[] z= {1,0,1};
        printPermutation(z, 0);
        System.out.println(mylist);
    

}
}


