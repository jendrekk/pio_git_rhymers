package edu.kis.vh.nursery;

public class hanoiRhymer extends defaultCountingOutRhymer {

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/hanoiRhymer.java
	int totalRejected = 0;
=======
	<<<<<<<HEAD
	int totalRejected = 0;=======
	int totalRejected = 0;>>>>>>>origin/format
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas):src/main/java/edu/kis/vh/nursery/HanoiRhymer.java

	public int reportRejected() {
		return totalRejected;
	}

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/hanoiRhymer.java
    public void countIn(int in) {
=======
	<<<<<<<HEAD

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
=======

	public void countIn(int in) {
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas):src/main/java/edu/kis/vh/nursery/HanoiRhymer.java
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
