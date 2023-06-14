package qqCommon;

/**
 * 
 * @author sky
 *	
 *	��ʾ��Ϣ���� �Ľӿ�
 */

public interface MessageType {
	/*
	 *  �ڽӿ��ж��峣��
	 *  ��ͬ������ֵ��ʾ��ͬ����Ϣ����
	 */
	String MESSAGE_LOGIN_SUCCEED = "1";      // ��ʾ��¼�ɹ�
	String MESSAGE_LOGIN_FAIL = "2";         // ��ʾ��¼ʧ��
	String MESSAGE_COMM_MES = "3";           // ��ͨ��Ϣ��
	String MESSAGE_GET_ONLINE_FRIEND = "4";  // �ͻ������󷵻�������Ϣ�б�
	String MESSAGE_RET_ONLINE_FRIEND = "5";  // ����� ���������û��б�
	String MESSAGE_CLIENT_EXIT = "6";        // �ͻ��������˳�
	String MESSAGE_ToAll_MES = "7";          // �ͻ��� Ⱥ����Ϣ
	String MESSAGE_File_MES = "8";           // �ͻ��� �����ļ�
	String MESSAGE_REGIST_REQUEST = "9";      // �ͻ��� ����ע���˻�
	String MESSAGE_REGIST_SUCCEED = "10";    // ��ʾע��ɹ�
	String MESSAGE_REGIST_FAIL = "11";       // ��ʾע��ʧ��
	String MESSAGE_File_MES_TOALL = "12";    // �ͻ��� Ⱥ���ļ�
}