                                                    +++++++ SWAP TWO NUMBERS +++++++
APPROACH 1:- Using temp variable-----------------------------------------------------------------------------------------
public class Main{
    static void swap(int m, int n){
        int temp=m;
        m=n;
        n=temp;
        System.out.println("m :" +m + " and n :" +n);
    }
    
    public static void main(String args[]){
        int m=9, n=4;
        swap(m,n);
    }
}

APPROACH 2:- Sum and Difference concept --------------------------------------------------------------------------------
public class Main{
    static void swap(int m, int n){
        m = m-n;
        n = m+n;
        m = n-m;
        System.out.println("m :" +m + " and n :" +n);
    }
    
    public static void main(String args[]){
        int m=9, n=4;
        swap(m,n);
    }
}

APPROACH 3:- Bitwise operator (XOR) -----------------------------------------------------------------------------------------
public class Main{
    static void swap(int m, int n){
        m = m^n;
        n = m^n;
        m = m^n;
        System.out.println("m :" +m + " and n :" +n);
    }
    
    public static void main(String args[]){
        int m=9, n=4;
        swap(m,n);
    }
}

APPROACH 4:- Arithmetic Operator -----------------------------------------------------------------------------------
public class Main{
    public static void main(String args[]){
        int m=9, n=4;
         m = (m+n)-(n=m);
         System.out.println("m : " +m + " and n : " +n);
    }
}
