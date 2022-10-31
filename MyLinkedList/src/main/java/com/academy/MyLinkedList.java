package main.java.com.academy;

public class MyLinkedList<E> {

    private int size;
    private ListItem<E> head;
    private ListItem<E> last;

    public MyLinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void printList() {
        boolean hasNext = true;
        int counter = 0;
        ListItem<E> next = head;

        System.out.println("\n");
        while(hasNext) {
            if (next == null) {
                hasNext = false;
            } else {
                System.out.println("Value at index " + ++counter + " : " + next);
                hasNext = true;
                next = next.getNextItem();
            }
        }
    }

    public boolean add(E value) {
        MyListItem<E> currentItem = new MyListItem<>(value, null, null);

        if (this.size == 0) {
            this.last = currentItem;
            this.size += 1;
            return true;
        } else {
            linkLast(currentItem);

            if (sortItem(this.last)) {
                this.size += 1;
                this.last = getLast(currentItem);
                this.head = getHead(currentItem);
                return true;
            } else {
                this.last = getLast(currentItem);
                this.head = getHead(currentItem);
                return false;
            }
        }
    }

    public boolean remove(E value) {
        ListItem<E> currentItem = this.last;
        boolean checkPrevious = true;
        boolean isRemoved = false;

        if (currentItem == null) {
            return false;
        }

        while (checkPrevious) {
            ListItem<E> next = currentItem.getNextItem();
            ListItem<E> previous = currentItem.getPreviousItem();

            if (currentItem.getValue().equals(value)) {
                if (previous != null) {
                    previous.setNextItem(next);
                    currentItem = previous;
                }
                if (next != null) {
                    next.setPreviousItem(previous);
                    currentItem = next;
                }
                isRemoved = true;
                checkPrevious = false;
            } else {
                if (previous == null) {
                    checkPrevious = false;
                } else {
                    currentItem = previous;
                    checkPrevious = true;
                }
            }
        }

        if (isRemoved) {
            this.size -= 1;
            this.last = getLast(currentItem);
            this.head = getHead(currentItem);
        }
        return isRemoved;
    }

    private void linkLast(MyListItem<E> currentItem) {
        ListItem<E> l = this.last;
        l.setNextItem(currentItem);
        currentItem.setPreviousItem(l);
        this.last = currentItem;
    }

    private ListItem<E> getLast(ListItem<E> currentItem) {

        boolean hasNext = true;
        ListItem<E> lastItem = null;

        while (hasNext) {
            ListItem<E> next = currentItem.getNextItem();

            if (next == null) {
                lastItem = currentItem;
                hasNext = false;
            } else {
                currentItem = (MyListItem<E>) next;
                hasNext = true;
            }
        }
        return lastItem;
    }

    private ListItem<E> getHead(ListItem<E> currentItem) {

        boolean hasPrevious = true;
        ListItem<E> headItem = null;

        while (hasPrevious) {
            ListItem<E> previous = currentItem.getPreviousItem();
            if (previous == null) {
                headItem = currentItem;
                hasPrevious = false;
            } else {
                currentItem = previous;
                hasPrevious = true;
            }
        }
        return headItem;
    }

    private boolean sortItem(ListItem<E> currentItem) {
        ListItem<E> next = currentItem.getNextItem();
        ListItem<E> previous = currentItem.getPreviousItem();

        if ((previous == null) && (next == null)) {
            return true;

        } else if (previous != null) {
            int compareStatus = currentItem.compareTo(previous);

            if (compareStatus == -1) {
                previous.setNextItem(next);
                if (next != null) {
                    next.setPreviousItem(previous);
                }
                return false;

            } else if (compareStatus == 0) {
                previous.setNextItem(next);
                if (next != null) {
                    next.setPreviousItem(previous);
                }
                return false;

            } else if (compareStatus > 0) {
                return true;

            } else if (compareStatus < 0) {
                ListItem<E> tmpPrevious = previous.getPreviousItem();
                currentItem.setPreviousItem(tmpPrevious);
                currentItem.setNextItem(previous);
                if (tmpPrevious != null) {
                    tmpPrevious.setNextItem(currentItem);
                }
                previous.setNextItem(next);
                previous.setPreviousItem(currentItem);
                if (next != null) {
                    next.setPreviousItem(previous);
                }

                return sortItem(currentItem);
            }
        }
        return true;
    }

    private static class MyListItem<E> extends ListItem<E> {

        public MyListItem(E value, MyListItem<E> nextItem, MyListItem<E> previousItem) {
            super(value, nextItem, previousItem);
        }

        @Override
        public String toString() {
            return (String.valueOf(this.getValue()));
        }

        /**
         * This function can also be written using the String.compareTo() function.
         * e.g.: strCompareTo()
         *
         * @param item - Item to be compared with the calling List Item.
         * @return - '0' if both Item values are equal.
         * '-1' if they couldn't be compared/error occurred.
         * '1' if the calling/current list item value is greater than the item to be compared.
         * '-2' if the calling/current list item value is less than the item to be compared.
         */
        @Override
        public int compareTo(ListItem<E> item) {
            if (this.getValue().equals(item.getValue())) {
                return 0;
            } else if (isValueLessThan(item)) {
                return -2;
            } else if (isValueGreaterThan(item)) {
                return 1;
            }
            return -1;

            // Option 2:
//            return strCompareTo(item);
        }

        private int strCompareTo(ListItem<E> item) {
            String currentItemValue = this.toString();
            String compareValue = item.toString();

            return (currentItemValue.compareTo(compareValue));
        }

        private boolean isValueGreaterThan(ListItem<E> item) {
            String currentItemValue = this.toString();
            String compareValue = item.toString();

            for (int i=0; i < currentItemValue.length(); i++) {
                if (i >= compareValue.length()) {
                    break;
                }
                if (currentItemValue.charAt(i) != compareValue.charAt(i)) {
                    return (currentItemValue.charAt(i) > compareValue.charAt(i));
                }
            }
            return (currentItemValue.length() > compareValue.length());
        }

        private boolean isValueLessThan(ListItem<E> item) {
            String currentItemValue = this.toString();
            String compareValue = item.toString();

            for (int i=0; i < currentItemValue.length(); i++) {
                if (i >= compareValue.length()) {
                    break;
                }
                if (currentItemValue.charAt(i) != compareValue.charAt(i)) {
                    return (currentItemValue.charAt(i) < compareValue.charAt(i));
                }
            }
            return (currentItemValue.length() < compareValue.length());
        }
    }


}
