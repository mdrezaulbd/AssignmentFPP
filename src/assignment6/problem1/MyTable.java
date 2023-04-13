package assignment6.problem1;

public class MyTable {
    private Entry[] entries = new Entry[26];

    //returns the String that is matched with char c in the table
    public String get(char c) {
//implement
        int index = c - 'a';
        if (index >= 0 && index < 26) {
            Entry entry = entries[index];
            if (entry != null) {
                return entry.str;
            }
        }
        return null;
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        int index = c - 'a';
        if (index >= 0 && index < 26) {
            entries[index] = new Entry(c, s);
        }
//implement
    }

    //returns a String consisting of nicely formatted display
//of the contents of the table
    public String toString() {
//implement
        String str = "";
        for (Entry entry : entries) {
            if (entry != null) {
                str = str + entry.toString() + "\n";
            }
        }
        return str;

    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
//implement
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        @Override
        public String toString() {
//implement
            return this.ch + "->" + this.str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");

        String s = t.get('b');
        System.out.println("First output:");
        System.out.println(s);

        System.out.println("Second output:");
        System.out.println(t);

    }
}