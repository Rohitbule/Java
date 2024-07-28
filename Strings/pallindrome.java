public class pallindrome {

    public static Boolean ispallindrome(String str){
        for(int i=0; i<str.length()/2; i++)
        {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i))  //check first character of string and last character of string .
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        String str = "rahitr";
        System.out.println(ispallindrome(str));
    }
}
