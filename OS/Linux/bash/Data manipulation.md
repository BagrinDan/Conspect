`echo OWN | tr O P` - заменяет буквы 
-> вывод: `PWN` 

`echo OWN | tr 'a-zA-Z A-Za-z'` 

`echo PAWN | td -d A` - удаляет букву 
->` вывод: `PWN` 

`cut -d " " -f 1` -> выполяет срез по проблему и выводит первую колонку

`sort`
	`-r`: reverse order (Z to A)
	`-n`: numeric sort
	`-u`: unique lines only. removes duplicates
	`-R`: random order
