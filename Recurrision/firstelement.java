public class firstelement {
    public static int felement(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return felement(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int key = 5;
        System.out.println(felement(arr,key,0));
    }
}
