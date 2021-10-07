package HomeworkPack;

public class Computer {
	
	private String brandName;
	private int year;
	private double price;
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		
		Computer pc1 = new Computer();
		pc1.setBrandName("Lenovo");
		pc1.setYear(2019);
		pc1.setPrice(999.99);
		
		System.out.println("Brand Name: " + pc1.getBrandName());
		System.out.println("Year: " + pc1.getYear());
		System.out.println("Price: $" + pc1.getPrice());
		
		System.out.println("--------------------------------");
		
		Computer pc2 = new Computer("Asus", 2021, 1299.99);
		System.out.println(pc2.toString());
	}

	@Override
	public String toString() {
		return "Computer [Brand Name: " + brandName + ", Year: " + year + ", Price: $" + price + "]";
	}

	public Computer(String brandName, int year, double price) {
		this.brandName = brandName;
		this.year = year;
		this.price = price;
	}

	public Computer() {
		
	}

}
