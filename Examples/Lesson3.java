import java.io.*;

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("당신은 몇 살입니까?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.println("당신은 " + num + " 살 입니다.");
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("원주율의 값은 얼마입니까?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double pi = Double.parseDouble(str);

        System.out.println("원주율의 값은 " + pi + " 입니다.");
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("키와 몸무게를 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
	String str2 = br.readLine();
        double num1 = Double.parseDouble(str1);      
	double num2 = Double.parseDouble(str2);

        System.out.println ("키는 "+ num1 + " 센티미터 입니다.");
	System.out.println ("몸무게는 "+ num2 + " 킬로그램 입니다.");
    }
}

