

Yellow:
    > Binary Search

    > Group of annagrams: 
        foreach,
        String.valueOf(charArray);
        map.get(st).add(str);

    > Valid Sudoku

RED:
    > Top K freq:

            PriorityQueue<Integer> fifo = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

            for(int i : map.keySet()){
                fifo.add(i);
                if(fifo.size() > k){
                    fifo.poll();
                    }
                }

    