package my.examples.first;


// 홍길동이 작성하는 클래스 
public class ExceptionTest01 {

	public static void main(String[] args) {
		Calc c = new Calc();
		try {
			int result = c.divide(10, 0);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없다.");
		}
	}
}

// 둘리가 작성하는 클래스 
class Calc{
	/**
	 * i를 k로 나눈 결과를 반환한다.
	 * @param i
	 * @param k
	 * @return
	 * @throws ArithmeticException 0으로 나눌경우 발생 
	 */
	public int divide(int i , int k) throws ArithmeticException {
		int value = 0;
		value = i / k;
		return value;
	}
}