package qqCommon;

import java.io.Serializable;

/**
 * 
 * @author sky
 *	
 *	��ʾ �ͻ��˺ͷ���� ͨ��ʱ����Ϣ����
 */
public class Message implements Serializable{
	// ��ǿ������
	private static final long serialVersionUID = 1L;
	
	private String sender; // ������
	private String getter; // ������ 
	private String content;// �������� 
	private String sendTime;// ����ʱ��
	private String messType;// ��Ϣ���� (���ڽӿڶ���ӿ�����)
	// 4.0 ���� ����˽�� һ���û�����߳�
	private String state;   // �û�״̬(����Ķ���: ���� Ⱥ�� ĳ����)
	
	/*  ��չ
	 *  ���ļ���ص� ����
	 */
	private byte[] fileBytes;
	private int fileLen = 0;
	private String fileName;   // �����ļ���
	
	private String destPath;   // �ļ���������·��
	private String srcPath;    // Դ�ļ�·��
	
	
	/* get set */
	public String getSender() {
		return sender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public byte[] getFileBytes() {
		return fileBytes;
	}
	public void setFileBytes(byte[] fileBytes) {
		this.fileBytes = fileBytes;
	}
	public int getFileLen() {
		return fileLen;
	}
	public void setFileLen(int fileLen) {
		this.fileLen = fileLen;
	}
	public String getDestPath() {
		return destPath;
	}
	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}
	public String getSrcPath() {
		return srcPath;
	}
	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getGetter() {
		return getter;
	}
	public void setGetter(String getter) {
		this.getter = getter;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getMessType() {
		return messType;
	}
	public void setMessType(String messType) {
		this.messType = messType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}