public class bestTimeToSellStockBrute{
    public static void main(String args[]){

        int prices[] = {1,2,4,5,7};
        int profit=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int difference=prices[j]-prices[i];
                if(difference>profit){
                    profit=difference;
                }
            }
        }

        System.out.println(profit);
    }
}