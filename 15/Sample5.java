class Car extends Thread
{
    private String name;
    
    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++){
            System.out.println(name + " 가 동작하고 있습니다.");
        }
    }
}
class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1 호차");
        car1.start();
        
        try{
            car1.join();
        }
        catch(InterruptedException  e){}
        
        System.out.println("main() 의 실행을 종료합니다.");
    }
}
