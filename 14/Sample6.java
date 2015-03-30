import java.io.*;

class Sample6
{
    public static void main(String[] args)
    {
        System.out.println("문자열을 입력하십시오.");
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str = br.readLine();
            System.out.println (str + "(이)가 입력되었습니다.");
        }
        catch(IOException e){
            System.out.println ( "입출력 에러가 발생했습니다.");
        }
    }
}
