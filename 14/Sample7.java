import java.io.*;

class Sample7
{
    public static void main(String[] args)
    {
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
            
            pw.println("Hello!");
            pw.println("GoodBye!");
            System.out.println("파일에 기록되었습니다.");
            
            pw.close();
        }
        catch(IOException e){
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}
