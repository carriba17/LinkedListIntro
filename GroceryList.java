//Carter Arribas
//CRCP III
//October 2024
//Grocery List Class used to link FoodNode Objects

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
    }
    else{
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
            System.out.print(current.getFoodName() + " " + "\n");
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


//Find function that returns the items index number
public int find(String food){
    FoodNode current = head;
    int index = 0;

    //Cycle through the list until food is either found or not found
    while (current != null) {
        if (current.getFoodName().equals(food)) {
            return index;
        }
        current = current.getNextFood();
        index++;
    }
    return -1;
}//END Find function

//Used to insert food after a specfic item
public void insert(String food, FoodNode node){
    int index = find(food);
    if (index != -1) {
        insert(index + 1, node);
    }
}//End after certain insert 

//Remove function used to remove a certain food off list
public void remove(String food){
    if(isEmpty()){return;}
        if (head.getFoodName().equals(food)) {
            head = head.getNextFood();
            return;
        }

    FoodNode current = head;
        while (current.getNextFood() != null && !current.getNextFood().getFoodName().equals(food)) {
            current = current.getNextFood();
        }

    // If food found, skip the node
        if (current.getNextFood() != null) {
            current.setNextFood(current.getNextFood().getNextFood());
        }
}//End remove function

}//End Grocery List
