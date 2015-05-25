package tree;

public class Tree {

    private Tree leftTree;
    private Tree rightTree;

    private final int nodeValue;

    public Tree(final int nodeValue) {
        this.nodeValue = nodeValue;
        leftTree = null;
        rightTree = null;
    }

    public int getSecondLowest() {
        if (leftTree != null) {
            return Math.max(nodeValue, leftTree.getLowest());
        } else if (rightTree != null) {
            return Math.max(nodeValue, rightTree.getLowest());
        }

        return getLowest();
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public int getLowest() {
        return leftTree != null ? leftTree.getLowest() : nodeValue;
    }

    public void insert(final int value) {
        if (value <= nodeValue) {
            insertLeft(value);
        } else {
            insertRight(value);
        }
    }

    public void insertLeft(final int value) {
        if (leftTree == null) {
            leftTree = new Tree(value);
        } else {
            leftTree.insert(value);
        }
    }

    public void insertRight(final int value) {
        if (rightTree == null) {
            rightTree = new Tree(value);
        } else {
            rightTree.insert(value);
        }
    }

}
