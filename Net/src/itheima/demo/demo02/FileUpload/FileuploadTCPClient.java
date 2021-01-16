package itheima.demo.demo02.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileuploadTCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\untitled\\IOAndProperties\\1.jpg");
        Socket socket = new Socket("192.168.1.103",8888);
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len=0;
        System.out.println("333333333");
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        System.out.println("444444");
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        System.out.println("555555555555");

        os.close();
        fis.close();
        socket.close();


    }
}
