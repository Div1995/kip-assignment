package edu.knoldus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwoListMultiply {

    public static void main(String args[])
    {

      List<Integer>list1= new ArrayList<>();
      list1.add(1);
      list1.add(2);
      list1.add(3);
      list1.add(4);
      list1.add(5);
      list1.add(6);

      List<Integer>list2= new ArrayList<>();
      list2.add(1);
      list2.add(2);
      list2.add(3);
      list2.add(4);
      list2.add(5);
      list2.add(6);

      Iterator<Integer> iteratorList1 = list1.iterator();
      Iterator<Integer> iteratorList2 = list2.iterator();

      while (iteratorList1.hasNext()&&iteratorList2.hasNext()) {
        System.out.print( iteratorList1.next()*iteratorList2.next()+" ");
      }

    }
  }
