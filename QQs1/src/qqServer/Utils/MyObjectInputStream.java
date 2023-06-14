package qqServer.Utils;

import java.io.IOException; 
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

/**
 * @author sky
 * @version 4.0
 * 	 ¶¨Òå¶ÔÏóÊäÈëÁ÷
 */
public class MyObjectInputStream extends ObjectInputStream{

	public MyObjectInputStream(InputStream in) throws IOException {
		super(in);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void readStreamHeader() throws IOException, StreamCorruptedException {
		// TODO Auto-generated method stub
		
	}

	
}