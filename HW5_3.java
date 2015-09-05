package HomeWork5;

import java.util.*;

/**
 . ��������� ����������� �������� {int, String}, {String, String}, {int, long}, {String,
 boolean}, {String, double}, {int, class Car}, {String, class Car} � HashMap, TreeMap, LinkedHashMap

 1.  ������ �������� ������.
 */
public class HW5_3<T, V> {

public HashMap<T,V> hasmap ;
public TreeMap<T,V> treemap;
public LinkedHashMap<T,V> linkhashmap;

 public void  mas_int_String(){

  HW5_3<Integer,String> int5_3 = new HW5_3<>();

  String[]volue = new String[]{"A", "B", "C", "D"};
  int[] key = new int[]{1, 2, 3, 4};

  Integer[] _key = new Integer[key.length];
  for (int i = 0; i < key.length; i++) {
   _key[i] = key[i];
  }

     int5_3.conv_Map(_key,volue);  //����������� ������� int,String � HashMap, TreeMap, LinkedHashMap

     int[] mkey;

     //����������� �� HashMap � ������ int,String
     Integer[] a =new Integer[int5_3.hasmap.keySet().size()];
     String[] b = new String[int5_3.hasmap.values().size()];
     int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ int,String
     mkey = new int[a.length];
     int5_3.contain_int(a,mkey,int5_3.hasmap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
     String bb = Arrays.toString(b);
     System.out.println("C��������� ������� String [] bb ����� �������������� �� HashMap : "+bb);

     //����������� �� TreeMap � ������ int,String
     a =new Integer[int5_3.treemap.keySet().size()];
     b = new String[int5_3.treemap.values().size()];
     int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ int,String
     mkey = new int[a.length];
     int5_3.contain_int(a,mkey,int5_3.treemap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
     String bb1 = Arrays.toString(b);
     System.out.println("C��������� ������� String [] bb1 ����� �������������� �� TreeMap : "+bb1);

     //����������� �� LinkedHashMap � ������ int,String
     a =new Integer[int5_3.linkhashmap.keySet().size()];
     b = new String[int5_3.linkhashmap.values().size()];
     int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ int,String
     mkey = new int[a.length];
     int5_3.contain_int(a,mkey,int5_3.linkhashmap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
     String bb2 = Arrays.toString(b);
     System.out.println("C��������� ������� String [] bb2 ����� �������������� �� LinkedHashMap : "+bb2);
 }


    public void  mas_String_String(){

        HW5_3<String,String> int5_3 = new HW5_3<>();

        String[]_key = new String[]{"1", "2", "3", "4"};
        String[]volue = new String[]{"A", "B", "C", "D"};

        int5_3.conv_Map(_key,volue);  //����������� ������� String,String � HashMap, TreeMap, LinkedHashMap

        //����������� �� HashMap � ������ String,String
        String[] a =new String[int5_3.hasmap.keySet().size()];
        String[] b = new String[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ String,String
        String aa = Arrays.toString(a);
        String bb = Arrays.toString(b);
        System.out.println("C��������� ������� String [] aa ����� �������������� �� HashMap : "+aa);
        System.out.println("C��������� ������� String [] bb ����� �������������� �� HashMap : "+bb);

        //����������� �� TreeMap � ������ String,String
        a =new String[int5_3.treemap.keySet().size()];
        b = new String[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ String,String
        String aa1 = Arrays.toString(a);
        String bb1 = Arrays.toString(b);
        System.out.println("C��������� ������� String [] aa1 ����� �������������� �� HashMap : "+aa1);
        System.out.println("C��������� ������� String [] bb1 ����� �������������� �� TreeMap : "+bb1);


        //����������� �� LinkedHashMap � ������ String,String
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new String[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ String,String
        String aa2 = Arrays.toString(a);
        String bb2 = Arrays.toString(b);
        System.out.println("C��������� ������� String [] aa2 ����� �������������� �� HashMap : "+aa2);
        System.out.println("C��������� ������� String [] bb2 ����� �������������� �� LinkedHashMap : "+bb2);

    }

    public void  mas_int_long(){

        HW5_3<Integer,Long> int5_3 = new HW5_3<>();

        int[] key = new int[]{1, 2, 3, 4};
        long[] volue = new long[]{1, 2, 3, 4};

        Integer[] _key = new Integer[key.length];
        for (int i = 0; i < key.length; i++) {
            _key[i] = key[i];
        }

        Long[] _volue = new Long[volue.length];
        for (int i = 0; i < key.length; i++) {
            _volue[i] = volue[i];
        }

        int5_3.conv_Map(_key,_volue);  //����������� ������� int,long � HashMap, TreeMap, LinkedHashMap

        int[] mkey;
        long[] mvolue;

        //����������� �� HashMap � ������ int,long
        Integer[] a =new Integer[int5_3.hasmap.keySet().size()];
        Long[] b = new Long[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ int,long
        mkey = new int[a.length];
        mvolue = new long[b.length];
        int5_3.contain_int(a,mkey,int5_3.hasmap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
        int5_3.contain_long(b, mvolue, int5_3.hasmap); // ����������� �� Long[] _volue � long[] mvolue c ������������ �����������

        //����������� �� TreeMap � ������ int,long
        a =new Integer[int5_3.treemap.keySet().size()];
        b = new Long[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ int,long
        mkey = new int[a.length];
        mvolue = new long[b.length];
        int5_3.contain_int(a,mkey,int5_3.treemap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
        int5_3.contain_long(b, mvolue, int5_3.treemap); // ����������� �� Long[] _volue � long[] mvolue c ������������ �����������



        //����������� �� LinkedHashMap � ������ int,long
        a =new Integer[int5_3.linkhashmap.keySet().size()];
        b = new Long[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ int,long
        mkey = new int[a.length];
        mvolue = new long[b.length];
        int5_3.contain_int(a,mkey,int5_3.linkhashmap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
        int5_3.contain_long(b, mvolue, int5_3.treemap); // ����������� �� Long[] _volue � long[] mvolue c ������������ �����������

    }

    public void  mas_String_boolean(){

        HW5_3<String,Boolean> int5_3 = new HW5_3<>();

        String[]key = new String[]{"A", "B"};
        boolean[] volue = new boolean[]{true,false};

        Boolean[] _volue = new Boolean[volue.length];
        for (int i = 0; i < _volue.length; i++) {
            _volue[i] = volue[i];
        }

        int5_3.conv_Map(key,_volue);  //����������� ������� String,boolean � HashMap, TreeMap, LinkedHashMap

        boolean[] mvolue;

        //����������� �� HashMap � ������ String,boolean
        String[] a =new String[int5_3.hasmap.keySet().size()];
        Boolean[] b = new Boolean[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ String,boolean
        mvolue = new boolean[b.length];
        int5_3.contain_boolean(b, mvolue, int5_3.hasmap); // ����������� �� Boolean[] _volue � boolean[] mvolue c ������������ �����������
        String aa = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa ����� �������������� �� HashMap : "+aa);

        //����������� �� TreeMap � ������ String,boolean
        a =new String[int5_3.treemap.keySet().size()];
        b = new Boolean[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ String,boolean
        mvolue = new boolean[b.length];
        int5_3.contain_boolean(b, mvolue, int5_3.treemap); // ����������� �� Boolean[] _volue � boolean[] mvolue c ������������ �����������
        String aa1 = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa1 ����� �������������� �� TreeMap : "+aa1);


        //����������� �� LinkedHashMap � ������ String,boolean
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new Boolean[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ String,boolean
        mvolue = new boolean[b.length];
        int5_3.contain_boolean(b, mvolue, int5_3.linkhashmap); // ����������� �� Boolean[] _volue � boolean[] mvolue c ������������ �����������
        String aa2 = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa2 ����� �������������� �� LinkedHashMap : "+aa2);
    }

    public void  mas_String_double(){

        HW5_3<String,Double> int5_3 = new HW5_3<>();

        String[]key = new String[]{"A", "B","C","D"};
        double[] volue = new double[]{1.0, 2.0, 3.0, 4.0};

        Double[] _volue = new Double[volue.length];
        for (int i = 0; i < _volue.length; i++) {
            _volue[i] = volue[i];
        }

        int5_3.conv_Map(key,_volue);  //����������� ������� String,double HashMap, TreeMap, LinkedHashMap

        double[] mvolue;

        //����������� �� HashMap � ������ String,double
        String[] a =new String[int5_3.hasmap.keySet().size()];
        Double[] b = new Double[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ String,double
        mvolue = new double[b.length];
        int5_3.contain_double(b, mvolue, int5_3.hasmap); // ����������� �� Double[] _volue � double[] mvolue c ������������ �����������
        String aa = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa ����� �������������� �� HashMap : "+aa);

        //����������� �� TreeMap � ������ String,double
        a =new String[int5_3.treemap.keySet().size()];
        b = new Double[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ String,double
        mvolue = new double[b.length];
        int5_3.contain_double(b, mvolue, int5_3.treemap); // ����������� �� Double[] _volue � double[] mvolue c ������������ �����������
        String aa1 = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa1 ����� �������������� �� TreeMap : "+aa1);


        //����������� �� LinkedHashMap � ������ String,double
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new Double[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ String,double
        mvolue = new double[b.length];
        int5_3.contain_double(b, mvolue, int5_3.linkhashmap); // ����������� �� Double[] _volue � double[] mvolue c ������������ �����������
        String aa2 = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa2 ����� �������������� �� LinkedHashMap : "+aa2);
    }


    public void  mas_int_class_Car(){

        HW5_3<Integer,Car> int5_3 = new HW5_3<>();

        Car[] volue = new Car[4];
        volue[0] = new Car(1);
        volue[1] = new Car(2);
        volue[2] = new Car(3);
        volue[3] = new Car(4);

        int[] key = new int[]{1, 2, 3, 4};

        Integer[] _key = new Integer[key.length];
        for (int i = 0; i < key.length; i++) {
            _key[i] = key[i];
        }

        int5_3.conv_Map(_key,volue);  //����������� ������� int,Car � HashMap, TreeMap, LinkedHashMap

        int[] mkey;

        //����������� �� HashMap � ������ int,Car
        Integer[] a =new Integer[int5_3.hasmap.keySet().size()];
        Car[] b = new Car[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ int,Car
        mkey = new int[a.length];
        int5_3.contain_int(a,mkey,int5_3.hasmap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
        int5_3.contain_Car(b, int5_3.hasmap); // ���������� ������� Car

        //����������� �� TreeMap � ������ int,Car
        a =new Integer[int5_3.treemap.keySet().size()];
        b = new Car[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ int,Car
        mkey = new int[a.length];
        int5_3.contain_int(a,mkey,int5_3.treemap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
        int5_3.contain_Car(b, int5_3.hasmap); // ���������� ������� Car

        //����������� �� LinkedHashMap � ������ int,Car
        a =new Integer[int5_3.linkhashmap.keySet().size()];
        b = new Car[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ int,Car
        mkey = new int[a.length];
        int5_3.contain_int(a,mkey,int5_3.linkhashmap); // ����������� �� Integer[] _key � int[] mkey c ������������ �����������
        int5_3.contain_Car(b, int5_3.hasmap); // ���������� ������� Car

    }


    public void  mas_String_Car(){

        HW5_3<String,Car> int5_3 = new HW5_3<>();

        String[]key = new String[]{"A", "B","C","D"};
        Car[] volue = new Car[4];
        volue[0] = new Car(1);
        volue[1] = new Car(2);
        volue[2] = new Car(3);
        volue[3] = new Car(4);

        int5_3.conv_Map(key,volue);  //����������� ������� String,Car � HashMap, TreeMap, LinkedHashMap

        //����������� �� HashMap � ������ String,Car
        String[] a =new String[int5_3.hasmap.keySet().size()];
        Car[] b = new Car[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //����������� �� HashMap � ������ String,Car
        int5_3.contain_Car(b, int5_3.hasmap); // ���������� ������� Car
        String aa = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa ����� �������������� �� HashMap : "+aa);

        //����������� �� TreeMap � ������ String,Car
        a =new String[int5_3.treemap.keySet().size()];
        b = new Car[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //����������� �� TreeMap � ������ String,Car
        int5_3.contain_Car(b, int5_3.hasmap); // ���������� ������� Car
        String aa1 = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa1 ����� �������������� �� TreeMap : "+aa1);


        //����������� �� LinkedHashMap � ������ String,Car
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new Car[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //����������� �� LinkedHashMap � ������ String,Car
        int5_3.contain_Car(b, int5_3.hasmap); // ���������� ������� Car
        String aa2 = Arrays.toString(a);
        System.out.println("C��������� ������� String [] aa2 ����� �������������� �� LinkedHashMap : "+aa2);
    }



 //����������� �� Map � ������
public void to_massiv(T[] a,V[]b,Map<T,V> c){
    int index =  0 ;
    for  ( Map. Entry < T,V > mapEntry : c.entrySet ())  {
        a[index]  = (T) mapEntry . getKey ();
        b[index]  = (V) mapEntry . getValue ();
        index ++;
    }
}

    // ����������� �� Integer[]  � int[]  c ������������ �����������
 public void contain_int (Integer[] a,int[] w,Map h ){
  System.out.println(" ");
  System.out.print("���������� ������� : "+w.getClass().getSimpleName()+" mkey ����� �������������� �� "+h.getClass().getSimpleName()+" : [");
  for (int i = 0; i < a.length; i++) {
   w[i] = a[i];
   System.out.print(w[i] + " ");
  }
  System.out.println("]");
 }

    // ����������� �� Long[]  � long[]  c ������������ �����������
    public void contain_long (Long[] a,long[] w,Map h ){
        System.out.println(" ");
        System.out.print("���������� ������� : "+w.getClass().getSimpleName()+" mkey ����� �������������� �� "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // ����������� �� Boolean[]  � boolean[]  c ������������ �����������
    public void contain_boolean (Boolean[] a,boolean[] w,Map h ){
        System.out.println(" ");
        System.out.print("���������� ������� : "+w.getClass().getSimpleName()+" mkey ����� �������������� �� "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // ����������� �� Double[]  � double[]  c ������������ �����������
    public void contain_double (Double[] a,double[] w,Map h ){
        System.out.println(" ");
        System.out.print("���������� ������� : "+w.getClass().getSimpleName()+" mkey ����� �������������� �� "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // ����������� ����������� ������� Car
    public void contain_Car (Car[] a,Map h ){
        System.out.println(" ");
        System.out.print("���������� ������� : "+a.getClass().getSimpleName()+" ����� �������������� �� "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }


   // ����������� � HashMap,TreeMap,LinkedHashMap
    private void conv_Map(T[] a1, V[] b) {

        Map [] yyy = new Map[3];
        yyy[0]=new HashMap<T, V>();
        yyy[1]=new TreeMap<T, V>();
        yyy[2]=new LinkedHashMap<T, V>();

     for (int i  = 0;i<3;i++) {
         for (int j = 0; j < a1.length; j++) {
             yyy[i].put((T) a1[j], (V) b[j]);
         }
         System.out.println("���������� : " + yyy[i].getClass().getSimpleName() + " " + yyy[i].entrySet());
     }

        hasmap = (HashMap<T, V>) yyy[0];
        treemap = (TreeMap<T, V>) yyy[1];
        linkhashmap = (LinkedHashMap<T, V>) yyy[2];
    }



 public static void main(String[] args) {
  HW5_3 intro_3 = new HW5_3();

     intro_3.mas_int_String();     //�������������� ������� int,String � HashMap,TreeMap,LinkedMap � �������
     intro_3.mas_String_String();  //�������������� ������� String,String � HashMap,TreeMap,LinkedMap � �������
     intro_3.mas_int_long();       //�������������� ������� int,long � HashMap,TreeMap,LinkedMap � �������
     intro_3.mas_String_boolean(); //�������������� ������� String,boolean � HashMap,TreeMap,LinkedMap � �������
     intro_3.mas_String_double();  //�������������� ������� String,double � HashMap,TreeMap,LinkedMap � �������
     intro_3.mas_int_class_Car();  //�������������� ������� int,class Car � HashMap,TreeMap,LinkedMap � �������
     intro_3.mas_String_Car();     //�������������� ������� String,Car � HashMap,TreeMap,LinkedMap � �������

 }
}







