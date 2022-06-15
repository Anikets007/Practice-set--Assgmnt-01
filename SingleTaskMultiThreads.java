// Performing Single task from multiple threads

package Multi_threading;

public class SingleTaskMultiThreads extends Thread
{
    public void run()
    {
        System.out.println("Performing Single task from multiple Treads");
}
}
class Tesst
{
    public static void main(String[] args) //Main Thread
    {
        SingleTaskMultiThreads s1=new SingleTaskMultiThreads();
        s1.start();

        SingleTaskMultiThreads s2=new SingleTaskMultiThreads();
        s2.start();

        SingleTaskMultiThreads s3=new SingleTaskMultiThreads();
        s3.start();
    }
}
