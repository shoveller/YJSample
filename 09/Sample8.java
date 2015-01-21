// 자동차 클래스
class Car
{
    public static int sum = 0;
    private int num;
    private double gas;
    public Car ()
    {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("자동차가 만들어졌습니다.");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + " 으로, 연료 양을 " + gas + " 로 바꾸었습니다.");
    }
    public static void showSum ()
    {
        System.out.println ( "자동차는 모두 "+ sum + " 대 있습니다.");
    }
    public void show()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
}
class Sample8
{
    public static void main(String[] args)
    {
        Car.showSum();
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        Car.showSum();
        Car car2 = new Car();
        car2.setCar(4567, 30.5);
        Car.showSum();
    }
}