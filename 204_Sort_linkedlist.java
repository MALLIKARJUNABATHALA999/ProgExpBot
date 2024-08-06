  if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        // Recursively split and sort the lists
        left = sortList(left);
        right = sortList(right);

        // Merge the sorted lists
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else if (right != null) {
            current.next = right;
        }

        return dummy.next;