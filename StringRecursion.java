public class StringRecursion {

    public static void main(String[] args) {
        // test cases for method printReverse(str)
        printReverse("Terriers");

        // test cases for method find(str)
        System.out.println(trim(" hello world    "));
        System.out.println(trim("recursion  "));
        
        // test cases for method find(ch, str)
        System.out.println(find('b', "Rabbit"));
        System.out.println(find('P', "Rabbit"));
        System.out.println(find('A', "Afitab"));

        // test cases for method find(str1, str2)
        System.out.println(weave("aaaa", "bbbb"));
        System.out.println(weave("hello", "world"));
        System.out.println(weave("recurse", "NOW"));
    }

    // recursive method that prints the individual characters in the string str in reverse order
    public static void printReverse(String str) {
        if (!(str == null || str.equals(""))) { // checking for special cases
            printReverse(str.substring(1));
            System.out.print(str.charAt(0));
         } 
    }

    // recursive method that takes a string str and returns a string 
    // in which any leading and/or trailing spaces in the original string are removed
    public static String trim(String str) {
        if (str == null) { // checking for special case
            return null;
        } if (str.equals("")) { // checking for special case
            return "";
        } if (str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' ') { // base case
            return str;
        } else {
            if (str.charAt(0) == ' ') {
                return trim(str.substring(1));
            } else {
                return trim(str.substring(0, str.length()-1));
            }
        }
    }
    
    // recursive method that takes a string str and returns a string in which 
    // any leading and/or trailing spaces in the original string are removed
    public static int find(char ch, String str) {
        if (str.equals("") || str == null) { // checking for special cases
            return -1;
        } else if (str.charAt(0)  == ch) { // base case
            return 0;
        } else {
            int findRest = find(ch, str.substring(1));
            if (findRest > -1) { 
                return findRest + 1;
            } return -1;
        }
    }
    
    // method that recursively returns the string that is formed by “weaving” together 
    // the characters in the strings str1 and str2 to create a single string
    public static String weave(String str1, String str2) {
            if (str1.equals(null) || str2.equals(null)) { // checking for special cases
                throw new IllegalArgumentException();
            } if (str1.equals("") || str2.equals("")) { // base case
                    return str1 + str2;
            } else {
                String weaveRest = weave(str1.substring(1), str2.substring(1));
                return str1.charAt(0) + "" + str2.charAt(0) + "" + weaveRest;
            }
    
    }

    // method that recursively finds and returns the index of the first occurrence of character ch in the string str, 
    // returns -1 if ch does not occur in str
    public static int indexOf(char ch, String str) {
        return (find(ch, str)); // utilizes the find method to recursively implent indexOf()
    }

}

