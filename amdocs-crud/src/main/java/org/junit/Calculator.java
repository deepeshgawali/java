package org.junit;

public class Calculator {
public int add (int a, int b) {
	int c=a+b;
	System.out.print(c);
	return c;
}
public int sub(int a,int b) {
	int c=a-b;
	System.out.print(c);
	return c;
}
public int mul(int a,int b) {
	int c=a*b;
	System.out.print(c);
	return c;
}
public int div(int a,int b) {
	int c=a/b;
	System.out.print(c);
	return c;
}
public static int findMax(int arr[]){  
    int max=arr[0];//arr[0] instead of 0  
    for(int i=1;i<arr.length;i++){  
        if(max<arr[i])  
            max=arr[i];  
    }  
    return max;  
}  
}
