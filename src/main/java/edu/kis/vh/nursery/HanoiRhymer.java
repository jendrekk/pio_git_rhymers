package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

<<<<<<< HEAD
	int totalRejected = 0;
=======
    int totalRejected = 0;
>>>>>>> origin/format

	public int reportRejected() {
		return totalRejected;
	}

<<<<<<< HEAD
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
=======
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
>>>>>>> origin/format
            totalRejected++;
        else
            super.countIn(in);
    }
}
