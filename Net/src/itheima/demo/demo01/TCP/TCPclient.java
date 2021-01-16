package itheima.demo.demo01.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPclient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.103",8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is = socket.getInputStream();
        //is.read();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();

    }
}
