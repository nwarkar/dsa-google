package org.practice;

public class ListNodeCustom {
        int val;
        ListNodeCustom next;
        ListNodeCustom down;

        ListNodeCustom() {
        }

        ListNodeCustom(int val) {
            this.val = val;
        }

        ListNodeCustom(int val, ListNodeCustom next, ListNodeCustom down) {
            this.val = val;
            this.next = next;
            this.down = down;
        }
    }
