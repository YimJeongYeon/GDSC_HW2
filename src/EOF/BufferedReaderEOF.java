package EOF;

import java.io.*;

public class BufferedReaderEOF {
    public static void main(String[] args) throws IOException {
        //BufferedReader & BufferedWriter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "" ;
        while((str = br.readLine())  !=null){
            bw.write(str+"\n"); //여기서는 쓰기만 함 버퍼에 쌓아뒀다가 마지막에 flush로 한방에 출력
        } //역시나 ctrl + D 로 종료
        bw.write("BufferedReader EOF");
        bw.flush(); //여기서 출력됨
        bw.close();
        br.close();
    }
}
