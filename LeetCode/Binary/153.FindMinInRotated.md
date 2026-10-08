

    > Как решить: через бинарный поиск ставим центр как миниму и продолжаем резать массив
    до тех пор как не выполнится условие цикла



    class Solution {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int min = nums[0];

            while(left <= right){
                if(nums[left] < min){
                    min = nums[left];
                }

                int center = left + (right - left) / 2;

                if(nums[center] < min){
                    min = nums[center];
                }

                if(nums[left] <= nums[center]){ 
                    left = center + 1;
                } else{
                    right = center - 1;
                }
            }

            return min;
        }
    }