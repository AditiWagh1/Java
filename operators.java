public class operators {
    public static void main(String[] args)
    {
        int a=10,b=3;
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        /*System.out.println("Sum:"+sum);
        System.out.println("difference:"+diff);
        System.out.println("Multiplication:"+mul);
        System.out.println("Modulus"+mod);
        System.out.println("Postincrement:"+(a++));
        System.out.println("Preincrement:"+(++a));
        System.out.println("Postdecrement:"+(b--));
        System.out.println("Predecrement:"+(--b));*/
        int n=10;
        n+=5; //assigment operator
        int c=5;
        System.out.println("a>b:"+(a>b)); //logical operator
        System.out.println("a<b:"+(a<b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a==c:"+(a==c));
        System.out.println("a!=c"+(a!=c));
        boolean x=true;
        boolean y=false;
        System.out.println("x && y:"+(x && y));
        System.out.println("x || y:"+(x || y));
        System.out.println("!x:"+(!x));
        int result=((a>b)?(a>c)? a:c:(b>c)?b:c);
        System.out.println("Max of 3 nos= "+ result);
        String str="Hello";
        System.out.println(str instanceof String);
        Object obj = new Integer(10);
        System.out.println(obj instanceof String);
    }
}
