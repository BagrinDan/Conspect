
    ==========
    -- JAVA --
    ==========
    > HashSet: Не хранит дубликаты

        add() : O(1) / O(n)
        contains() : O(1) / O(n)
        remove() : O(1) 

    > HashMap:

        map.put(key, value); -> ставит ключ и value
        map.get(key); -> возвращает value
        map.containsKey(key); -> проверяет ключ
        map.containsValue(value); -> проверяет value
        map.remove(key); -> убирает ключ
        map.size(); -> количество элементов
        map.clear(); 
        map.keySet(); -> возвращает СЕТ ключей
        map.values(); -> возвращает все value
        map.entrySet(); -> возвращает все пары

        map.getOrDefault(key, defaultValue); -> если ключа нет → возвращает default
        map.putIfAbsent(key, value); -> добавляет если нет ключа
        map.replace(key, value); -> заменяет значения если ключ есть

        map.compute(key, (k, v) -> v + 1);
        map.computeIfAbsent(key, k -> new ArrayList<>());
        map.computeIfPresent(key, (k, v) -> v + 1);

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
        }

    ================
    -- JAVASCRIPT --
    ================
        HashSet:
            - Инициализация:
                > const set = new Set();
                > const set = new Set([1, 2, 3]); 

            - Функции:
                > set.add(1)
                > set.add('txt')
                > set.delete(1)

                > const bool = set.has(10); 
                > set.size
                > set.clear()

            - Перебор:
                

    ============
    -- Python --
    ============
        HashSet
            Инициализация:
                set = set()
                set = {1, 2, ...}
                
                list = [1, 2, 3]
                set = set(list)

            Операции:
                set.add(1)
                set.update([1, 3, 4])
                set.remove(1)
                num_set.discard(1) <- Не вызовет ошибку в отличие от remove()

                if "apple" in fruits:
                    print("Яблоко уже есть в множестве")

                if "cherry" not in fruits:
                    fruits.add("cherry")