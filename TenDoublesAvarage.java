/* A program that uses an array to find the avarage of ten double values. */


public class MyClass {
    public static void main(String args[]) 
    {
        double theArray[] = new double[] {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};  // declared an array of double numbers
        double sum = 0; // initiating the "sum" variable to 0
        
        for(int i = 0; i < theArray.length; i++)    // iterating through the array
            sum += theArray[i];                     // adding each of element to the "sum" variable
            
        double average = sum/theArray.length; // outside the loop, dividing the "sum" to the number of elements in "theArray"
        System.out.println("The avarage of the numbers in the theArray is: " + average); // printing the result
    }
}
