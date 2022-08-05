public class MyClass {
    
    public static void main(String args[]) {
        int x= 5;
        int y = pow(x);
     

      System.out.println(+y);
    }
     static int pow(int n)
    {
        if (n==0)
        return 1;
          int recres = pow(n-1);
        int res = 2*pow(n-1);
        return res;
    }
}
