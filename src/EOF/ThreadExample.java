package EOF;

import java.util.ArrayList;

public class ThreadExample extends Thread{ //가장 중요 스레드는 상속을 받아야 함, 상속받으면 run을 생성해야함
    private int order;

    public ThreadExample(int order){this.order = order; }
    public void run(){
        System.out.println(this.order + "번쩨 스레드 시작합니다.");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
        }
        System.out.println(this.order + "번째 스레드 종료합니다.");
    }

    public static void main(String[] args){
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i =1; i<=10; i++){
            Thread thread = new ThreadExample(i);
            thread.start();
            threadList.add(thread);
        }
        for (int i=0; i<threadList.size(); i++){
            Thread thread = threadList.get(i);
            try{
                thread.join(); //join 메소드
            } catch (Exception e){}
        }
        System.out.println("main 메소드 종료합니다.");
    }
}
