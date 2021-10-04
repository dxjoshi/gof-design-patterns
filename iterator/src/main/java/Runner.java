public class Runner {
    public static void main(String[] args) {
        Ledger listBasedLedger = new ListBasedLedger();
        listBasedLedger.addEntry(1);
        listBasedLedger.addEntry(10);
        listBasedLedger.addEntry(100);
        listBasedLedger.addEntry(1000);
        listBasedLedger.removeEntry(100);

        CustomIterator listIterator = listBasedLedger.getIterator();
        System.out.println("Iterator for List based Ledger");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextElement());
        }

        Ledger arrayBasedLedger = new ArrayBasedLedger();
        arrayBasedLedger.addEntry(1);
        arrayBasedLedger.addEntry(20);
        arrayBasedLedger.addEntry(300);
        arrayBasedLedger.addEntry(4000);
        arrayBasedLedger.removeEntry(4000);
        CustomIterator arrayIterator = arrayBasedLedger.getIterator();
        System.out.println("Iterator for Array based Ledger");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.nextElement());
        }


    }
}
