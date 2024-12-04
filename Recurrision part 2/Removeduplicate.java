

public class Removeduplicate {
    public static void remove(String s,int idx,StringBuilder newstr,boolean map[]){
        if(idx==s.length()){
            System.out.println("Original String : " +s+ " ,  New String : " +newstr);
            return;
        }

        char currChar=s.charAt(idx);
        if(map[currChar-'a']==true){
            remove(s,idx+1,newstr,map);
        }else{
            map[currChar-'a']=true;
            remove(s,idx+1,newstr.append(currChar),map);
        }
    }
    public static void main(String args[]){
        String a = "appnnacollege";
        remove(a,0,new StringBuilder(""),new boolean[26]);
    } 
}
