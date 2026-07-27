
    > Суть: Веруть True если в массиве есть дубликаты, False если нет

    > Как решается: HashSet
        - Просто кладем элементы из вводного массива в HashSet и проверяем длинну второго.
        Если равны то их нет, если есть, то есть...

    > Код
    - Простой вариант:
        class Solution {
            public boolean containsDuplicate(int[] nums) {
                HashSet<Integer> set = new HashSet<>();

                for(int i = 0; i < nums.length; i++){
                    set.add(nums[i]);
                }

                return set.size() != nums.length;
            }
        }

    - С проверкой перед добавлением:
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();

            for(int element : nums){
                if(set.contains(element)){
                    return true;
                }
                set.add(element);
            }
            
            return false;
        }
    }