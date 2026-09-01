
    > Суть: Найти анограмму.
        Анограмма это слова которая содержат те же буквы но расположенны в другом порядке

    > Как решается: HashMap
        Создаем словарь на основе первого слова. 
            Например для aete будет a = 1, e = 2, t = 1
        После проходимся по второй строке и минусуем value 
        Если все value будут 0, то это анаграмма


    > Код: Скорость: O(n), Памяти O(n)
        class Solution {
            public boolean isAnagram(String s, String t) { // aete, eet
                if (s.length() != t.length()) return false;
                
                HashMap<Character, Integer> map = new HashMap<>();

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    map.put(c, map.getOrDefault(c, 0) + 1); // Создаем мапу на основе слова: e - 2, t - 1
                }

                for (int i = 0; i < t.length(); i++) {
                    char c = t.charAt(i);
                    map.put(c, map.getOrDefault(c, 0) - 1); 
                }

                List<Integer> values = new ArrayList<>(map.values());

                for(int i = 0; i < values.size(); i++){
                    if(!values.get(i).equals(0)){
                        return false;
                    }
                }

                return true;
            }
        }

    Python
        class Solution:
            def isAnagram(self, s: str, t: str) -> bool:
                if len(s) != len(t):
                    return False

                map = {}

                for c in s:
                    map[c] = map.get(c, 0) + 1

                for c in t:
                    map[c] = map.get(c, 0) - 1
                
                list = map.values()

                for i in list:
                    if i != 0:
                        return False
                
                return True


