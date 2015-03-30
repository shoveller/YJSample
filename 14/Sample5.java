class CarException extends Exception
{
}

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
    public void setCar (int n, double g) throws CarException
    {
        if(g < 0){
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("차량 번호를 " + num + " 으로, 연료 양을 " + gas + " 로 바꾸었습니다.");
        }
    }
    public void show()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
}
/*
class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        try{
            car1.setCar(1234, -10.0);
        }
        catch(CarException e){
            System.out.println (e + "(이)가 던져졌습니다.");
        }
        car1.show();
    }
}
*/
class Sample5
{
    public static void main(String[] args) throws CarException
    {
        Car car1 = new Car();
        car1.setCar(1234, -10.0);
        car1.show();
    }
}
