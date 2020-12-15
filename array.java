/**
 * array
 */
public class array {
    public static void main(String[] args) {
        
    int[] myintarray = new int[20] ;

    for (int i = 0; i < myintarray.length; i++) {
        myintarray[i] = i*10;
    }

    printarray(myintarray);

} 
public static void printarray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        
        System.out.println("element " + i + " is " + array[i] );
        
    }
    
}
}