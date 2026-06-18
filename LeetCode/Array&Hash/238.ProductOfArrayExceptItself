


    > Сути задачи: Получить производную не учитывая конкретный элемент на каждой иттерации

    > Как решить: Arrays
        - Создаем два массива: prefix, postfix
        в prefix добавляем производную текущего num[i] и предыдущего элемента prefix[i]
        если это первый элемент, то первым элементов prefix[i] будет num[i]

        тоже самое но наоборот, справа на лево, для postfix.
        в конце мы умножаем prefix[i - 1] и postfix[i + 1]. если слева или справа ничего нет, то умножаем на 1

        Пример:
        nums = [1, 2, 3, 4] = result [24, 12, 8, 6]

        prefix = [1, 2, 6, 24]
            если nums[i] первый то просто: prefix[i] = nums[i]
            если нет, то умножаем nums[i] на prefix[i - 1]

        postfix = [24 ,24 ,12, 4]
            тоже самое но справа
        
        res = [24, 12, 8, 6]
            Для nums[i] берется prefix[i - 1] * postfix[i + 1]
            если справа или слева нет элемента, то умножаем на 1

    > Код:
        JAVA
            class Solution {
            public int[] productExceptSelf(int[] nums) {
                int[] res = new int[nums.length];
                int[] prefix = new int[nums.length];
                int[] postfix = new int[nums.length];

                // Prefix
                for(int i = 0; i < nums.length; i++){
                    if(i == 0){
                        prefix[i] = nums[i];
                    } else{
                        prefix[i] = nums[i] * prefix[i - 1];
                    }
                }

                // Postfix
                for(int j = nums.length - 1; j >= 0; j--){
                    if(j == nums.length - 1){
                        postfix[j] = nums[j];
                    } else{
                        postfix[j] = nums[j] * postfix[j + 1];
                    }
                }

                // Getting result
                for(int k = 0; k < nums.length; k++){
                    if(k == 0){
                        res[k] = postfix[k + 1] * 1;
                    } else if(k == nums.length - 1){
                        res[k] = prefix[k - 1] * 1;
                    } else{
                        res[k] = prefix[k - 1] * postfix[k + 1];
                    }
                }

                return res;

            }
        } 