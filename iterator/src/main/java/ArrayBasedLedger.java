public class ArrayBasedLedger implements Ledger {

    private final Integer[] ledger;
    private int count;
    private boolean first = true;

    public ArrayBasedLedger() {
        this.ledger = new Integer[10];
        count = 0;
    }

    @Override
    public CustomIterator getIterator() {
        return new ArrayBasedLedgerIterator(ledger, count);
    }

    @Override
    public void addEntry(Integer entry) {
        if (count < ledger.length) {
            if (count == 0 && first) {
                ledger[count] = entry;
                first = false;
            } else {
                count++;
                ledger[count] = entry;
            }
        } else {
            System.out.println("Array full");
        }
        System.out.println("add-->"+count);
    }

    @Override
    public void removeEntry(Integer entry) {
        if (count == 0) {
            System.out.println("Array empty");
        }
        for (int i = 0; i <= count; i++) {
            if  (ledger[i] == entry.intValue()) {
                for (int j = i; j <= count; j++) {
                    ledger[j] = ledger[j+1];
                }
                count--;
                break;
            }
        }
        System.out.println("remove-->"+count);

    }
}
