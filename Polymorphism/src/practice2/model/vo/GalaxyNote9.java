package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	// �����ں�
	public GalaxyNote9() {
		
	}
	
	// �޼ҵ��
	@Override
	public void makeaCall() {
		System.out.println("��ȣ�� ������ ��ȭ��ư�� ����");
	}
	
	@Override
	public void takeaCall() {
		System.out.println("���� ��ư�� ����");
	}
	
	@Override
	public void picture() {
		System.out.println("1200�� ��� ī�޶�");
	}
	
	@Override
	public void charge() {
		System.out.println("��� ����, ��� ���� ����");
	}
	
	@Override
	public void touch() {
		System.out.println("������, ������ ����");
	}
	
	@Override
	public void printMaker() {
		System.out.println("������ ��Ʈ 9�� �Ｚ���� ����� ����.");
	}
	
	
	
}
