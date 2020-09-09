package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите кол-во элементов массива:");
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	ArrayList <Integer> arrayList = new ArrayList<>();
	for (int i=0; i<a; ++i){
        arrayList.add((int)(Math.random()*100));
        System.out.print(arrayList.get(i)+" ");
    }
	System.out.println();
	int sum=0, i;
	for (i=0; i<a; ++i){
	    sum+= arrayList.get(i);
    }
	System.out.println("Сумма чисел массива с помощью цикла for: "+sum);
	i=0;
	sum=0;
	while (i<a){
	    sum+=arrayList.get(i);
	    ++i;
    }
	System.out.println("Сумма чисел массива с помощью цикла while: "sum);
	sum =0;
	i=0;
	do {
	    sum+=arrayList.get(i);
	    ++i;
    }while (i<a);
	System.out.println("Сумма чисел массива с помощью цикла do while: "+sum);
    }
}
