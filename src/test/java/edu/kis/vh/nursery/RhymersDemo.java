package edu.kis.vh.nursery;

<<<<<<< HEAD
import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.hanoiRhymer;
import edu.kis.vh.nursery.factory.defaultRhymersFactory;
import edu.kis.vh.nursery.factory.rhymersfactory;
=======
import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas)

class RhymersDemo {

    public static void main(String[] args) {
        rhymersfactory factory = new defaultRhymersFactory();
        
        DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
        
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((hanoiRhymer) rhymers[3]).reportRejected());
        
    }
    
}