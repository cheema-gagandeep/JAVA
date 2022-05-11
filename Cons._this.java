 class Cons_this{
Cons_this()
{
    System.out.println("Constructor is executed");
}
Cons_this(int a)
{
    this();
    System.out.println("Single parameter Constructor is executed");
    
}
public static void main(String[] arg)
{
    Cons_this o=new Cons_this(1);
}
    
}
