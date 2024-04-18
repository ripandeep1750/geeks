 +++++++++++++++++++++++++++++++++ Check If the number is even or odd ++++++++++++++++++++++++++++++++++++++++
APPROACH 1:- Brute Force- Naive Approach
import java.util.*;
public class Main{
    public static void main(String args[]){
    int n = 25;
    if(n%2==0){
        System.out.println("Even number.");
    }
    else
    {
        System.out.println("Odd number.");
    }
    }
}
--------------------------------------------------------------------------------------------------------------
APPROACH 2:- Using bitwise operators
# 2-A: Using Bitwise OR
import java.util.*;
public class Main{
    public static void main(String args[]){
    int n = 25;
    if((n | 1)>n){
        System.out.println("Even number.");
    }
    else
    {
        System.out.println("Odd number.");
    }
    }
}
-----------------------------------------------------------------------------------------------------------
# 2-B: Using Bitwise AND
public class Main{
    public static void main(String args[]){
        int n=24;
        if((n&1)==1)
        System.out.println("Odd Number");
        else
        System.out.println("Even Number");
    }
}
---------------------------------------------------------------------------------------------------------
# 2-C: Using Bitwise XOR
public class Main{
    public static void main(String args[]){
        int n=24;
        if((n^1)==n+1)
        System.out.println("Even Number");
        else
        System.out.println("Odd Number");
    }
}
-----------------------------------------------------------------------------------------------------
APPROACH 3:- Checking the LSB of the Number

import java.util.*;
public class GFG {
	public static String check(int a)
	{
		if (a != 0) {
			if (Integer.toBinaryString(a).endsWith("0")) {
				return "Even";
			}
			else {
				return "Odd";
			}
		}
		else {
			return "Zero";
		}
	}

	public static void main(String[] args)
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println(
				i + " : " + check(i));
		}
	}
}
