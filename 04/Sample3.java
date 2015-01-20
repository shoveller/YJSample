import java.io.*;

class Sample3 {
    public static void main(String[] args) throws IOException
    {
        System.out.println( "정수를 2개 입력하십시오.");
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        System.out.println( "덧셈의 결과는"+ (num1 + num2) + "입니다.");
    }
}