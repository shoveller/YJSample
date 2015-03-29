import java.io.*;

class Sample5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("정수를 입력하십시오.");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        int num = Integer.parseInt(str);
        
        System.out.println(num + "(이)가 입력되었습니다.");
    }
}
