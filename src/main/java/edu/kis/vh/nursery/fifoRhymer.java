package edu.kis.vh.nursery;

public class fifoRhymer extends defaultCountingOutRhymer {

<<<<<<< HEAD
    public final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
=======
	 public final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
>>>>>>> 1972afb (dodanie stałych, final i annotacji @Override)

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
