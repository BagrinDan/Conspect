
    > Суть: Найти самую длинную цепочку чисел в неотсортированном массиве. 
        Нужно чтобы алгоритм был O(n), то есть без сортировок

    > Как решается: Нужно проверить если у числа (nums[i]) есть сосед (nums[i - 1]) в массиве. 
        Например [99, 101, 2] -> в массиве нет 98, а значит 99 это 100% начало потенциальной цепочки

    После через создается копия элемента, например 99 [int copy = nums[i]] и буффер который укажет на длинну текущей чепочки.
    Создается цикл while где через copy проверяет длинну цепочки. Под конец обновляем length если нужно и возвращаем   

    > Код:
        Java
            class Solution {
                public int longestConsecutive(int[] nums) {
                    if(nums.length == 0){
                        return 0;
                    }
                    
                    Set<Integer> set = new HashSet<>();
                    for(int element : nums){
                        set.add(element);
                    }

                    int length = 0;

                    for(int element : set){
                        if(!set.contains(element - 1)){ // -1 - 1
                            int copy = element;  // -1
                            int buffer = 1;

                            while(set.contains(copy + 1)){ 
                                buffer++;
                                copy++;
                            }

                            length = Math.max(length, buffer);
                        }
                    }
                    return length;
                }
            }