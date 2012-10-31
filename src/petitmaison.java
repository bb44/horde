
public class petitmaison extends Batiment {
	public petitmaison (int x1,int y1){
		super(x1,y1);
		this.min=2;
		this.max=5;
	}
	
	public int Type(){
		return 9;
	}
}
