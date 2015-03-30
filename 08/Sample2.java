// 자동차 클래스
class Car
{
    int num;
    double gas;
    
    void show ()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
}

class Sample2
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car ();
        
        car1.num = 1234;
        car1.gas = 20.5;
        
        car1.show();
        car1.show();
    }
}
