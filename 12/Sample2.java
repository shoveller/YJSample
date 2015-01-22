class Sample2 {
    public static void main(String[] args) {
        Vehicle[] vc;
        vc = new Vehicle[2];
        vc[0] = new Car(1234, 20.5);
        vc[1] = new Plane(232);
        for (int i = 0; i < vc.length; i++) {
            if (vc[i] instanceof Car)
                System.out.println((i + 1) + " 번째 객체는 Car 클래스 입니다.");
            else
                System.out.println((i + 1) + " 번째 객체는 Car 클래스가 아닙니다.");
        }
    }
}
