package chessServer;

import java.awt.Robot;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Random;

public class Send implements Runnable {
	private DatagramSocket ds;
	private String msg;
	private List list;
	private String ip;
	private Robot  r ; 
	public Send(String str,List list,String ip_get) throws SocketException
	{
		ds = new DatagramSocket();
		msg = str;
		this.list = list;
		ip = ip_get;
	}
	@Override
	public void run() {
		try {
			String[] text = msg.split("v");
			if(text.length==2)
			{
				byte[] buf = msg.getBytes();
				DatagramPacket  dp = new DatagramPacket(buf, buf.length, InetAddress.getByName(ip), 10001);
				ds.send(dp);
				System.out.println("send msg:"+msg);
			}
			else if(text.length==3)
			{
				if(text[2].equals("6"))
				{
				msg +="v"+text[0];
				byte[] buf = msg.getBytes();
				DatagramPacket  dp = new DatagramPacket(buf, buf.length, InetAddress.getByName(ip), 10001);
				ds.send(dp);
				System.out.println("send msg"+ip+":"+msg);
				}
				else
				{
					msg += "v"+String.valueOf((Integer.valueOf(text[0])+1)%4);
				}
				
			
				for(int i=0;i<list.n;i++)
				{
					if(!(list.strlist.get(i).equals(ip)))
					{
						byte[] buf = msg.getBytes();
						DatagramPacket  dp = new DatagramPacket(buf, buf.length, InetAddress.getByName(list.strlist.get(i)), 10001);
						ds.send(dp);
						System.out.println("send msg to "+list.strlist.get(i)+":"+msg);
					}
				}
			
				text = msg.split("v");
				if(Integer.valueOf(text[3])>=list.n)
				{
					
					int faction = Integer.valueOf(text[3]);
					for(int j = 0; j<=3-list.n; j++)
					{
						r =   new   Robot();
						int roll_num;
						do
						{
							roll_num = (int)(Math.random()*6+1)%6+1;
							if(roll_num==6)
							{
								msg = faction%4+"v"+(int)(Math.random()*3+1)+"v"+roll_num+"v"+(faction)%4;
							}
							else{
								msg = faction%4+"v"+(int)(Math.random()*3+1)+"v"+roll_num+"v"+(faction+1)%4;
							}
							for(int i=0;i<list.n;i++)
							{
									byte[] buf = msg.getBytes();
									DatagramPacket  dp = new DatagramPacket(buf, buf.length, InetAddress.getByName(list.strlist.get(i)), 10001);
									ds.send(dp);
									System.out.println("send msg to "+list.strlist.get(i)+":"+msg);
									
									r.delay(   3000   );
							}
						}while(roll_num==6);
						faction++;
						
					}
					
				}
			}
			
			ds.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
