import java.io.*;

class Sample6
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("a 혹은 b를 입력하십시오.");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        char res = str.charAt(0);
        
        switch(res){
            case 'a':
                System.out.println("a 가 입력되었습니다.");
                break;
            case 'b':
                System.out.println("b 가 입력되었습니다.");
                break;
            default:
                System.out.println("a 혹은 b를 입력하십시오.");
                break;
        }
    }
}
