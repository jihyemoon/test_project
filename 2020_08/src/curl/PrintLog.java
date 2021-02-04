package curl;

import java.net.ServerSocket;
import java.net.Socket;

import org.apache.commons.io.IOUtils;

public class PrintLog {

	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(8080);
		
		Socket socket = null;
		
		if((socket = ss.accept()) != null) {
			IOUtils.copy(socket.getInputStream(), System.out);
		}
		
	}

}
