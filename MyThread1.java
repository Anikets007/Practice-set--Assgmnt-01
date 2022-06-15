package Multi_threading;


class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("Task One Playing video is Executing....");
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Task Two Playing Audio is Executing....");
    }
}

class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println("Task Three Progress Bar is Executing....");
    }
}

class MyThread4 extends Thread
{
    public void run()
    {
        System.out.println("Task Four Timer is Executing....");
    }
}

class Test1
{
    public static void main(String[] args)
    {
        MyThread1 t1=new MyThread1();
        t1.start();

        MyThread2 t2=new MyThread2();
        t2.start();

        MyThread3 t3=new MyThread3();
        t3.start();

        MyThread4 t4=new MyThread4();
        t4.start();
    }
}