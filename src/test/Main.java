package test;

//the first
public class Main {

    public static void main(String[] args) {

        Object[] a = {1,23,7,4,76,3,7};
        a = reverseArray(a);
        for(int i = 0;i<7;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
        Object[] b = new Object[a.length];
        for(int i = 0; i<a.length;i++)
            b[i] = a[a.length-i-1];
        return b;
    }


}
