package Admin.Data;

import AdminLogin.Member;

public interface IBobMembershipManage {
	//ȸ�� ���� �� ���� ������ DB�� ����
	public boolean BobMembershipProc(Member member);
	//ID�� PW�� ���� ����
	public int DelProc(String BobNum);
}
