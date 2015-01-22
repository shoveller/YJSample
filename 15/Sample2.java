class Sample2
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1 호차");
        car1.start();
        Car car2 = new Car("2 호차");
        car2.start();
        for(int i=0; i<5; i++){
            System.out.println("main() 메소드 실행중입니다.");
        }
    }
}