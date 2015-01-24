import java.io.*;

class SampleP2
{
    public static void main(String[] args)
    {
        try{
            PrintWriter pw = new PrintWriter
                    (new BufferedWriter(new FileWriter("test1.txt")));


            pw.println("A long time ago,"); pw.println("There was a little girl.");

            pw.close();
        }
        catch (IOException e) {System.out.println ( "입출력 에러가 발생했습니다.") ;
        }
    }
}

class SampleP3
{
    public static void main(String[] args)
    {
        if(args.length != 1){
            System.out.println("올바른 파일 이름을 입력하십시오.") ; System.exit (1);
        }

        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[0])));
            pw.println("A long time ago,");
            pw.println("There was a little girl.");

            pw.close();
        }
        catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.") ;
        }
    }
}