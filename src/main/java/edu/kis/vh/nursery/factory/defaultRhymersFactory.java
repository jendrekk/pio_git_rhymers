package edu.kis.vh.nursery.factory;

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/factory/defaultRhymersFactory.java
import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.fifoRhymer;
import edu.kis.vh.nursery.hanoiRhymer;
import edu.kis.vh.nursery.factory.rhymersfactory;
=======
import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas):src/main/java/edu/kis/vh/nursery/factory/DefaultRhymersFactory.java

public class defaultRhymersFactory implements rhymersfactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/factory/defaultRhymersFactory.java
    @Override
    public defaultCountingOutRhymer GetFIFORhymer() {
        return new fifoRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetHanoiRhymer() {
        return new hanoiRhymer();
    }
=======
	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas):src/main/java/edu/kis/vh/nursery/factory/DefaultRhymersFactory.java

}
