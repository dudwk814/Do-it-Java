package chapter10.scheduler;

public class AgentGetCall implements Scheduler{

	//���� �� ���� ���ư��� �����ϰ� ��� ���� ���
	@Override
	public void getNextCall() {
		System.out.println("������ ���� ��ȭ ��û");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ ��ȭ ����� ���������ϴ�.");
	}
	
}