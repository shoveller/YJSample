import java.io.*;

class Sample5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("정수를 입력하십시오.");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int res = Integer.parseInt(str);
        
        switch(res){
            case 1:
                System.out.println("1이 입력되었습니다.");
                break;
            case 2 :
                System.out.println("2가 입력되었습니다.");
                break;
            default :
                System.out.println("1 혹은 2를 입력하십시오.");
                break;
        }
    }
}
