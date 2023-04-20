package assignment8.prob1;
import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private Person[] personArray;
    private int size;

    public MyStringList() {
        personArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // Add element in last
    public void add(Person s) {
        if (s == null) return;
        if (size == personArray.length) resize();
        personArray[size++] = s;
    }

    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return personArray[i];
    }

    public boolean find(String s) {
        if (s == null) return false;
        for (Person test : personArray) {
            if (test.getLast().equals(s))
            {
                return true;
            }
        }
        return false; // The element is not in the list





    }

    public void insert(Person s, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == personArray.length || size + 1 > personArray.length) {
            resize();
        }
        Person[] temp = new Person[personArray.length + 1];
        System.arraycopy(personArray, 0, temp, 0, pos);
        temp[pos] = s;

        System.arraycopy(personArray, pos, temp, pos + 1, personArray.length - pos);
        personArray = temp;
        ++size;
    }

    public boolean remove(String s) {
        if (size == 0) return false; // list is empty
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (personArray[i].getLast().equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false; // s is not found in the list
        Person[] temp = new Person[personArray.length];
        System.arraycopy(personArray, 0, temp, 0, index);
        System.arraycopy(personArray, index + 1, temp, index, personArray.length - (index + 1));
        personArray = temp;
        --size;
        return true;
    }

    private void resize() {
        System.out.println("resizing");
        int len = personArray.length;
        int newlen = 2 * len;
        Person[] temp = new Person[newlen];
        System.arraycopy(personArray, 0, temp, 0, len);
        personArray = temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(personArray[i] + ", ");
        }
        sb.append(personArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(personArray, size);
        return temp;

    }

    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        Person p=new Person("Reza","Khan",42);
        Person p1=new Person("Kabir","Ahmed",43);
        Person p2=new Person("Buddah","Dev",40);
        Person p3=new Person("Dev","Jhon",52);
        l.add(p);
        l.add(p1);
        l.add(p2);
        l.add(p3);

        System.out.println(l);
        System.out.print("Search by last name result is : "+l.find("Reza"));
        System.out.println("\n");
        System.out.print("Remove last name result is : "+l.remove("Reza"));
        System.out.println(l);



       /*
        l.add("Mark");
        l.add("Anna");
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        System.out.println(l);
        l.insert("Tom", 2);
        l.insert("f", 5);
        l.insert("g", 7);
        l.insert("h", 2);
        System.out.println(l);
        l.add("Dave");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Mark");
        l.remove("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.insert("Richard", 3);
        System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
        l.insert("Tonya", 0);
        System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
        String[] x = (String[]) l.clone();
        System.out.println(Arrays.toString(x));

        */
    }

}