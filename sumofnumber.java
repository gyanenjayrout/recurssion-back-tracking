public class sumofnumber {
    public static int sum(int n) //pubic static void(int i,int n,int s)
    {
        // if(i==n)
        // {
       // sum += n;
       // System.out.println(sum);
   // }
        //sum=sum+i;
        //sum(i+1,n,s);
        }
        if(n==1) 
        {
            return 1;
        }
         return sum(n-1)+n;
            
        
        
    }
    public static void main(String args[])
    {
        //sum(1,5,o);
      int x=8;
      System.out.println(sum(x));
    }
 }
