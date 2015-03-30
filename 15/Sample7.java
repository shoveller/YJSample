//회사 클래스
class Company
{
    private int sum = 0;
    public synchronized void add(int a)
    {
        int tmp = sum;
        System.out.println ("현재 금액의 합은 "+ tmp + " 원 입니다.");
        System.out.println (a + " 원 벌었습니다.");
        tmp = tmp + a;
        System.out.println ("금액의 합을 "+ tmp + " 원으로 만듭니다.");
        sum = tmp;
    }
}
// 운전 기사 클래스
class Driver extends Thread
{
    private Company comp;
    
    public Driver(Company c)
    {
        comp = c;
    }
    public void run()
    {
        for(int i=0; i<3; i++){
            comp.add(50);
        }
    }
}
class Sample7
{
    public static void main(String[] args)
    {
        Company cmp = new Company();
        
        Driver drv1 = new Driver(cmp);
        drv1.start();
        
        Driver drv2 = new Driver(cmp);
        drv2.start();
    }
}
