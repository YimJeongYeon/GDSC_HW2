package EOF;

import java.util.ArrayList;

public class RunnableExample implements Runnable{
    private int order;

    public RunnableExample(int order) {this.order = order;}

   @Override //컨트롤 우클릭으로 내용을 확인 할 수 있음
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
            Thread thread = new RunnableExample(i);
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

}
