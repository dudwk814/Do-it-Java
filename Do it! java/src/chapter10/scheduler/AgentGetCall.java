package chapter10.scheduler;

public class AgentGetCall implements Scheduler{

	//상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화 요청");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
	}
	
}
