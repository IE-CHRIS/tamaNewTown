public class Fashion extends TangibleAsset{
	private int modelNumber;
	public Fashion(String name, int price, String color, int modelNumber){
		super(name, price, color)
		this.modelNumber = modelNumber;
	}
	public int modelNumber(){
		return this.modelNumber;
	}

