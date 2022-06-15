package Multi_threading;

public class Testt implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread Task using Runnable Interface");
    }

    public static void main(String[] args)
    {
    Testt t=new Testt();
    Thread th=new Thread(t);
    th.start();
    }
}
