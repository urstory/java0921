package my.examples.first;

import java.util.List;

public interface LottoMachine {
	public void setBalls(List<LottoBall> balls);
	public void mix();
	public List<LottoBall> getBalls();
}
