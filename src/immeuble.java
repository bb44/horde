
public class immeuble extends Batiment {
	public immeuble (int x1,int y1){
		super(x1,y1);
		this.min=8;
		this.max=100;
	}
	
	public int Type(){
		return 49;
	}
}
