    
    > Как решить: Нужно через бинарный поиск найти оптимальную скорость поедания бананов.
    Берется максимальное количество банан из массива и строится условная прямая: 1 от max.
    Потом берется середина и считаетеся скорость. даже если скорость подходит, мы продолжаем
    чтобы найти именно минимальную скорость для поедания банан


    > Код:
            class Solution {
                public int minEatingSpeed(int[] piles, int h) {
                    int max = piles[0];
                    for (int pile : piles) {
                        if (pile > max) {
                            max = pile;
                        }
                    }

                    int left = 1;
                    int right = max;
                    int result = max; 

                    while (left <= right) {
                        int k = left + (right - left) / 2;

                        int totalHours = 0; 
                        for (int pile : piles) {
                            totalHours += (pile + k - 1) / k;
                        }

                        if (totalHours <= h) {
                            result = k;     
                            right = k - 1;   
                        } else {
                            left = k + 1;    
                        }
                    }

                    return result;
                }
            } 