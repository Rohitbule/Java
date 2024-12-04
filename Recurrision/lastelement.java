public class lastelement
 {
    public static int lelement(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = lelement(arr,key,i+1);
        if(isfound == -1 && arr[i]== key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(lelement(arr,key,0));
    }
}