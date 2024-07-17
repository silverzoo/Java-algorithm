package ch04_stackqueue.practice.practice02;

public class Stack<E> {
    private E[] stk;
    private int capacity;
    private int ptr;

    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() { }
    }

    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() { }
    }

    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = (E[])new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E x) throws OverflowGstackException {
        if (ptr >= capacity)
            throw new OverflowGstackException();
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyGstackException {
        if (ptr <= 0)
            throw new EmptyGstackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyGstackException {
        if (ptr <= 0)
            throw new EmptyGstackException();
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(E x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i].equals(x))
                return i;
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(STR."\{stk[i]} ");
            System.out.println();
        }
    }
}
