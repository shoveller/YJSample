import java.io.*;

class Sample2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("시험 응시자 수를 입력하십시오.");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int num = Integer.parseInt(str);
        
        int [] test;
        test = new int[num];
        
        System.out.println("시험 응시자 수 만큼 점수를 입력하십시오.");
        
        for(int i=0; i<num; i++){
            str = br.readLine();
            int tmp = Integer.parseInt(str);
            test[i] = tmp;
        }
        
        for(int i=0; i<num; i++){
            System.out.println((i + 1) + "번째 사람의 점수는 "+ test[i] + "입니다.");
        }
    }
}
