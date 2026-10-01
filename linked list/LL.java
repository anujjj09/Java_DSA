import java.util.*;

public class LL {

    // ============================================================
    // 1. LINKED LIST BASICS
    // ============================================================

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    // ============================================================
    // 2. INSERTION
    // ============================================================

    // 2.1 Insert element at first position
    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }


    // 2.2 Insert element at last position
    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.next = node;
        tail = node;

        size++;
    }


    // 2.3 Insert element at a specific index
    public void insert(int val, int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);

        temp.next = node;
        size++;
    }


    // ============================================================
    // 3. DELETION
    // ============================================================

    // 3.1 Delete first element
    public int deleteFirst() {

        int val = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return val;
    }


    // 3.2 Delete last element
    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);

        int val = tail.value;

        tail = secondLast;
        tail.next = null;

        size--;

        return val;
    }


    // 3.3 Delete element at a specific index
    public int delete(int index) {

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;
    }


    // ============================================================
    // 4. ACCESS / SEARCH
    // ============================================================

    // 4.1 Get node at a particular index
    public Node get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }


    // 4.2 Find a node containing a particular value
    public Node find(int value) {

        Node node = head;

        while (node != null) {

            if (node.value == value) {
                return node;
            }

            node = node.next;
        }

        return null;
    }


    // ============================================================
    // 5. DISPLAY
    // ============================================================

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("END");
    }


    // ============================================================
    // 6. RECURSION
    // ============================================================

    // 6.1 Insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }


    private Node insertRec(int val, int index, Node node) {

        if (index == 0) {

            Node temp = new Node(val, node);

            size++;

            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);

        return node;
    }


    // ============================================================
    // 7. DUPLICATES
    // LeetCode 83 - Remove Duplicates from Sorted List
    // YOUR OWN LL NODE VERSION
    // ============================================================

    public void duplicates() {

        Node node = head;

        while (node.next != null) {

            if (node.value == node.next.value) {

                node.next = node.next.next;
                size--;

            } else {

                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }


    // ============================================================
    // 8. MERGE TWO SORTED LINKED LISTS
    // LeetCode 21 - YOUR OWN LL NODE VERSION
    // ============================================================

    public static LL merge(LL first, LL second) {

        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {

            if (f.value < s.value) {

                ans.insertLast(f.value);
                f = f.next;

            } else {

                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {

            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {

            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }


    // ============================================================
    // 9. LEETCODE PRACTICE
    //
    // IMPORTANT:
    // The following problems use LeetCode's ListNode.
    //
    // They are COMMENTED OUT because they are not part of
    // your custom LL class.
    //
    // LeetCode provides:
    //
    // class ListNode {
    //     int val;
    //     ListNode next;
    // }
    //
    // ============================================================


    // ------------------------------------------------------------
    // 9.1 LeetCode 21 — Merge Two Sorted Lists
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode();
            ListNode tail = dummy;

            while (list1 != null && list2 != null) {

                if (list1.val < list2.val) {

                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;

                } else {

                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }

            while (list1 != null) {

                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }

            while (list2 != null) {

                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }

            return dummy.next;
        }
    }
    */


    // ------------------------------------------------------------
    // 9.2 LeetCode 141 — Linked List Cycle
    // ------------------------------------------------------------

    /*
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    */


    // ------------------------------------------------------------
    // 9.3 Find Length of Cycle
    // ------------------------------------------------------------

    /*
    public int lengthCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {

                ListNode temp = slow;
                int length = 0;

                do {

                    temp = temp.next;
                    length++;

                } while (temp != slow);

                return length;
            }
        }

        return 0;
    }
    */


    // ------------------------------------------------------------
    // 9.4 LeetCode 142 — Linked List Cycle II
    // ------------------------------------------------------------

    /*
    public ListNode detectCycle(ListNode head) {

        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        // Find meeting point
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {

                length = lengthCycle(slow);
                break;
            }
        }


        // No cycle
        if (length == 0) {
            return null;
        }


        // Move second pointer 'length' steps ahead
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {

            s = s.next;
            length--;
        }


        // Move both until they meet
        while (f != s) {

            f = f.next;
            s = s.next;
        }

        return s;
    }
    */


    // ------------------------------------------------------------
    // 9.5 LeetCode 202 — Happy Number
    // ------------------------------------------------------------

    /*
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {

            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        } while (slow != fast);

        return slow == 1;
    }


    private int findSquare(int number) {

        int ans = 0;

        while (number > 0) {

            int rem = number % 10;

            ans += rem * rem;

            number /= 10;
        }

        return ans;
    }
    */


    // ------------------------------------------------------------
    // 9.6 LeetCode 876 — Middle of the Linked List
    // ------------------------------------------------------------

    /*
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    */


    // ------------------------------------------------------------
    // 9.7 LeetCode 148 — Sort List
    // MERGE SORT
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode sortList(ListNode head) {

            if (head == null || head.next == null) {
                return head;
            }

            ListNode mid = getMid(head);

            ListNode left = sortList(head);
            ListNode right = sortList(mid);

            return merge(left, right);
        }


        public ListNode getMid(ListNode head) {

            ListNode midPrev = null;

            while (head != null && head.next != null) {

                midPrev = (midPrev == null)
                        ? head
                        : midPrev.next;

                head = head.next.next;
            }

            ListNode mid = midPrev.next;

            midPrev.next = null;

            return mid;
        }


        public ListNode merge(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode();
            ListNode tail = dummy;

            while (list1 != null && list2 != null) {

                if (list1.val < list2.val) {

                    tail.next = list1;
                    list1 = list1.next;

                } else {

                    tail.next = list2;
                    list2 = list2.next;
                }

                tail = tail.next;
            }

            while (list1 != null) {

                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }

            while (list2 != null) {

                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }

            return dummy.next;
        }
    }
    */


    // ------------------------------------------------------------
    // 9.8 LeetCode 206 — Reverse Linked List
    // ------------------------------------------------------------


    // 9.8.1 Recursive Reverse
    /*
    private void reverse(Node node) {

        if (node == tail) {

            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }
    */


    // 9.8.2 Iterative / In-Place Reverse
    /*
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while (pres != null) {

            pres.next = prev;
            prev = pres;
            pres = next;

            if (next != null) {
                next = next.next;
            }
        }

        return prev;
    }
    */


    // ------------------------------------------------------------
    // 9.9 LeetCode 92 — Reverse Linked List II
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode reverseBetween(
                ListNode head,
                int left,
                int right) {

            if (head == null || left == right) {
                return head;
            }

            // Skip first left - 1 nodes
            ListNode current = head;
            ListNode prev = null;

            for (
                int i = 0;
                i < left - 1 && current != null;
                i++
            ) {

                prev = current;
                current = current.next;
            }


            ListNode last = prev;
            ListNode newEnd = current;


            // Reverse between left and right
            ListNode next = current.next;

            for (
                int i = 0;
                i < right - left + 1 && current != null;
                i++
            ) {

                current.next = prev;
                prev = current;
                current = next;

                if (next != null) {
                    next = next.next;
                }
            }


            // Connect reversed portion
            if (last != null) {

                last.next = prev;

            } else {

                head = prev;
            }


            // Connect end of reversed portion
            newEnd.next = current;

            return head;
        }
    }
    */


    // ------------------------------------------------------------
    // 9.10 LeetCode 234 — Palindrome Linked List
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode middleNode(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }


        public ListNode reverseList(ListNode head) {

            if (head == null) {
                return head;
            }

            ListNode prev = null;
            ListNode pres = head;
            ListNode next = head.next;

            while (pres != null) {

                pres.next = prev;
                prev = pres;
                pres = next;

                if (next != null) {
                    next = next.next;
                }
            }

            return prev;
        }


        public boolean isPalindrome(ListNode head) {

            ListNode mid = middleNode(head);

            ListNode headSecond = reverseList(mid);

            ListNode rereverseHead = headSecond;


            // Compare both halves
            while (head != null && headSecond != null) {

                if (head.val != headSecond.val) {
                    break;
                }

                head = head.next;
                headSecond = headSecond.next;
            }


            // Restore second half
            reverseList(rereverseHead);

            return head == null || headSecond == null;
        }
    }
    */


    // ------------------------------------------------------------
    // 9.11 LeetCode 143 — Reorder List
    //
    // Pattern:
    //
    // 1. Find second half
    // 2. Split
    // 3. Reverse second half
    // 4. Merge alternately
    //
    // Pointer rule:
    // SAVE → CONNECT → MOVE
    //
    // Example:
    //
    // 1 → 2 → 3 → 4 → 5 → 6 → 7
    //
    // Split:
    // 1 → 2 → 3 → 4 | 5 → 6 → 7
    //
    // Reverse:
    // 1 → 2 → 3 → 4 | 7 → 6 → 5
    //
    // Merge:
    // 1 → 7 → 2 → 6 → 3 → 5 → 4
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode getMid(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            if (head == null || head.next == null) {
                return head;
            }

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;
            }


            // Save second half
            ListNode secHead = slow.next;

            // Cut first half
            slow.next = null;

            return secHead;
        }


        public ListNode reverseList(ListNode head) {

            if (head == null) {
                return head;
            }

            ListNode prev = null;
            ListNode pres = head;
            ListNode next = head.next;

            while (pres != null) {

                pres.next = prev;
                prev = pres;
                pres = next;

                if (next != null) {
                    next = next.next;
                }
            }

            return prev;
        }


        public void reorderList(ListNode head) {

            if (head == null || head.next == null) {
                return;
            }


            // Find and split second half
            ListNode mid = getMid(head);


            // Reverse second half
            ListNode secHead = reverseList(mid);


            // Merge alternately
            while (head != null && secHead != null) {

                // Save first half's next
                ListNode temp = head.next;

                // Connect first → second
                head.next = secHead;

                // Move first pointer
                head = temp;


                // Save second half's next
                temp = secHead.next;

                // Connect second → first
                secHead.next = head;

                // Move second pointer
                secHead = temp;
            }
        }
    }
    */

    // ------------------------------------------------------------
    // 9.12 LeetCode 25 — Reverse Nodes in k-Group
    //
    // Pattern:
    //
    // 1. Check if k nodes are available
    // 2. Reverse k nodes
    // 3. Connect previous portion
    // 4. Connect next portion
    // 5. Repeat
    //
    // Example:
    //
    // 1 → 2 → 3 → 4 → 5
    // k = 2
    //
    // 2 → 1 → 4 → 3 → 5
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode reverseKGroup(ListNode head, int k) {

            if (k <= 1 || head == null) {
                return head;
            }

            ListNode current = head;
            ListNode prev = null;

            while (true) {

                // Check if k nodes are available
                ListNode next = current;

                for (int i = 0; i < k; i++) {

                    if (next == null) {
                        return head;
                    }

                    next = next.next;
                }


                ListNode last = prev;
                ListNode newEnd = current;


                // Reverse k nodes
                next = current.next;

                for (int i = 0; i < k; i++) {

                    current.next = prev;
                    prev = current;
                    current = next;

                    if (next != null) {
                        next = next.next;
                    }
                }


                // Connect reversed portion
                if (last != null) {

                    last.next = prev;

                } else {

                    head = prev;
                }


                // Connect end of reversed portion
                newEnd.next = current;

                if (current == null) {
                    break;
                }


                // Prepare for next group
                prev = newEnd;
            }

            return head;
        }
    }
    */


    // ------------------------------------------------------------
    // 9.13 LeetCode 61 — Rotate List
    //
    // Pattern:
    //
    // 1. Find last node and length
    // 2. Make list circular
    // 3. Calculate effective rotations
    // 4. Find new last node
    // 5. Break the circle
    //
    // Example:
    //
    // 1 → 2 → 3 → 4 → 5
    // k = 2
    //
    // 4 → 5 → 1 → 2 → 3
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode rotateRight(ListNode head, int k) {

            if (k <= 0 || head == null || head.next == null) {
                return head;
            }


            // Find last node and length
            ListNode last = head;
            int length = 1;

            while (last.next != null) {

                last = last.next;
                length++;
            }


            // Make the list circular
            last.next = head;


            // Remove unnecessary full rotations
            int rotations = k % length;


            // Find position of new last node
            int skip = length - rotations;

            ListNode newLast = head;

            for (int i = 0; i < skip - 1; i++) {

                newLast = newLast.next;
            }


            // Node after newLast becomes new head
            head = newLast.next;


            // Break the circle
            newLast.next = null;


            return head;
        }
    }
    */


    // ------------------------------------------------------------
    // 9.13 LeetCode 61 — Rotate List
    //
    // Pattern:
    //
    // 1. Find last node and length
    // 2. Make the list circular
    // 3. Calculate effective rotations using k % length
    // 4. Find the new last node
    // 5. Break the circle
    //
    // Example:
    //
    // 1 → 2 → 3 → 4 → 5
    // k = 2
    //
    // After rotation:
    //
    // 4 → 5 → 1 → 2 → 3
    //
    // Important:
    //
    // k can be greater than length.
    //
    // Example:
    //
    // length = 5
    // k = 7
    //
    // rotations = 7 % 5 = 2
    //
    // So we only need to rotate 2 times.
    // ------------------------------------------------------------

    /*
    class Solution {

        public ListNode rotateRight(ListNode head, int k) {

            // Empty list, single node, or no rotation
            if (head == null || head.next == null || k == 0) {
                return head;
            }


            // Find last node and length
            ListNode last = head;
            int length = 1;

            while (last.next != null) {

                last = last.next;
                length++;
            }


            // Make the list circular
            //
            // 1 → 2 → 3 → 4 → 5
            // ↑                 ↓
            // └─────────────────┘
            last.next = head;


            // Remove unnecessary full rotations
            //
            // Example:
            // length = 5
            // k = 7
            //
            // rotations = 7 % 5 = 2
            int rotations = k % length;


            // Find the new last node
            //
            // If length = 5 and rotations = 2:
            //
            // skip = 5 - 2 = 3
            //
            // New last node = 3
            // New head = 4
            int skip = length - rotations;

            ListNode newLast = head;

            for (int i = 0; i < skip - 1; i++) {

                newLast = newLast.next;
            }


            // Node after newLast becomes the new head
            head = newLast.next;


            // Break the circular connection
            newLast.next = null;


            return head;
        }
    }
    */


    // ============================================================
    // 10. NODE CLASS
    // ============================================================

    private class Node {

        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}