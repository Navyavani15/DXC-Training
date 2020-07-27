package java_Programs;

public class A3_P3_Product {
	String productCode;
	String productName;
	double productPrice;
	char category ;
    private static int productCounter=100;
    A3_P3_Product(String productName,double productPrice,char category)
    {
    	super();
    	this.productName=productName;
    	this. productPrice=productPrice;
    	this.category=category;
        productCode=generateProductCode();
        
    }
    private String generateProductCode()
    {
    	//returns product code as string
    	this.productCode=category+Integer.toString(productCounter);
            productCounter++;
    	return productCode;
    }
    
    
    A3_P3_Product(String productName,double productPrice)
    {
    	
    	this.productCode=generateProductCode();
    	this. category='E';
    
    }
   
   
    
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}
	public static int getProductCounter() {
		return productCounter;
	}
	public static void setProductCounter(int productCounter) {
		A3_P3_Product.productCounter = productCounter;
	}
	public String getProductDetails()
	{
		String str="Product Code :"+productCode + 
				"\nName :"+productName+"\n" + 
				"price : " +productPrice+"\n" + 
				"Category : "+category;
		return str;
}
	
	
	

}
