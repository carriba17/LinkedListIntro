//Carter Arribas
//Professor Brown
//October 2024
//CRCP III

//In this project we begin the use of nodes and linked Lists. This is main class
//dedicated to running everything. For this project I will be making an example of 
//a linked list in the form of a grocery list.



public class Main {

    //Ask why static here is the right fix
   
    public static void main(String[] args)
    {
        //Declare new list
        GroceryList groceryList = new GroceryList();

    // Test One
        groceryList.insertAtEnd(new FoodNode("milk"));
        groceryList.insertAtEnd(new FoodNode("bananas"));
        groceryList.insertAtEnd(new FoodNode("ice cream"));
        groceryList.insertAtEnd(new FoodNode("spinach"));
        groceryList.insertAtEnd(new FoodNode("chicken"));
        groceryList.print();

    //Test Two
        groceryList.remove("ice cream");
        groceryList.print();

    //Test Three
        groceryList.remove("chicken");
        groceryList.print();

    //Test Four
    int spinachIndex = groceryList.find("spinach");
        System.out.println("Spinach is number " + spinachIndex + " in the grocery list.");
        groceryList.print();

    //Test Five
    int eggsIndex = groceryList.find("eggs");
        if (eggsIndex == -1) {
            groceryList.insertAtEnd(new FoodNode("eggs"));
            System.out.println("Eggs not found, adding at the end.");
        } 
        else {
            System.out.println("Eggs are number " + eggsIndex + " in the grocery list.");
        }
        groceryList.print();

    //Test 6
        groceryList.insertAtStart(new FoodNode("onions"));
        groceryList.print();

    //Test 7
        groceryList.insert("bananas", new FoodNode("strawberries"));
        groceryList.print();


    }//End Main method   
}
