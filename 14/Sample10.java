import java.io.*;

class Sample10
{
    public static void main(String[] args)
    {
        if (args.length != 1){
            System.out.println("올바른 파일 이름을 입력하십시오.");
            System.exit (1);
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}