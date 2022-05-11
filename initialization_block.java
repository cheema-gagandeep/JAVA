public class initialization_block {
    static int num[]= new int[5];
    //Instance initialization block
    {
System.out.println("Intialization block is executed");
for (int i=0;i<num.length;i++)
{
    num[i]=(int)(15*Math.random());
}
    } 
    //Dispaly method
    void display()
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.println(" "+num[i]);
        }
    }
    
}
class InstanceIntial
{
    public static void main(String[] args)
    {
        initialization_block obj1=new initialization_block();
        System.out.println("\n for first object values are....");
        obj1.display();

        initialization_block obj2=new initialization_block();
        System.out.println("\n for Second object values are....");
        obj2.display();
        
    }
}

