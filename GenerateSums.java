/**
 * GenerateSums.java
 * 
 * Problem 9: Implementing Sum Generator
 *
 * Computer Science 112, Boston University
 *
 * your name: Afitab Iyigun
 *
 */
public class GenerateSums {
    public static void main(String[] args){
        // test calls to test the functionality of generateSums method
        System.out.println(generateSums(4)); 
        System.out.println(generateSums(6));
    }

    // method that takes an integer n and recursively
    // builds and returns a string of the full series of the sums generated
    public static String generateSums(int n) {
        int sum = 1;
        String firstln = "1" + "\n";
        String addStr = "1";
        String sumStr = "" ;
        String fullStr = "";
        for (int i = 2; i <= n; i++) {
            sum += i;
            addStr += " + " + i;
            sumStr = " = " + sum;
            fullStr += addStr + sumStr + "\n";
            }   
        return firstln + fullStr;
        }
    

}


