
    
    > Стэк - это структура данных, которая работает по принципу: LIFO - Last in Fist out
        - импорты:
            import java.util.Stack

    > Методы стэка:
        Java
            > Stack
                * push(E item) - просто добавляет элемент из вершины
                * pop() - удаляет и возвращает первый элемент из вершины
                * peek() - показывает первый элемент из вершины без удаления
                * empty() 
                * search(Object o) - ищет элемент и возвращает его растояние от вершины (начинается с 1)

            > ArrayDeque
                * push()
                * pop()
                * peek()
                * isEmpty()
                * size()

        Python/JS:
            append(item) / push()
            pop()
            my_stack[-1] / stack[stack.length - 1]
            not my_stack / stack.length == 0
            len(my_stack) / stack.legth == 0

        

