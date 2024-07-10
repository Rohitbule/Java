public class sellstock {

    public static int buyandsellstock(int prices[])
    {
        int buyprice = Integer.MAX_VALUE;
        int maxvalue = 0;
        for(int i=0; i<prices.length; i++)
        {
            if(buyprice < prices[i])
            {
                int profit = prices[i] - buyprice;
                maxvalue=Math.max(maxvalue,profit);
            }
            else
            {
                buyprice = prices[i];
            }
        }
        return maxvalue;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("The maximum profit of buyprice is  : " +buyandsellstock(prices));

    }
}
