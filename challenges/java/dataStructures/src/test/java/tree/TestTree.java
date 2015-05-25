package tree;

import org.junit.Assert;
import org.junit.Test;

public class TestTree {

    @Test
    public void secondLowestIsFour() {
        Tree t = new Tree(4);
        t.insert(3);
        t.insert(7);
        t.insert(9);
        Assert.assertEquals(3, t.getLowest());
        Assert.assertEquals(4, t.getSecondLowest());
    }

    @Test
    public void secondLowestIsSeven() {
        Tree t = new Tree(4);
        t.insert(7);
        t.insert(9);
        Assert.assertEquals(4, t.getLowest());
        Assert.assertEquals(7, t.getSecondLowest());
    }

    @Test
    public void secondLowestIsFive() {
        Tree t = new Tree(4);
        t.insert(7);
        t.insert(5);
        t.insert(9);
        t.insert(8);
        Assert.assertEquals(4, t.getLowest());
        Assert.assertEquals(5, t.getSecondLowest());
    }
}
