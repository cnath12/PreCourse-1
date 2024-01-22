//Time complexity: O(1)
//Space complexity: O(1)
//did code run on leet code: not able to find problem on leetcode
//problem faced while coding: none

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top<0) {
            return true;
        }
        return false;
        //Write your code here 
    } 

    Stack() 
    { 
        top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    {
        if (top >= MAX - 1) {
            return false;
        }
        a[++top] = x;
        return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int x = a[top--];
        return x;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        if (isEmpty()) {
            return 0;
        }
        return a[top];
        //Write your code here
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
