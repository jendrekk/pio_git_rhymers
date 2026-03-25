package edu.kis.vh.nursery;

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/fifoRhymer.java
public class fifoRhymer extends defaultCountingOutRhymer {
=======
public class FIFORhymer extends DefaultCountingOutRhymer {
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas):src/main/java/edu/kis/vh/nursery/FIFORhymer.java

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

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
