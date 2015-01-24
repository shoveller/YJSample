class Car
{
    protected int num;
    protected double gas;
    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.") ;
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + " 으로, 연료 양을 " + gas + " 으로 바꾸었습니다.") ;
    }
    public String toString()
    {
        String str = "차량 번호가 " + num + " 이고, 연료 양이 " + gas + " 인 자동차";
        return str;
    }
}

class SampleP4
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        System.out.println(car1 + " 입니다.") ;
    }
}