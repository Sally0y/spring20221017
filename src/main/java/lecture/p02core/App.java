package lecture.p02core;

public class App {
	
	public static void main(String[] args) {
		// 우리가 controll
		Servlet1 servlet1 = new Servlet1();
		servlet1.setProductDao(new ProductDao()); //set field (dependency; 의존성)
		servlet1.doGet();
		
		System.out.println("프로그램 계속 진행");
	}
	
}
