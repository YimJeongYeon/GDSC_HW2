package EOF;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int result;

        try{
            result =A/B;
            System.out.println(result);
        }
        catch (Exception e){ //ArithmeticException
            System.out.println("0으로 나눌 수 없습니다."); //B에 0을 넣으면
        }
        finally{
            System.out.println("정말 재미있는 Java 스터디!"); //예외랑은 상관 없이 무조건 출력되는 줄
        }
    }
}
