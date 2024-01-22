//time complexity: O(1)
//space complexity: O(n)
//problem faced: faced issue while pushing elements

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;//assigns value passed to constructor to the data field of StackNode.
            this.next = null;  
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode stackNode = new StackNode(data);
        //Write code to push data to the stack. 
        if (isEmpty()) {
            root = stackNode;
        }
        StackNode temp = root;//update root to next element and new node to be the root
        root = stackNode;
        stackNode.next = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int pop = root.data;//find the element to pop
            root = root.next;//update root to second element, popping that element
            return pop;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return 0; 
        }
        else{
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
