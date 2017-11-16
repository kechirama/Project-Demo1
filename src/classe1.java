
public class classe1 {
	private String sName;
	public classe1(String name){
		sName = name;
	}
	public String getName(){
		return sName;
	}
	public void saying(){
		System.out.printf("O nome eh %s", getName());
	}

}
