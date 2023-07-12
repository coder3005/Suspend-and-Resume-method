/* suspend & resume method */
class A extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
            for(int i=1;i<=3;i++)
            {
                System.out.println(name);
            }      
    }
    public static void main(String[] args) {

        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Raj");
        t2.setName("Gill");
        t3.setName("Sen");

        t1.start();

        t2.start();
        t2.suspend(); //pause

        t3.start();

        t2.resume();  //restart        
    }
}
