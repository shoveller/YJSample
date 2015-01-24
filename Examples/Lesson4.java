import java.io.*;

class SampleP2
{
    public static void main(String[] args)
    {
        int ans1 = 0-4;
        double ans2 = 3.14*2;
        double ans3 = (double)5/3;
        int ans4 = 30%7;
        double ans5 = (7+32)/(double)5;

        System.out.println("0-4 는 " + ans1 + " 입니다.");
        System.out.println("3.14×2 는 " + ans2 + " 입니다.");
        System.out.println("5÷3 는 " + ans3 + " 입니다.");
        System.out.println("30÷7 의 나머지 값은 " + ans4 + " 입니다.");
        System.out.println("(7+32)÷5 은 " + ans5 + " 입니다.") ;
    }
}

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("정사각형의 한 변의 길이를 입력하십시오.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int width = Integer.parseInt(str);

        System.out.println("사각형의 면적은 " + (width * width) + "입니다.") ;
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("삼각형의 밑변과 높이를 입력하십시오.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int height = Integer.parseInt(str1);
        int width = Integer.parseInt(str2);

        System.out.println("삼각형의 면적은 " + ((height * width)  / (double) 2) + "입니다.");
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("과목 1~5의 점수를 정수로 입력하십시오.") ;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);
        sum += Integer.parseInt(str4);
        sum += Integer.parseInt(str5);

        System.out.println("5개 과목의 총점은 " + sum + " 점 입니다.");
        System.out.println ("5개 과목의 평균점은 " + (sum / (double) 5) + " 점 입니다.") ;
    }
}

