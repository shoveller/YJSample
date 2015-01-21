// 자동차 클래스
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
    public void show()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
}

class Sample4
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();
    }
}