import java.io.*;

class Sample3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println ( "몇 개의 *를 출력 하시겠습니까?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        for (int i = 1; i <= num; i ++){
            System.out.println ("*");
        }
    }
}