package chessServer;

import java.util.ArrayList;

public class List {
	ArrayList<String> strlist;
	int n=0;
	List()
	{
		strlist = new ArrayList<String>();
	}
	boolean ishave(String str)
	{
		for(int i=0;i<n;i++)
		{
			if(strlist.get(i).equals(str))
			{
				return false;
			}
		}
		return true;
	}
}
