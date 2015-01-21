import java.io.*;

class Sample2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("영문자를 입력하십시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String stru = str.toUpperCase();
        String strl = str.toLowerCase();
        System.out.println ("대문자로 변환하면 "+ stru + " 입니다.");
        System.out.println("소문자로 변환하면 "+ strl + " 입니다.");
    }
}