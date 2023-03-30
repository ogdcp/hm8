import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
       int [] i = new int [3];
       i[0]=  1;
        i[1] = 2;
        i[2] = 3;
       for (int a = 0; a < i.length; a++ ) {
           System.out.println(i[a]);
       }
       double [] m = {1.57, 7.654, 9.986};
        for (int  a= 0; a < m.length; a++ ) {
            System.out.println(m[a]);
        }
        int[] l = {1, 2, 3, 4, 5, 6, 7};
        for (int a = 0; a < l.length; a++ ) {
            System.out.println(l[a]);
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] l = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(Arrays.toString(l));
    }
    public static void task3 (){
        System.out.println("Задача 3");
        int[] l = {1, 2, 3, 4, 5, 6, 7};
        for (int i = l.length-1; i >= 0; i--){
            if (i ==l.length-7 ){
                System.out.print(l[i]);
            }else{
                System.out.print(l[i] + ",");
            }
        }
    }
    public static void task4 () {
        System.out.println("\nЗадача 4");
        int [] i = new int [3];
        i[0]=  1;
        i[1] = 2;
        i[2] = 3;
        for (int a = 0; a < i.length; a++ ) {
            if (a % 2!=0 ){
            }else{
                i[a]=i[a]+1;
            }
        }
        System.out.println(Arrays.toString(i));
    }
}