//U10416008丁杰


public class BubbleSort {
 
    public static void main(String[] args) {
            
        int intArray[] = new int[]{7,60,87,78,33,66,44,487,382,9};
               
        //print array before sorting 
        System.out.println("Array Before Bubble Sort");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
               
        //sort an array using bubble sort 
        bubbleSort(intArray);
               
        System.out.println("");
               
        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
 
    }
 
    public static void bubbleSort(int[] intArray) {
                          
        int n = intArray.length;
        int temp = 0;
               
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                               
                if(intArray[j-1] > intArray[j]){
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
                               
            }
        }
       
    }
}