public class GenericClass<T,Y> {
    private T t;
    private Y y;

    public GenericClass(T t, Y y) {
        this.t = t;
        this.y = y;
    }

    public GenericClass() {
    }
    public < T,Y extends Number> void arr(T[] arr){
     int san=0;
        for (int i = 0; i < arr.length; i++) {
         san=Math.max(san, (Integer) arr[i]);
        }
        System.out.println(san);

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "GenericClass " +
                " " + t +
                " " + y;
    }
}
