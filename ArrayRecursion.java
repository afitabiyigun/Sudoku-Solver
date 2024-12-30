public class ArrayRecursion {

    public static void main(String[] args) {
        String arr[] = { "abc", "def", "hello", "klm", "nop", "qrs" };
        
        // test case for recursive method search(item, arr, start)
        System.out.println(search("hello", arr, 0));
        System.out.println(search("afitab", arr, 0));
        // test case for recursive method reverseArrayToString(arr, index)
        System.out.println(reverseArrayToString(arr, 0));
    }

    // method that recursively searches for an item of any reference type in an array of said reference types
    // and returns true if the item is present in the arra; false otherwise
    public static boolean search(Object item, Object[] arr, int start) {
        // Always check for null references first!
        if (arr == null) { // checking for special cases
           throw new IllegalArgumentException();
        } if (start >= arr.length) { // if the item is not in the array
            return false;
        } if (arr[start].equals(item)) { // base case 
            return true;
        } else {
            boolean restSearch = search(item, arr, start + 1);
            return restSearch;
        } 
    } 

    // method that recursively creates a string of all the elements in an array, but in reverse order
    public static String reverseArrayToString(Object[] arr, int index ) {
        if (arr == null) {
            return "";
        }else if (index == arr.length-1) {
            return "[" + arr[index] + ", ";
        } else {
            String reversed = reverseArrayToString(arr, index+1);
            if (index == 0) {
                return reversed + arr[index] + "]";
            } else {
                return reversed + arr[index] + ", ";
            } 
        }
    }

}
    
