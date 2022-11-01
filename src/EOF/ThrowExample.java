package EOF;

import java.util.Scanner;

public class ThrowExample{
    public void checkChoice(int choice) throws NotFunnyException{
        if(choice ==1){
            throw new NotFunnyException();
        } else{
            System.out.println("저도 집에 가고싶습니다");
        }
    }
    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        Scanner scan = new Scanner(System.in);
        System.out.println("Java 스터디는 재미있습니까 (1 Yes/ 2 No) : ");
        int choice = scan.nextInt();;

        try { //직접 만든 예외(NotFunny)에 대해 직접 처리하는 것
            throwExample.checkChoice(choice);
        } catch(NotFunnyException e){
            System.out.println("진심을 담아 선택해주세요");
        }
    }
}

class NotFunnyException extends RuntimeException{ //직접 만든 예외
    NotFunnyException(){
        super("공부는 항상 재미없습니다.");
    }
}
