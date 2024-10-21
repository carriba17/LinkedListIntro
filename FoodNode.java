public class FoodNode{

    public String foodName;
   public  FoodNode nextFood;

    public FoodNode(String foodName){
    this.foodName = foodName;
    this.nextFood = null;
    }

    // Getter for foodName
    public String getFoodName() {return foodName;}
    // Setter for foodName
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    // Getter for nextFood
    public FoodNode getNextFood() {return nextFood;}
    // Setter for nextFood
    public void setNextFood(FoodNode nextFood) {
        this.nextFood = nextFood;
    }
}