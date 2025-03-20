package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numArray = new ArrayList<Integer>();
        //Add array list
        addArray(numArray);
        addTwoValors(numArray);
        setTwoValors(numArray);
        printIndice2000(numArray);


    }

    //a
    public static void addArray(ArrayList numArray) {
        //1: Crea un array list

        for (int i = 10; i <= 60; i = i + 10) {
            numArray.add(i);
        }
        System.out.println("1\n");
        System.out.println(numArray);
    }
    //b

    public static void addTwoValors(ArrayList numArray) {
        numArray.add(1, 1000);
        numArray.add(3, 2000);
        System.out.println("2 \n");
        System.out.println(numArray);
    }
    //c

    public static void setTwoValors(ArrayList numArray) {
        numArray.set(0, 5000);
        numArray.set(2, 10000);
        System.out.println("2 \n");
        System.out.println(numArray);
    }

    //d
    public static void printIndice2000(ArrayList numArray) {
        System.out.println("D");
        for (int i = 0; i <= numArray.size(); i = i + 10) {

            System.out.println(numArray.get(i));

        }
    }
}


