public class Sort{

  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "01.Khanna.Tara"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */



  public static void selection(int[] data){
      //nested for loop,
      //once to go through all of data, one to go through unsorted

      //times you go through the array
      for (int i = 0; i < data.length; i++){   
	  int smallest = data[i];
	  int oldSpot = i;
	  int newSpot = i;
	  
	  //simulates going through the unsorted stuff
	  //looks for smallest in the unsorted stuff
	  for (int j = i = 1; j < data.length; j++){
	      if (data[j]<smallest){
		  smallest = data[j];
		  newSpot = j;
	      }
	  }
	  
	  //Switch smallest with in smallest spot
	  int temp = data[i];
	  data[oldSpot]=smallest;
	  data[newSpot]=temp;
	  
      }
  

  }
/*
  public static void insertion(int[] data){
//length of sorted	
    int numSort=1;
    for(int i = 1; i < data.length; i++){
	int temp=data[VARIABLE!];
	int num = i-1;
	while(temp<data[num]){
	    num--
	}
    }

  }*/

}
