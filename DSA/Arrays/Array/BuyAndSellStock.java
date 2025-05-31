package DSA.Array;

class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {7,4,1,6,9,4};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++) {
            if(buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            } else {
                buyPrice = arr[i];
            }
        }
        System.out.println("The maximum profit is : " + maxProfit);
    }    
}