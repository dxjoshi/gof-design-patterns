import java.util.Iterator;
import java.util.List;

public class ListBasedLedgerIterator implements CustomIterator {

    private final List<Integer> ledger;
    private final Iterator<Integer> iterator;

    public ListBasedLedgerIterator(List<Integer> ledger) {
        this.ledger = ledger;
        iterator = ledger.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Integer nextElement() {
        return iterator.next();
    }
}
