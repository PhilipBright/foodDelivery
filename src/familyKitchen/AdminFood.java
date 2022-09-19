package familyKitchen;

public class AdminFood {
		int FoodID;
		String FoodName;
		String Date;
		String CustomerName;
		int price;
		
		public AdminFood(int foodID, String foodName, String date, String customerName, int price) {
			super();
			FoodID = foodID;
			FoodName = foodName;
			Date = date;
			CustomerName = customerName;
			Price = price;
		}
		int Price;
		public int getFoodID() {
			return FoodID;
		}
		public void setFoodID(int foodID) {
			FoodID = foodID;
		}
		public String getFoodName() {
			return FoodName;
		}
		public void setFoodName(String foodName) {
			FoodName = foodName;
		}
		public String getDate() {
			return Date;
		}
		public void setDate(String date) {
			Date = date;
		}
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		
		
	
		
}
