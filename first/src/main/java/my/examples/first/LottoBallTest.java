package my.examples.first;

import java.util.ArrayList;
import java.util.List;

public class LottoBallTest {

	public static void main(String[] args) {
		List<LottoBall> list = new ArrayList<>();
		for(int i = 1; i <=45; i++) {
			list.add(new LottoBall(i));
		}
		
		LottoMachine machine = new NHLottoMachine();
		machine.setBalls(list);
		for(int i = 0; i < 5; i++) {
			machine.mix();
			List<LottoBall> result = machine.getBalls();
			
			for(LottoBall ball : result) {
				System.out.print(ball.getNumber() + "   ");
			}
			System.out.println();
		}
		
	}

}
