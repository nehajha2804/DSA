class besttimeToSellStock{
    public int maxProfit(int[] prices) {
    
        // BRUTE FORCE LOGIC:

        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         difference=prices[j]-prices[i];
        //         if(difference>profit){
        //             profit=difference;
        //         }
        //     }
        // }


        int min_price=Integer.MAX_VALUE;
        int profit=0;

        for(int price: prices){
            if(price<min_price){
                min_price=price;
            }else{
                profit=Math.max(profit, price-min_price);
            }
        }

        return profit;
    }
}
