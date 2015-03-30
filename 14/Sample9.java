import java.io.*;

class Sample9
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
            
            int[] test = new int[8];
            String str;
            
            for(int i=0; i<test.length; i++){
                str = br.readLine();
                test[i] = Integer.parseInt(str);
            }
            
            int max = test[0];
            int min = test[0];
            for(int i=0; i<test.length; i++){
                if(max < test[i])
                    max = test[i];
                if(min > test[i]) min = test[i];
                    System.out.println(test[i]);
            }
            
            System.out.println("최고 점수는 " + max + " 입니다.");
            System.out.println("최저 점수는 " + min + " 입니다.");
            
            br.close();
        }
        catch(IOException e){
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}
