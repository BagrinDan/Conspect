

        Решения: Мапим буквы pattern на каждую строку s и проверяем если они не переназначились


        class Solution {
            public boolean wordPattern(String pattern, String s) {
                Map<Character, String> map = new HashMap<>();

                String[] sArr = s.split(" ");
                char[] patternArr = pattern.toCharArray();

                if(pattern.length() != sArr.length) { return false; }

                for(int i = 0; i < patternArr.length; i++){
                    if(map.containsKey(patternArr[i])){
                        if(!map.get(patternArr[i]).equals(sArr[i])){
                            return false;
                        }
                    } else{
                        if(map.containsValue(sArr[i])){
                            return false;
                        }
                        map.put(patternArr[i], sArr[i]);
                    }
                }

                return true;
            }
        }