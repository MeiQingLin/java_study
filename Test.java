public class Test{
	public static void main(String[] args){
		Musician m = new Musician();
		Erhu e = new Erhu();
		Piano p = new Piano();
		Violin v = new Violin();
		m.play(e);
		m.play(p);
		m.play(v);
	}
}