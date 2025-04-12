package JavaProject;

public class PartsData extends Object {
	private String name;
	private int quantity;
	private String inDate;
	
	public PartsData() {
		this(null, 0, null);
	}

	public PartsData(String name, int quantity, String inDate) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.inDate = inDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	@Override
	public String toString() {
		return name + "\t" + quantity + "EA\t" + inDate + "\n";
	}
	
}
