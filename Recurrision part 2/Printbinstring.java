public class Printbinstring {
    public static void binarystring(int n,int lastplace,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        binarystring(n-1,0,s+'0');
        if(lastplace==0){
            binarystring(n-1,1,s+'1');
        }
    }
    public static void main(String args[]){
        int n =3;
        binarystring(3,0,"");
    }
}
