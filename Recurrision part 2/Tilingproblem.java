public class Tilingproblem {
    public static int tproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tproblem(n-1);
        int fnm2 = tproblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String args[]){
        int n= 4;
        System.out.println(tproblem(n));  
    }
}
