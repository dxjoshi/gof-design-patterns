public class ArrayBasedLedgerIterator implements CustomIterator {

    private final Integer[] ledger;
    private int idx, max;

    public ArrayBasedLedgerIterator(Integer[] ledger, int max) {
        this.ledger = ledger;
        this.max = max;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx <= max;
    }

    @Override
    public Integer nextElement() {
        return ledger[idx++];
    }
}
