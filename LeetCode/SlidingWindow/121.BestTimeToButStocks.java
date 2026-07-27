

    > Как решить: сравниваем цену левого и правого указателя и считаем цену. Обновляем если текущий профит больше максимального.



        class Solution {
            public int maxProfit(int[] prices) {
                int left = 0;
                int maxProfit = 0;

                for(int right = 1; right < prices.length; right++){
                    if(prices[left] < prices[right]){
                        int currProfit = prices[right] - prices[left];
                        maxProfit = Math.max(maxProfit, currProfit);
                    } else{
                        left = right;
                    }
                }

                return maxProfit;
            }
        }