package qqCommon;

import java.io.Serializable;

/**
 * 
 * @author sky
 * 
 *	��ʾһ�� �û�/�ͻ���Ϣ
 *
 *	ʹ�ö����� ���д���
 */

public class User implements Serializable{
	// ��ǿ������
	private static final long serialVersionUID = 1L;
	
	private String userId;  // �û��˺�
	private String password;  // ����
	private String registMessageType;  // �����Ƿ�����ע��
	
	private String state = null;    // 4.0 ���÷���״̬

	public User() { }
	
	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	
	/* get set */
	public String getRegistMessageType() {
		return registMessageType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setRegistMessageType(String registMessageType) {
		this.registMessageType = registMessageType;
	}
	
	public String getPassword() {
		return password;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassward(String password) {
		this.password = password;
	}

}