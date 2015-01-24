import java.io.*;

class SampleP2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("문자열을 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();

        System.out.println(str1 + " 를 뒤집으면 " + str2 + " 입니다.") ;
    }
}

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("문자열을 입력하십시오.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("a가 들어갈 위치를 정수로 입력하십시오.") ;
        String str2 = br.readLine();
        int num = Integer.parseInt(str2);

        StringBuffer str3 = new StringBuffer(str1);
        str3.insert(num, 'a');

        System.out.println(str3 + " 이 되었습니다.") ;
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println ( "정수를 2개 입력하십시오.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine(); String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt (str2);
        int ans = Math.min(num1, num2);

        System.out.println(num1 + " 와(과) " + num2 + " 중 작은 쪽은 " + ans + " 입니다.") ;
    }
}
