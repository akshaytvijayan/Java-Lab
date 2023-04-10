class Cpu
{
int price=45000;
    class Processor
{
    int noofCores=5;
    String manufacturer="intel corp";
    void display()
{
    System.out.println("no of cores:"+noofCores);
    System.out.println("manufacturer:"+manufacturer);
    }
    }
    void display()
{
    Processor p=new Processor();
    p.display();
    System.out.println("price:"+price);
    }
    static class Ram
{
    int memory=8;
    String manufacturer="corsair";
    void display(){
    System.out.println("memory:"+memory);
    System.out.println("manufacturer:"+manufacturer);
    }
    }
    }
    class Cpus
{
    public static void main(String[]Args)
{
    Cpu c1=new Cpu();
    c1.display ();
    Cpu.Ram r1=new Cpu.Ram();
    r1.display ();
    }
    }
