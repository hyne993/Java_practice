package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		// Animal Ÿ���� ��ü�迭 ũ�⸦ 5�� �����Ͽ� 
		// �� �ε����� �������� Dog, Cat ��ü�� �����ϱ� - �Ű����� ������ �̿�
		Animal[] arr = new Animal[5];
		arr[0] = new Dog("�۸���", "���޶�Ͼ�", 2);
		arr[1] = new Cat("�߿���", "�Ƹ޸�ī��Ʈ���", "������", "����" );
		arr[2] = new Dog("������", "��ī���ĴϿ�", 10);
		arr[3] = new Dog("�տ���", "ġ�Ϳ�", 3);
		arr[4] = new Cat("�Ŀ���", "����Ƽ������", "��������", "ȸ��");
		
		// �ݺ������� �� �ε����� ��ü�� speak() �޼ҵ� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i].speak();
		}
	}

}
