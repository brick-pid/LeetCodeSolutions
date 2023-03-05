import java.util.ArrayList;
import java.util.List;

public class BallString implements Comparable<BallString>{
	private List<Ball> substring;
	private int start;
	private int end;
	
	
	// init a BallString by a input String
	public BallString(String bs) {
		this.substring = new ArrayList<>();
		for(int i = 0; i < bs.length(); i++) {
			this.substring.add(new Ball(bs.charAt(i), i));
		}
	}

	public void appendBall(Ball b) {
		substring.add(b);
	}
	
	public int getLength() {
		return this.substring.size();
	}
	
	public int getStart() {
		return this.start;
	}

	@Override
	public int compareTo(BallString o) {
		int flag = 0;
		if(this.getLength() > o.getLength()) flag = 1;
		if(this.getLength() < o.getLength()) flag = -1;
		if(this.getLength() == o.getLength()) {
			if(this.getStart() < this.getStart()) flag = -1;
			else flag = 1;
		}
		return -flag;
	}
	
	@Override
	public String toString() {
		Character colour = this.substring.get(0).getColour();
		System.out.println(colour);
		return colour.toString().repeat(substring.size());
	}
}

