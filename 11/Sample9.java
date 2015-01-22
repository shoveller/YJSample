// 자동차 클래스
class Car
{
    protected int num;
    protected double gas;
    public Car ()
    {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }
}
// 레이싱 카 클래스
class RacingCar extends Car
{
    private int course;
    public RacingCar()
    {
        course = 0;
        System.out.println("레이싱 카가 만들어졌습니다.");
    }
}
class Sample9
{
    public static void main(String[] args)
    {
        Car[] cars;
        cars = new Car[2];
        cars[0] = new Car();
        cars[1] = new RacingCar();
        for(int i=0; i<cars.length; i++){
            Class cl = cars[i].getClass();
            System.out.println ((i + 1) + "번째 객체의 클래스는 " + cl + " 입니다.");
        }
    }
}