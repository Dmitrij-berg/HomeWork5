package HomeWork5;

import java.util.*;

/**
 . Выполнить конвертацию массивов {int, String}, {String, String}, {int, long}, {String,
 boolean}, {String, double}, {int, class Car}, {String, class Car} в HashMap, TreeMap, LinkedHashMap

 1.  Решить обратную задачу.
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

     int5_3.conv_Map(_key,volue);  //Конвертация массива int,String в HashMap, TreeMap, LinkedHashMap

     int[] mkey;

     //Конвертация из HashMap в массив int,String
     Integer[] a =new Integer[int5_3.hasmap.keySet().size()];
     String[] b = new String[int5_3.hasmap.values().size()];
     int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив int,String
     mkey = new int[a.length];
     int5_3.contain_int(a,mkey,int5_3.hasmap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
     String bb = Arrays.toString(b);
     System.out.println("Cодержимое массива String [] bb после преобразования из HashMap : "+bb);

     //Конвертация из TreeMap в массив int,String
     a =new Integer[int5_3.treemap.keySet().size()];
     b = new String[int5_3.treemap.values().size()];
     int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив int,String
     mkey = new int[a.length];
     int5_3.contain_int(a,mkey,int5_3.treemap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
     String bb1 = Arrays.toString(b);
     System.out.println("Cодержимое массива String [] bb1 после преобразования из TreeMap : "+bb1);

     //Конвертация из LinkedHashMap в массив int,String
     a =new Integer[int5_3.linkhashmap.keySet().size()];
     b = new String[int5_3.linkhashmap.values().size()];
     int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив int,String
     mkey = new int[a.length];
     int5_3.contain_int(a,mkey,int5_3.linkhashmap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
     String bb2 = Arrays.toString(b);
     System.out.println("Cодержимое массива String [] bb2 после преобразования из LinkedHashMap : "+bb2);
 }


    public void  mas_String_String(){

        HW5_3<String,String> int5_3 = new HW5_3<>();

        String[]_key = new String[]{"1", "2", "3", "4"};
        String[]volue = new String[]{"A", "B", "C", "D"};

        int5_3.conv_Map(_key,volue);  //Конвертация массива String,String в HashMap, TreeMap, LinkedHashMap

        //Конвертация из HashMap в массив String,String
        String[] a =new String[int5_3.hasmap.keySet().size()];
        String[] b = new String[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив String,String
        String aa = Arrays.toString(a);
        String bb = Arrays.toString(b);
        System.out.println("Cодержимое массива String [] aa после преобразования из HashMap : "+aa);
        System.out.println("Cодержимое массива String [] bb после преобразования из HashMap : "+bb);

        //Конвертация из TreeMap в массив String,String
        a =new String[int5_3.treemap.keySet().size()];
        b = new String[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив String,String
        String aa1 = Arrays.toString(a);
        String bb1 = Arrays.toString(b);
        System.out.println("Cодержимое массива String [] aa1 после преобразования из HashMap : "+aa1);
        System.out.println("Cодержимое массива String [] bb1 после преобразования из TreeMap : "+bb1);


        //Конвертация из LinkedHashMap в массив String,String
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new String[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив String,String
        String aa2 = Arrays.toString(a);
        String bb2 = Arrays.toString(b);
        System.out.println("Cодержимое массива String [] aa2 после преобразования из HashMap : "+aa2);
        System.out.println("Cодержимое массива String [] bb2 после преобразования из LinkedHashMap : "+bb2);

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

        int5_3.conv_Map(_key,_volue);  //Конвертация массива int,long в HashMap, TreeMap, LinkedHashMap

        int[] mkey;
        long[] mvolue;

        //Конвертация из HashMap в массив int,long
        Integer[] a =new Integer[int5_3.hasmap.keySet().size()];
        Long[] b = new Long[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив int,long
        mkey = new int[a.length];
        mvolue = new long[b.length];
        int5_3.contain_int(a,mkey,int5_3.hasmap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
        int5_3.contain_long(b, mvolue, int5_3.hasmap); // Конвертация из Long[] _volue в long[] mvolue c отображением содержимого

        //Конвертация из TreeMap в массив int,long
        a =new Integer[int5_3.treemap.keySet().size()];
        b = new Long[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив int,long
        mkey = new int[a.length];
        mvolue = new long[b.length];
        int5_3.contain_int(a,mkey,int5_3.treemap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
        int5_3.contain_long(b, mvolue, int5_3.treemap); // Конвертация из Long[] _volue в long[] mvolue c отображением содержимого



        //Конвертация из LinkedHashMap в массив int,long
        a =new Integer[int5_3.linkhashmap.keySet().size()];
        b = new Long[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив int,long
        mkey = new int[a.length];
        mvolue = new long[b.length];
        int5_3.contain_int(a,mkey,int5_3.linkhashmap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
        int5_3.contain_long(b, mvolue, int5_3.treemap); // Конвертация из Long[] _volue в long[] mvolue c отображением содержимого

    }

    public void  mas_String_boolean(){

        HW5_3<String,Boolean> int5_3 = new HW5_3<>();

        String[]key = new String[]{"A", "B"};
        boolean[] volue = new boolean[]{true,false};

        Boolean[] _volue = new Boolean[volue.length];
        for (int i = 0; i < _volue.length; i++) {
            _volue[i] = volue[i];
        }

        int5_3.conv_Map(key,_volue);  //Конвертация массива String,boolean в HashMap, TreeMap, LinkedHashMap

        boolean[] mvolue;

        //Конвертация из HashMap в массив String,boolean
        String[] a =new String[int5_3.hasmap.keySet().size()];
        Boolean[] b = new Boolean[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив String,boolean
        mvolue = new boolean[b.length];
        int5_3.contain_boolean(b, mvolue, int5_3.hasmap); // Конвертация из Boolean[] _volue в boolean[] mvolue c отображением содержимого
        String aa = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa после преобразования из HashMap : "+aa);

        //Конвертация из TreeMap в массив String,boolean
        a =new String[int5_3.treemap.keySet().size()];
        b = new Boolean[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив String,boolean
        mvolue = new boolean[b.length];
        int5_3.contain_boolean(b, mvolue, int5_3.treemap); // Конвертация из Boolean[] _volue в boolean[] mvolue c отображением содержимого
        String aa1 = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa1 после преобразования из TreeMap : "+aa1);


        //Конвертация из LinkedHashMap в массив String,boolean
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new Boolean[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив String,boolean
        mvolue = new boolean[b.length];
        int5_3.contain_boolean(b, mvolue, int5_3.linkhashmap); // Конвертация из Boolean[] _volue в boolean[] mvolue c отображением содержимого
        String aa2 = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa2 после преобразования из LinkedHashMap : "+aa2);
    }

    public void  mas_String_double(){

        HW5_3<String,Double> int5_3 = new HW5_3<>();

        String[]key = new String[]{"A", "B","C","D"};
        double[] volue = new double[]{1.0, 2.0, 3.0, 4.0};

        Double[] _volue = new Double[volue.length];
        for (int i = 0; i < _volue.length; i++) {
            _volue[i] = volue[i];
        }

        int5_3.conv_Map(key,_volue);  //Конвертация массива String,double HashMap, TreeMap, LinkedHashMap

        double[] mvolue;

        //Конвертация из HashMap в массив String,double
        String[] a =new String[int5_3.hasmap.keySet().size()];
        Double[] b = new Double[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив String,double
        mvolue = new double[b.length];
        int5_3.contain_double(b, mvolue, int5_3.hasmap); // Конвертация из Double[] _volue в double[] mvolue c отображением содержимого
        String aa = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa после преобразования из HashMap : "+aa);

        //Конвертация из TreeMap в массив String,double
        a =new String[int5_3.treemap.keySet().size()];
        b = new Double[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив String,double
        mvolue = new double[b.length];
        int5_3.contain_double(b, mvolue, int5_3.treemap); // Конвертация из Double[] _volue в double[] mvolue c отображением содержимого
        String aa1 = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa1 после преобразования из TreeMap : "+aa1);


        //Конвертация из LinkedHashMap в массив String,double
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new Double[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив String,double
        mvolue = new double[b.length];
        int5_3.contain_double(b, mvolue, int5_3.linkhashmap); // Конвертация из Double[] _volue в double[] mvolue c отображением содержимого
        String aa2 = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa2 после преобразования из LinkedHashMap : "+aa2);
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

        int5_3.conv_Map(_key,volue);  //Конвертация массива int,Car в HashMap, TreeMap, LinkedHashMap

        int[] mkey;

        //Конвертация из HashMap в массив int,Car
        Integer[] a =new Integer[int5_3.hasmap.keySet().size()];
        Car[] b = new Car[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив int,Car
        mkey = new int[a.length];
        int5_3.contain_int(a,mkey,int5_3.hasmap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
        int5_3.contain_Car(b, int5_3.hasmap); // Содержимое массива Car

        //Конвертация из TreeMap в массив int,Car
        a =new Integer[int5_3.treemap.keySet().size()];
        b = new Car[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив int,Car
        mkey = new int[a.length];
        int5_3.contain_int(a,mkey,int5_3.treemap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
        int5_3.contain_Car(b, int5_3.hasmap); // Содержимое массива Car

        //Конвертация из LinkedHashMap в массив int,Car
        a =new Integer[int5_3.linkhashmap.keySet().size()];
        b = new Car[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив int,Car
        mkey = new int[a.length];
        int5_3.contain_int(a,mkey,int5_3.linkhashmap); // Конвертация из Integer[] _key в int[] mkey c отображением содержимого
        int5_3.contain_Car(b, int5_3.hasmap); // Содержимое массива Car

    }


    public void  mas_String_Car(){

        HW5_3<String,Car> int5_3 = new HW5_3<>();

        String[]key = new String[]{"A", "B","C","D"};
        Car[] volue = new Car[4];
        volue[0] = new Car(1);
        volue[1] = new Car(2);
        volue[2] = new Car(3);
        volue[3] = new Car(4);

        int5_3.conv_Map(key,volue);  //Конвертация массива String,Car в HashMap, TreeMap, LinkedHashMap

        //Конвертация из HashMap в массив String,Car
        String[] a =new String[int5_3.hasmap.keySet().size()];
        Car[] b = new Car[int5_3.hasmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.hasmap);  //Конвертация из HashMap в массив String,Car
        int5_3.contain_Car(b, int5_3.hasmap); // Содержимое массива Car
        String aa = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa после преобразования из HashMap : "+aa);

        //Конвертация из TreeMap в массив String,Car
        a =new String[int5_3.treemap.keySet().size()];
        b = new Car[int5_3.treemap.values().size()];
        int5_3.to_massiv(a,b,int5_3.treemap); //Конвертация из TreeMap в массив String,Car
        int5_3.contain_Car(b, int5_3.hasmap); // Содержимое массива Car
        String aa1 = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa1 после преобразования из TreeMap : "+aa1);


        //Конвертация из LinkedHashMap в массив String,Car
        a =new String[int5_3.linkhashmap.keySet().size()];
        b = new Car[int5_3.linkhashmap.values().size()];
        int5_3.to_massiv(a,b,int5_3.linkhashmap); //Конвертация из LinkedHashMap в массив String,Car
        int5_3.contain_Car(b, int5_3.hasmap); // Содержимое массива Car
        String aa2 = Arrays.toString(a);
        System.out.println("Cодержимое массива String [] aa2 после преобразования из LinkedHashMap : "+aa2);
    }



 //Конвертация из Map в массив
public void to_massiv(T[] a,V[]b,Map<T,V> c){
    int index =  0 ;
    for  ( Map. Entry < T,V > mapEntry : c.entrySet ())  {
        a[index]  = (T) mapEntry . getKey ();
        b[index]  = (V) mapEntry . getValue ();
        index ++;
    }
}

    // Конвертация из Integer[]  в int[]  c отображением содержимого
 public void contain_int (Integer[] a,int[] w,Map h ){
  System.out.println(" ");
  System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" mkey после преобразования из "+h.getClass().getSimpleName()+" : [");
  for (int i = 0; i < a.length; i++) {
   w[i] = a[i];
   System.out.print(w[i] + " ");
  }
  System.out.println("]");
 }

    // Конвертация из Long[]  в long[]  c отображением содержимого
    public void contain_long (Long[] a,long[] w,Map h ){
        System.out.println(" ");
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" mkey после преобразования из "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // Конвертация из Boolean[]  в boolean[]  c отображением содержимого
    public void contain_boolean (Boolean[] a,boolean[] w,Map h ){
        System.out.println(" ");
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" mkey после преобразования из "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // Конвертация из Double[]  в double[]  c отображением содержимого
    public void contain_double (Double[] a,double[] w,Map h ){
        System.out.println(" ");
        System.out.print("Содержимое массива : "+w.getClass().getSimpleName()+" mkey после преобразования из "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            w[i] = a[i];
            System.out.print(w[i] + " ");
        }
        System.out.println("]");
    }


    // Отображение содержимого массива Car
    public void contain_Car (Car[] a,Map h ){
        System.out.println(" ");
        System.out.print("Содержимое массива : "+a.getClass().getSimpleName()+" после преобразования из "+h.getClass().getSimpleName()+" : [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }


   // Конвертация в HashMap,TreeMap,LinkedHashMap
    private void conv_Map(T[] a1, V[] b) {

        Map [] yyy = new Map[3];
        yyy[0]=new HashMap<T, V>();
        yyy[1]=new TreeMap<T, V>();
        yyy[2]=new LinkedHashMap<T, V>();

     for (int i  = 0;i<3;i++) {
         for (int j = 0; j < a1.length; j++) {
             yyy[i].put((T) a1[j], (V) b[j]);
         }
         System.out.println("Содержимое : " + yyy[i].getClass().getSimpleName() + " " + yyy[i].entrySet());
     }

        hasmap = (HashMap<T, V>) yyy[0];
        treemap = (TreeMap<T, V>) yyy[1];
        linkhashmap = (LinkedHashMap<T, V>) yyy[2];
    }



 public static void main(String[] args) {
  HW5_3 intro_3 = new HW5_3();

     intro_3.mas_int_String();     //Преобразование массива int,String в HashMap,TreeMap,LinkedMap и обратно
     intro_3.mas_String_String();  //Преобразование массива String,String в HashMap,TreeMap,LinkedMap и обратно
     intro_3.mas_int_long();       //Преобразование массива int,long в HashMap,TreeMap,LinkedMap и обратно
     intro_3.mas_String_boolean(); //Преобразование массива String,boolean в HashMap,TreeMap,LinkedMap и обратно
     intro_3.mas_String_double();  //Преобразование массива String,double в HashMap,TreeMap,LinkedMap и обратно
     intro_3.mas_int_class_Car();  //Преобразование массива int,class Car в HashMap,TreeMap,LinkedMap и обратно
     intro_3.mas_String_Car();     //Преобразование массива String,Car в HashMap,TreeMap,LinkedMap и обратно

 }
}







