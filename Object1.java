package day8_array;

public class Object1 {

	public static void main(String[] args) {
		Job naver=new Job();
		System.out.println(naver.pay+":"+naver.distance);
		
		Job samsung=new Job();
		System.out.println(samsung.pay+":"+samsung.distance);
	}

	}
	class Job{
		int pay;
		int distance;
		public Job() {pay =300; distance=30;}
		
	}

