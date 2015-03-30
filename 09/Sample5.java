//자동차 클래스
class Car
{
    private int num;
    private double gas;
    
    public Car ()
    {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호가 " + num + " 이며, 연료 양이 " + gas + " 인 자동차가 만들어졌습니다.");
    }
    public void show()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
}

class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();
        
        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}
