//Carter Arribas
//CRCP III
//October 2024
//Grocery List Class

public class GroceryList {

private FoodNode head;

public GroceryList(){
    this.head = null;
}
public boolean isEmpty(){
    return head == null;
}

public void insertAtStart(FoodNode node){
    node.setNextFood(head);
    head = node;
}

public void insertAtEnd(FoodNode node){
    if(isEmpty()){
        head = node;
    }else{
        FoodNode current = head;
            while(current.getNextFood() != null){
                current = current.getNextFood();
            }//End While 
        current.setNextFood(node);
    }//End Else
}//End insert At End

public void print(){
    FoodNode current = head;
        while (current != null){
            System.out.print(current.getFoodName() + "");
            current = current.getNextFood();
        }
    System.out.println("");
}//End Print

//This is the method used to find food at a specfic index
public void insert(int index, FoodNode node) {
        if (index == 0) {
            insertAtStart(node);
            return;
        }
    FoodNode current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.getNextFood();
        }
        if (current != null) {
            node.setNextFood(current.getNextFood());
            current.setNextFood(node);
        }
}
}//End Grocery List
