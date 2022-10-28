package com.java8.colg.exp_10.Main.P1;

class A extends Thread {
    public void run()
    {
        int[] arr1 = {1,3,5,7,9};
        for(int i=0; i<5; i++)
        {
            System.out.println(arr1[i]);
            try
            {
                sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

package com.java8.colg.exp_10.Main.P2;

class B extends Thread {
    public void run()
    {
        int[] arr2 = {2,4,6,8,10};
        for(int i=0; i<5; i++)
        {
            System.out.println(arr2[i]);
            try
            {
                sleep(1200);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

package com.java8.colg.exp_10.Main;
        import com.java8.colg.exp_10.Main.P1.A;
        import com.java8.colg.exp_10.Main.P2.B;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.start();
        b1.start();
    }
}