package HomeWork5;


public class Car implements Comparable{

    int carA, carB;
    private Integer s;

    public Car(Integer s) {
        this.setS(s);
    }


    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

//    @Override
//    public int compare(Car o1, Car o2) {
//        Integer scarA =  o1.carA;
//        Integer scarB =  o2.carB;
//        if (scarA>scarB) return 1;
//        if (scarA<scarB) return -1;
//        return 0;
//    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof Car))
            return false;
        Car other = (Car) obj;
        if(this.carA != other.carA)
            return false ;
        if(this.carB != other.carB)
            return false ;
        return true;
    }


    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + carA;
        result = prime * result + carB;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Car one =  (Car)o;
        if(this.carB < one.carB) return -1 ;
        if(this.carB > one.carB) return 1 ;
        return 0;
    }
}
