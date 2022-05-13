public class Ref_variable1{
    int a,b;
    Ref_variable1()
    {
        a=10;
        b=6;
    }
    int area()
    {
        int area=a*b;
        return area;
    }

    public static void main(String [] arg)
    {
        Ref_variable1 obj1=new Ref_variable1();
        Ref_variable1 obj2;
        obj2=obj1;
        System.out.println(obj2.area());
    }
    
}
