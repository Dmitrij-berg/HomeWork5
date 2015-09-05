package HomeWork5;

import java.util.*;

/**
 2.	Выполнить конвертацию массива int, long, boolean, String, double, class Car в List
 (два варианта), Set(два варианта), Queue, Deque.

 1.  Использовать итераторы
 2.  Использовать конструкторы, методы других классов Arrays, Collections.
 3.  Решить обратную задачу.
 */
public class HW5_2<T> {

    public ArrayList<T>     arrlis;
    public LinkedList<T>    linlis;
    public HashSet<T>       hset;
    public LinkedHashSet<T> lihset;
    public PriorityQueue<T> priqueue;
    public ArrayDeque<T>    arrdque;

    public void int_to_list_to_int() {
        HW5_2<Integer> integ = new HW5_2<>();

        int[] _a = new int[]{1, 2, 3, 4};
        Integer [] a = new Integer[_a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = _a[i];
        }
        System.out.println("Преобразование массива int в List, Set, Queue, Deque");
        integ.conv_Collection(a);

        int[] _a1;
        //Преобразование ArrayList в массив int[] _a1
        Integer[] arraylist_i =  integ.arrlis.toArray(new Integer[integ.arrlis.size()]);
        _a1 = new int[arraylist_i.length];
        integ.contain_int(arraylist_i, _a1,integ.arrlis);

        //Преобразование LinkedList в массив int[] _a1
        Integer[] linkedList_i = integ.linlis.toArray(new Integer[integ.linlis.size()]);
        _a1 = new int[linkedList_i.length];
        integ.contain_int(linkedList_i, _a1,integ.linlis);

        //Преобразование HashSet в массив int[] _a1
        Integer[] hashSet_i = integ.hset.toArray(new Integer[integ.hset.size()]);
        _a1 = new int[linkedList_i.length];
        integ.contain_int(hashSet_i, _a1,integ.hset);

        //Преобразование LinkedHashSet в массив int[] _a1
        Integer[] linked_hashSet_i = integ.lihset.toArray(new Integer[integ.lihset.size()]);
        _a1 = new int[linked_hashSet_i.length];
        integ.contain_int(linked_hashSet_i, _a1,integ.lihset);

        //Преобразование PriorityQueue в массив int[] _a1
        Integer[] priority_queue_i = integ.priqueue.toArray(new Integer[integ.priqueue.size()]);
        _a1 = new int[priority_queue_i.length];
        integ.contain_int(priority_queue_i, _a1,integ.priqueue);

        //Преобразование ArrayDeque в массив int[] _a1
        Integer[] array_deque_i = integ.arrdque.toArray(new Integer[integ.arrdque.size()]);
        _a1 = new int[array_deque_i.length];
        integ.contain_int(array_deque_i, _a1,integ.arrdque);
    }
    public void long_to_array_list_to_long() {
        HW5_2<Long> integ = new HW5_2<>();
        long[] _a = new long[]{1, 2, 3, 4};
        Long[] a = new Long[_a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = _a[i];
        }
        System.out.println("Преобразование массива long в List, Set, Queue, Deque");
        integ.conv_Collection(a);

        long[] _a1;

        //Преобразование ArrayList в массив long[] _a1
        Long[] arraylist_L = integ.arrlis.toArray(new Long[integ.arrlis.size()]);
        _a1 = new long[arraylist_L.length];
        integ.contain_long(arraylist_L, _a1, integ.arrlis);

        //Преобразование LinkedList в массив long[] _a1
        Long[] linkedList_L = integ.linlis.toArray(new Long[integ.linlis.size()]);
        _a1 = new long[linkedList_L.length];
        integ.contain_long(linkedList_L, _a1,integ.linlis);

        //Преобразование HashSet в массив long[] _a1
        Long[] hashSet_L = integ.hset.toArray(new Long[integ.hset.size()]);
        _a1 = new long[hashSet_L.length];
        integ.contain_long(hashSet_L, _a1,integ.hset);

        //Преобразование LinkedHashSet в массив long[] _a1
        Long[] linked_hashSet_L = integ.lihset.toArray(new Long[integ.lihset.size()]);
        _a1 = new long[linked_hashSet_L.length];
        integ.contain_long(linked_hashSet_L, _a1,integ.lihset);

        //Преобразование PriorityQueue в массив long[] _a1
        Long[] priority_queue_L = integ.priqueue.toArray(new Long[integ.priqueue.size()]);
        _a1 = new long[priority_queue_L.length];
        integ.contain_long(priority_queue_L, _a1,integ.priqueue);

        //Преобразование ArrayDeque в массив long[] _a1
        Long[] array_deque_L = integ.arrdque.toArray(new Long[integ.arrdque.size()]);
        _a1 = new long[array_deque_L.length];
        integ.contain_long(array_deque_L, _a1,integ.arrdque);
    }

    public void boolean_to_array_list_to_boolean() {
        HW5_2<Boolean> integ = new HW5_2<>();
        boolean[] _a = new boolean[4];
        Arrays.fill(_a, true);
        Boolean[] a = new Boolean[_a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = _a[i];
        }
        System.out.println("Преобразование массива boolean в List, Set, Queue, Deque");
        integ.conv_Collection(a);

        boolean[] _a1;

        //Преобразование ArrayList в массив boolean[] _a1
        Boolean[] arraylist_b = integ.arrlis.toArray(new Boolean[integ.arrlis.size()]);
        _a1 = new boolean[arraylist_b.length];
        integ.contain_boolean(arraylist_b, _a1,integ.arrlis);

        //Преобразование LinkedList в массив boolean[] _a1
        Boolean[] linkedList_b = integ.linlis.toArray(new Boolean[integ.linlis.size()]);
        _a1 = new boolean[linkedList_b.length];
        integ.contain_boolean(linkedList_b, _a1,integ.linlis);

        //Преобразование HashSet в массив boolean[] _a1
        Boolean[] hashSet_b = integ.hset.toArray(new Boolean[integ.hset.size()]);
        _a1 = new boolean[hashSet_b.length];
        integ.contain_boolean(hashSet_b, _a1,integ.hset);

        //Преобразование LinkedHashSet в массив boolean[] _a1
        Boolean[] linked_hashSet_b = integ.lihset.toArray(new Boolean[integ.lihset.size()]);
        _a1 = new boolean[linked_hashSet_b.length];
        integ.contain_boolean(linked_hashSet_b, _a1,integ.lihset);

        //Преобразование PriorityQueue в массив boolean[] _a1
        Boolean[] priority_queue_b = integ.priqueue.toArray(new Boolean[integ.priqueue.size()]);
        _a1 = new boolean[priority_queue_b.length];
        integ.contain_boolean(priority_queue_b, _a1,integ.priqueue);

        //Преобразование ArrayDeque в массив boolean[] _a1
        Boolean[] array_deque_b = integ.arrdque.toArray(new Boolean[integ.arrdque.size()]);
        _a1 = new boolean[array_deque_b.length];
        integ.contain_boolean(array_deque_b, _a1,integ.arrdque);
    }

    public void String_to_array_list_to_String() {
        HW5_2<String> integ = new HW5_2<>();
        String[] _a = new String[]{"1", "2", "3", "4"};

        System.out.println("Преобразование массива String в List, Set, Queue, Deque");
        integ.conv_Collection(_a);

        String[] _a1;

        //Преобразование ArrayList в массив String[] _a1
        String[] arraylist_s = integ.arrlis.toArray(new String[integ.arrlis.size()]);
        _a1 = new String[arraylist_s.length];
        integ.contain_String(arraylist_s, _a1, integ.arrlis);

        //Преобразование LinkedList в массив String[] _a1
        String[] linkedList_s = integ.linlis.toArray(new String[integ.linlis.size()]);
        _a1 = new String[linkedList_s.length];
        integ.contain_String(linkedList_s, _a1, integ.linlis);

        //Преобразование HashSet в массив String[] _a1
        String[] hashSet_s = integ.hset.toArray(new String[integ.hset.size()]);
        _a1 = new String[hashSet_s.length];
        integ.contain_String(hashSet_s, _a1, integ.hset);

        //Преобразование LinkedHashSet в массив String[] _a1
        String[] linked_hashSet_s = integ.lihset.toArray(new String[integ.lihset.size()]);
        _a1 = new String[linked_hashSet_s.length];
        integ.contain_String(linked_hashSet_s, _a1, integ.lihset);

        //Преобразование PriorityQueue в массив String[] _a1
        String[] priority_queue_s = integ.priqueue.toArray(new String[integ.priqueue.size()]);
        _a1 = new String[priority_queue_s.length];
        integ.contain_String(priority_queue_s, _a1, integ.priqueue);

        //Преобразование ArrayDeque в массив String[] _a1
        String[] array_deque_s = integ.arrdque.toArray(new String[integ.arrdque.size()]);
        _a1 = new String[array_deque_s.length];
        integ.contain_String(array_deque_s, _a1, integ.arrdque);

    }

    public void double_to_array_list_to_double() {
        HW5_2<Double> integ = new HW5_2<>();
        double[] _a = new double[]{1.0, 2.0, 3.0, 4.0};
        Double[] a = new Double[_a.length];
        for (int i = 0; i < a.length; i++) a[i] = _a[i];
        System.out.println("Преобразование массива double в List, Set, Queue, Deque");
        integ.conv_Collection(a);

        double[] _a1;

        //Преобразование ArrayList в массив double[] _a1
        Double[] arraylist_d = integ.arrlis.toArray(new Double[integ.arrlis.size()]);
        _a1 = new double[arraylist_d.length];
        integ.contain_double(arraylist_d, _a1, integ.arrlis);

        //Преобразование LinkedList в массив double[] _a1
        Double[] linkedList_d = integ.linlis.toArray(new Double[integ.linlis.size()]);
        _a1 = new double[linkedList_d.length];
        integ.contain_double(linkedList_d, _a1, integ.linlis);

        //Преобразование HashSet в массив double[] _a1
        Double[] hashSet_d = integ.hset.toArray(new Double[integ.hset.size()]);
        _a1 = new double[hashSet_d.length];
        integ.contain_double(hashSet_d, _a1, integ.hset);

        //Преобразование LinkedHashSet в массив double[] _a1
        Double[] linked_hashSet_d = integ.lihset.toArray(new Double[integ.lihset.size()]);
        _a1 = new double[linked_hashSet_d.length];
        integ.contain_double(linked_hashSet_d, _a1, integ.lihset);

        //Преобразование PriorityQueue в массив double[] _a1
        Double[] priority_queue_d = integ.priqueue.toArray(new Double[integ.priqueue.size()]);
        _a1 = new double[priority_queue_d.length];
        integ.contain_double(priority_queue_d, _a1, integ.priqueue);

        //Преобразование ArrayDeque в массив double[] _a1
        Double[] array_deque_d = integ.arrdque.toArray(new Double[integ.arrdque.size()]);
        _a1 = new double[array_deque_d.length];
        integ.contain_double(array_deque_d, _a1, integ.arrdque);
    }

    public void car_to_array_list_to_car() {
        HW5_2<Car> integ = new HW5_2<>();
        Car[] _a = new Car[4];
        _a[0] = new Car(1);
        _a[1] = new Car(2);
        _a[2] = new Car(3);
        _a[3] = new Car(4);

        System.out.println("Преобразование массива Car в List, Set, Queue, Deque");
        integ.conv_Collection(_a);

        Car[] _a1;

        //Преобразование ArrayList в массив Car[] _a1
        Car[] arraylist_c = integ.arrlis.toArray(new Car[integ.arrlis.size()]);
        _a1 = new Car[arraylist_c.length];
        integ.contain_car(arraylist_c, _a1, integ.arrlis);

        //Преобразование LinkedList в массив Car[] _a1
        Car[] linkedList_c = integ.linlis.toArray(new Car[integ.linlis.size()]);
        _a1 = new Car[linkedList_c.length];
        integ.contain_car(linkedList_c, _a1, integ.linlis);

        //Преобразование HashSet в массив Car[] _a1
        Car[] hashSet_c = integ.hset.toArray(new Car[integ.hset.size()]);
        _a1 = new Car[hashSet_c.length];
        integ.contain_car(hashSet_c, _a1, integ.hset);

        //Преобразование LinkedHashSet в массив Car[] _a1
        Car[] linked_hashSet_c = integ.lihset.toArray(new Car[integ.lihset.size()]);
        _a1 = new Car[linked_hashSet_c.length];
        integ.contain_car(linked_hashSet_c, _a1, integ.lihset);

        //Преобразование PriorityQueue в массив Car[] _a1
        Car[] priority_queue_c = integ.priqueue.toArray(new Car[integ.priqueue.size()]);
        _a1 = new Car[priority_queue_c.length];
        integ.contain_car(priority_queue_c, _a1, integ.priqueue);

        //Преобразование ArrayDeque в массив Car[] _a1
        Car[] array_deque_c = integ.arrdque.toArray(new Car[integ.arrdque.size()]);
        _a1 = new Car[array_deque_c.length];
        integ.contain_car(array_deque_c, _a1, integ.arrdque);
    }


    public static void main(String[] args) {

        HW5_2 intege = new HW5_2();

        intege.int_to_list_to_int(); //Преобразование массива int в List, Set, Queue, Deque и обратно
        intege.long_to_array_list_to_long(); ////Преобразование массива long в List, Set, Queue, Deque и обратно
        intege.boolean_to_array_list_to_boolean(); ////Преобразование массива boolean в List, Set, Queue, Deque и обратно
        intege.double_to_array_list_to_double(); ////Преобразование массива double в List, Set, Queue, Deque и обратно
        intege.String_to_array_list_to_String(); ////Преобразование массива String в List, Set, Queue, Deque и обратно
        intege.car_to_array_list_to_car(); ////Преобразование массива Car в List, Set, Queue, Deque и обратно

    }

    public void contain_int (Integer[] a,int[] w,Collection h ){
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" _a1 в "+h.getClass().getSimpleName()+" [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }
    public void contain_long (Long[] a,long[] w,Collection h ){
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" _a1 в "+h.getClass().getSimpleName()+" [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }

    public void contain_boolean (Boolean[] a,boolean[] w,Collection h ){
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" _a1 в "+h.getClass().getSimpleName()+" [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }

    public void contain_double (Double[] a,double[] w,Collection h ){
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" _a1 в "+h.getClass().getSimpleName()+" [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }

    public void contain_String (String[] a,String[] w,Collection h ){
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" _a1 в "+h.getClass().getSimpleName()+" [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }

    public void contain_car (Car[] a,Car[] w,Collection h ){
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" _a1 в "+h.getClass().getSimpleName()+" [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // Преобразование массива  в List, Set, Queue, Deque
    private void conv_Collection(T[] a1) {

        Collection [] yyy = new Collection[6];
        yyy[0]=new ArrayList<T>(Arrays.<T>asList((T[]) a1));
        yyy[1]=new LinkedList<>(Arrays.asList((T[]) a1));
        yyy[2]=new HashSet<>(Arrays.<T>asList((T[]) a1));
        yyy[3]=new LinkedHashSet<>(Arrays.<T>asList((T[]) a1));
        yyy[4]=new PriorityQueue<>(Arrays.<T>asList((T[]) a1));
        yyy[5]=new ArrayDeque<>(Arrays.<T>asList((T[]) a1));

        arrlis = (ArrayList<T>) yyy[0];
        linlis = (LinkedList<T>) yyy[1];
        hset = (HashSet<T>) yyy[2];
        lihset = (LinkedHashSet<T>) yyy[3];
        priqueue = (PriorityQueue<T>) yyy[4];
        arrdque = (ArrayDeque<T>) yyy[5];

        for (int i =0; i<yyy.length;i++) {
            Iterator<T> itr = yyy[i].iterator();
            System.out.print("Содержимое "+yyy[i].getClass().getSimpleName()  + ": [ ");
            while (itr.hasNext()) {
                T element = itr.next();
                System.out.print(element + " ");
            }
            System.out.println("]");
        }
    }

}