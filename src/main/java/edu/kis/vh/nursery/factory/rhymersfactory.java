package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface rhymersfactory {

	public DefaultCountingOutRhymer GetStandardRhymer();

	public DefaultCountingOutRhymer GetFalseRhymer();

	public DefaultCountingOutRhymer GetFIFORhymer();

	public DefaultCountingOutRhymer GetHanoiRhymer();

}
