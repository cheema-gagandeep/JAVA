public class static_field {
    static int a=10;
    public static void main(String [] arg)
    {
        static_field o= new static_field();
        static_field o1= new static_field();
        o.a=5;
        o1.a=8;
        System.out.println(o.a);
        /* 
        In certain situations,it may be required to 
        share a common copy of fields among all the objects
         of the same class
        */
    }
    
}
