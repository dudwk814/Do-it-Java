package chapter10.scheduler;

public class PriorityAllocation implements Scheduler{

	//�� ����� ���� ���� ��ȭ���� ��⿭���� ������ ���� �ɷ��� ���� ���� �켱 ���
	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
	}
	
}
