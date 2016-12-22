
import java.util.Random;

public class Sort{

  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "10.Khanna.Tara"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */



  public static void selectionSort(int[] data){
      //nested for loop,
      //once to go through all of data, one to go through unsorted

      //times you go through the array
      for (int i = 0; i < data.length; i++){   
	  int smallest = data[i];
	  int oldSpot = i;
	  int newSpot = i;
	  int temp = data[i];	  
	  //simulates going through the unsorted stuff
	  //looks for smallest in the unsorted stuff
	  for (int j = i + 1; j < data.length; j++){
	      if (data[j]<smallest){
		  smallest = data[j];
		  newSpot = j;
	      }
	  }
	  
	  //Switch smallest with in smallest spot
	  temp = data[i];
	  data[oldSpot]=smallest;
	  data[newSpot]=temp;
	  
      }
  

  }
  public static void insertionSort(int[] data){
//length of sorted	
    for(int i = 0; i < data.length-1; i++){
	    int num = i + 1;
	    int temp=data[num];
	    int smallest=i;
	    for (int j = i; j >= 0; j--){
		if (temp < data[j]){
		    smallest = j;
		    data[j+1]=data[j];
		}
	    }
	    data[smallest]=temp;
}
  }
  public static void bubbleSort(int[] data){
//nested for loop
//count switch numbers and if switch is 0 at end, end loop early
	boolean done = false;
	for (int times = 0; times < data.length && !done ; times++){
	    int swaps = 0;
	    for (int current = 0; current<data.length-times-1; current++){
		int nextTo=current+1;
		int tempC = data[current];
		if (tempC>data[nextTo]){
		    data[current]=data[nextTo];
		    data[nextTo]=tempC;
		    swaps++;
		}
	    }
	    if (swaps == 0){
		done = true;
	    }
	}
}
//STOLEN TEST CASES
    /**Fills int array with random integers. 
	  *Upon completion, the elements of the array will be in a random order (max is 10000 because why not?).
	  *@param data array to fill.
	  */
	    public static int[] randomArray(int size, int max){
		int[] data= new int[size];
		Random num = new Random();
		for(int i=0; i<data.length; i++){
		    data[i]=num.nextInt(max);
		}
		return data;
	    }
	    public static String Test(String method, int[]initial){
		String sorted;
		long startTime = System.currentTimeMillis();
		int[] copy = new int[initial.length];
		System.arraycopy( initial, 0, copy, 0, initial.length );
		Arrays.sort(copy);
		Object[] Sorted = {copy};
		int[] ary = new int[initial.length];
		System.arraycopy( initial, 0, ary, 0, initial.length );
		switch(method){
		    case "selectionSort":Sort.selectionSort(ary);
			break;
		    case "insertionSort":Sort.insertionSort(ary);
			break;
		    case "bubbleSort":Sort.bubbleSort(ary);
			break;
		    default: return "INVALID. CURENTLY THERE ARE ONLY:\nselectionSort, insertionSort, bubbleSort \nPlease try again.";
		}
		Object[] Applied = {ary};
		if (Arrays.deepEquals(Sorted, Applied)){
		    sorted="Did sort";
		}
		else{
		    sorted="Did not sort";
		}
		long endTime = System.currentTimeMillis();
		long time=endTime-startTime;
	
	
		return String.format("%s: %s and took time of %s ms", method, sorted, time);
	}
	    
	    public static void main(String[] a){
		System.out.println(Test(a[0],randomArray(10000,1000)));
		
	    }
}
