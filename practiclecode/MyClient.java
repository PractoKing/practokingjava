package practiclecode;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 6666);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("hi");
		dout.flush();
		dout.close();
		s.close();
		
		

	}

}
