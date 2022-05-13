class TypeOfVariable
{
    static int a=100;//Static variable
    void a()
    {
        int m;//Local Variable
        m=10;
        System.out.print(m);
    }
    public static void main(String[] arg)
    {
    int b;//Instance Variable
    b=5;
    System.out.print(b);
    }
}