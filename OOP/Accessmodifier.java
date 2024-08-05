public class Accessmodifier {
    public static void main(String args[])
    {
        Bank myacc = new Bank();
        myacc.username="Rohit";
        //myacc.password="abc";
        myacc.setpassword("abc");  //password la fakth set karu shaktu



    }

}

class Bank{
    public String username;
    private String password;
    public void setpassword(String pass)
    {
        password = pass;
    }

}
