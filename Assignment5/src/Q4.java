class myclass {
    static int a = 20;
    myclass() {
        a++;
    }
    void m1() {
        a++;
        System.out.println(a);
    }
    public static void main(String[]
                                    args)
    {
        myclass obj = new myclass();
        myclass obj2 = new myclass();
        myclass obj3 = new myclass();
        obj3.m1();
    }
}

public class Q4{
    public static void main(String[] args) {
        System.out.println("From the current code, we receive the following errors:");
        System.out.println("Error at line 8: java: ';' expected");
        System.out.println("Upon correcting Void to void in line 6 and substituted the : with a ; in line 8, the result is: ");
    }
}