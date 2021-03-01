public interface Ledger {

    CustomIterator getIterator();

    void addEntry(Integer entry);

    void removeEntry(Integer entry);

}
