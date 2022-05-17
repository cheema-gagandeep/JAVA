public class derived_class extends Abstract_class
{
    void bike()
    {
        System.out.println("Here is abstract method inherited from base class");
    }

    public static void main(String [] arg)
    {
        derived_class o=new derived_class();
        o.bike();
    }
}
