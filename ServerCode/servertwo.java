package chessServer;

import java.awt.Robot;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;

import chessServer.Send;

public class servertwo {
	public static void main(String[] args) throws IOException
	{
		//DatagramSocket send = new DatagramSocket();
		DatagramSocket rece = new DatagramSocket(10001);
		List list = new List();
		try {
			Robot r =   new   Robot();
			while(true)
			{
				//�������ݰ�
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				
				//ʹ�ý��շ��������ݴ洢�����ݰ���
				rece.receive(dp);//����ʽ
				
				//ͨ�����ݰ�����ķ������������е����ݣ����磺��ַ���˿ڣ��ı�
				String ip = dp.getAddress().getHostAddress();
				int  port = dp.getPort();
				String text = new String(dp.getData(),0,dp.getLength());
				if(list.ishave(ip))
				{
					if(text.equals("hello"))
					{
						text = String.valueOf(list.n)+"v"+"0";
					}
					System.out.println("get hello");
					list.strlist.add(ip);
					list.n++;
					
				}
				
				Send s =new Send(text,list,ip);
				r.delay(1500);
				new Thread(s).start();
				System.out.println(ip+":"+":"+text);
					
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
}



