package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		// Animal 타입의 객체배열 크기를 5로 생성하여 
		// 각 인덱스에 무작위로 Dog, Cat 객체를 생성하기 - 매개변수 생성자 이용
		Animal[] arr = new Animal[5];
		arr[0] = new Dog("멍멍이", "포메라니안", 2);
		arr[1] = new Cat("야옹이", "아메리카쇼트헤어", "마포구", "갈색" );
		arr[2] = new Dog("뭉뭉이", "코카스파니엘", 10);
		arr[3] = new Dog("왕왕이", "치와와", 3);
		arr[4] = new Cat("냐옹이", "스코티시폴드", "영등포구", "회색");
		
		// 반복문으로 각 인덱스별 객체의 speak() 메소드 실행
		for(int i = 0; i < arr.length; i++) {
			arr[i].speak();
		}
	}

}
