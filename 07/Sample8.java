class Sample8
{
    public static void main(String[] args)
    {
        int [] test = {80,60,22,50,75};
        
        for(int i=0; i<test.length; i++){
            System.out.println ((i + 1) + "번째 사람의 점수는 " + test [i] + "입니다.");
        }
        System.out.println ( "시험의 응시자 수는 " + test.length + "명 입니다.");
    }
}
