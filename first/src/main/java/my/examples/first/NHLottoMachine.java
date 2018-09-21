package my.examples.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NHLottoMachine implements LottoMachine{
	private List<LottoBall> list; // 내부적으로 LottoBall을 가질 list

	@Override
	public void setBalls(List<LottoBall> balls) {
		this.list = balls;
	}

	@Override
	public void mix() {
		Collections.shuffle(list); // 클래스명.메소드명 <--static메소
	}

	@Override
	public List<LottoBall> getBalls() {
		List<LottoBall> result = new ArrayList<>();
		for(int i = 0; i < 6; i++) {
			result.add(list.get(i));
		}
		return result;
	}
	

}
