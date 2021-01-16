package itheima.demo.demo03.FileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileuploadTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\TCPServer.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        System.out.println("11111");
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);

        }
        System.out.println("222222");
        OutputStream os = socket.getOutputStream();
        os.write("接收完毕".getBytes());
        //os.close();
        fos.close();
        socket.close();
        server.close();
    }
}
