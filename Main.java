# CompareReverseAndOrginialArray
public class Main
{
	public static void main(String[] args) {
	  
	    int a[] = {3,7,4,5,1,8};
	   int n = a.length;
    #Loop through the array until you have hit the middle
    for(int i = 0; i<n-i ; i++){
      #Check the element to the element in the same place counting from the back
	            if(a[i]!=a[n-i-1]){
	         System.out.print("Not Perfect");
	           return;
	            }
	       }
	        System.out.print("Perfect");
	    
	     
	
	}
}
//int x[] = new int[n];
//  x = a;
// int y[] = new int[n];
//  y = a;
//   for(int i = n-1; i>=0 ; i--){
 //    System.out.print(x[i]+ " ");
	 //   
	 //   }
	      
	        
