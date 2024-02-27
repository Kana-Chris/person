package personjp.co.diworks.action;

public class Test {
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name ="山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "taro@abc.jp";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person kimura = new Person();
		kimura.name = "木村次郎";
		kimura.age = 18;
		kimura.phoneNumber = "000-0000-0000";
		kimura.address = "kimura@abc.jp";
		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.phoneNumber);
		System.out.println(kimura.address);
		kimura.talk();
		kimura.walk();
		kimura.run();
		
		Person suzuki = new Person();
		suzuki.name = "鈴木花子";
		suzuki.age = 16;
		suzuki.phoneNumber = "000-0000-0000";
		suzuki.address = "suzuk@abc.jp";
		System.out.println(suzuki.name);
		System.out.println(suzuki.age);
		System.out.println(suzuki.phoneNumber);
		System.out.println(suzuki.address);
		suzuki.talk();
		suzuki.walk();
		suzuki.run();
		
		Person yamato = new Person();
		yamato.name = "山戸香菜";
		yamato.age = 29;
		yamato.phoneNumber = "000-0000-0000";
		yamato.address = "yamato@abc.jp";
		System.out.println(yamato.name);
		System.out.println(yamato.age);
		System.out.println(yamato.phoneNumber);
		System.out.println(yamato.address);
		yamato.talk();
		yamato.walk();
		yamato.run();
		
		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name ="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
