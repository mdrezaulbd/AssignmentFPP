package assignment8.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static List<Marketing> mkt = new ArrayList<>();

    public static void main(String[] args) {
        Marketing m1 = new Marketing("Rezaul", "Laptop", 40000.0);
        Marketing m2 = new Marketing("Karim", "Mikrotik", 30000.0);
        Marketing m3 = new Marketing("Jhon", "Mouse", 2000.0);
        Marketing m4 = new Marketing("Dev", "Keyboard", 70000.0);
        Main mainobj = new Main();

        mainobj.add(m1);
        mainobj.add(m2);
        mainobj.add(m3);
        mainobj.add(m4);
        System.out.println(mkt.toString());
        System.out.println("size :" + mainobj.size());
        mainobj.remove(m2);

        System.out.println(mkt.toString());
        System.out.println("size :" + mainobj.size());

        mainobj.sort(mkt);
        System.out.println(mkt.toString());

        List<Marketing> moreThan1000List = listMoreThan1000(mkt);


        moreThan1000List.sort(new Comparator<Marketing>() {
                                  @Override
                                  public int compare(Marketing o1, Marketing o2) {

                                      return Double.compare(m1.getSalesamount(), m2.getSalesamount());
                                  }
                              }
        );

        System.out.println("Sorted list by sales amount:");
        for (Marketing marketing : moreThan1000List) {
            System.out.println(marketing);
        }


    }


    public void add(Marketing m) {
        mkt.add(m);

    }

    public boolean remove(Marketing m) {
        return mkt.remove(m);

    }

    public int size() {
        return mkt.size();

    }


    private void sort(List<Marketing> list) {

        class SalesAmountComparator implements Comparator<Marketing> {

            @Override
            public int compare(Marketing m1, Marketing m2) {

                return Double.compare(m1.getSalesamount(), m2.getSalesamount());

            }


        }
        list.sort(new SalesAmountComparator());

    }


    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesamount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }


}
