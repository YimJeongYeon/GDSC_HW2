package EOF;

import java.util.Scanner;

public class ScannerEOF {
    public static void main(String[] args){
        //Scanner
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        } //Ctrl + D 로 끝냄
        System.out.println("Scanner EOF");
    }
}
