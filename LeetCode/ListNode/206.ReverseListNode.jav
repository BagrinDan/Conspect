
    Мы сначала:
        1) Сохраняем следующий узел текущеый ноды как nextTemp
        2) Перенаправляем узел текущей ноды на prev 
        3) prev перенаправляем на curr 
        4) curr перенаправляем на nextTemp

        Под конец возвращаем prev


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode nextTemp = curr.next; (1)
            curr.next = prev; (2)
            prev = curr; (3)
            curr = nextTemp; (4)
        }

        return prev;
    }
}