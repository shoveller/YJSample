import java.io.*;

class Sample8
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
            String str1 = br.readLine();
            String str2 = br.readLine();
            System.out.println("파일에 기록된 2개의 문자열은 ");
            System.out.println( str1 + " 입니다.");
            System.out.println( str2 + " 입니다.");
            br.close();
        }
        catch(IOException e){
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}