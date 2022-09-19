package familyKitchen;

public class Food {
		int FoodCode;
		String FoodName;
		String Rating;
		String Type;
		int Price;
		public Food(int foodCode, String foodName, String rating, String type, int price) {
			super();
			FoodCode = foodCode;
			FoodName = foodName;
			Rating = rating;
			Type = type;
			Price = price;
		}
		public int getFoodCode() {
			return FoodCode;
		}
		public void setFoodCode(int foodCode) {
			FoodCode = foodCode;
		}
		public String getFoodName() {
			return FoodName;
		}
		public void setFoodName(String foodName) {
			FoodName = foodName;
		}
		public String getRating() {
			return Rating;
		}
		public void setRating(String rating) {
			Rating = rating;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		
		
	
		
}
