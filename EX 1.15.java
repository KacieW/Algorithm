package algorithm;

public class Exericise_1_1 {
	
	public static int[] histogram(int [] a, int M){
		 int [] h = new int[M];
	
			 for(int i=0; i<a.length;i++){
				 if (a[i] < M)
					 h[a[i]]++;
			 }
		 return h;
	 }	
  public static void main(String[] args){
	  try{
		 int [] inputArray ={1,2,2,4};
		 int inputM = inputArray.length;
		 int [] outputArray = histogram(inputArray, inputM);
		 for(int i=0; i<inputM; i++){
		 System.out.println(outputArray[i]);
		 }
	  }
	  catch(Exception e){
		  System.out.println("Error");
	  }
  }
}

/*output is [0,1,2,1]*/
