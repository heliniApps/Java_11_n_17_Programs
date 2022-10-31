package main.java.com.academy;

public abstract class ListItem<E> {

    private E value;
    private ListItem<E> nextItem;
    private ListItem<E> previousItem;

    public ListItem(E value, ListItem<E> nextItem, ListItem<E> previousItem) {
        this.value = value;
        this.nextItem = nextItem;
        this.previousItem = previousItem;
    }

    public E getValue() {
        return value;
    }

    public ListItem<E> getNextItem() {
        return nextItem;
    }

    public ListItem<E> getPreviousItem() {
        return previousItem;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void setNextItem(ListItem<E> nextItem) {
        this.nextItem = nextItem;
    }

    public void setPreviousItem(ListItem<E> previousItem) {
        this.previousItem = previousItem;
    }

    public abstract int compareTo(ListItem<E> item);

}
