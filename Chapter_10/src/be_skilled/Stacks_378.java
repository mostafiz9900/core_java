package be_skilled;

public class Stacks_378 {

    private int[] elements;
    private int size;
    public static final int DEFALT_CAPACTIY = 16;

    public Stacks_378() {
        this(DEFALT_CAPACTIY);
    }

    public Stacks_378(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];

    }

    public int peek() {
        return elements[size - 1];

    }

    public boolean empty() {
        return size == 0;

    }

    public int getSize() {
        return size;
    }

}
