package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	
	public static final int TOTAL = -1;
	public static final int TOTALY = 11;
    private int[] NUMBERS = new int[12];
    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == TOTALY;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }

}
