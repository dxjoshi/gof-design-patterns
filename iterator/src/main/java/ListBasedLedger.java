import java.util.ArrayList;
import java.util.List;

public class ListBasedLedger implements Ledger {

    private final List<Integer> ledger;

    public ListBasedLedger() {
        this.ledger = new ArrayList<>();
    }

    @Override
    public CustomIterator getIterator() {
        return new ListBasedLedgerIterator(ledger);
    }

    @Override
    public void addEntry(Integer entry) {
        ledger.add(entry);
    }

    @Override
    public void removeEntry(Integer entry) {
        ledger.remove(Integer.valueOf(entry));
    }
}
