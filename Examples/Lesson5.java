import java.io.*;

class SampleP2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("정수를 입력하십시오.") ;

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);
        if((res % 2) == 0)
            System.out.println(res + " 은 짝수입니다.");
        else
            System.out.println(res + " 은 홀수입니다.");
    }
}

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("2개의 정수를 입력하십시오.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt (str1);
        int num2 = Integer.parseInt (str2);

        if(num1 < num2){
            System.out.println(num1 + " 보다 " + num2 + " 가 큽니다.") ;
        }
        else if(num1 > num2){
            System.out.println(num2 + " 보다 " + num1 + " 가 큽니다.") ;
        }
        else{
            System.out.println ("두 수는 같은 값입니다.") ;
        }
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("0 에서 10 까지의 수를 입력하십시오.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);
        if(res >= 0 && res <= 10){
            System.out.println("정답입니다.") ;
        }
        else{
            System.out.println("틀렸습니다.") ;
        }
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("정수를 입력하십시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
                System.out.println("노력이 필요합니다.") ; break;
            case 2 :
                System.out.println("조금 더 노력합시다.") ; break;
            case 3 :
                System.out.println("더 높은 점수를 목표로 합시다.") ; break;
            case 4 :
                System.out.println ("참 잘했습니다.") ; break;
            case 5 :
                System.out.println ("매우 우수합니다.") ; break;
        }
    }
}
