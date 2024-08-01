package ch04_stackqueue;

public class IntStack {
    private int[] stk;           // 스택용 배열
    private int capacity;        // 스택의 크기
    private int ptr;             // 스택 포인터

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }


    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x)
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
            System.out.println("스택이 비어있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(STR."\{stk[i]} ");
            System.out.println();
        }
    }
}