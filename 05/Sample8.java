import java.io.*;

class Sample8
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("몇 번째 코스를 선택 하시겠습니까?");
        System.out.println("정수를 입력하십시오.");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int res = Integer.parseInt(str);
        
        char ans = (res == 1)? 'A': 'B';
        
        System.out.println(ans + " 코스를 선택했습니다.");
    }
}
