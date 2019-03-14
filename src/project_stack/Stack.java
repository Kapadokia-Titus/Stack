package project_stack;

public class Stack{

	   //stack initialization
	        private int [] stack; //empty declared stack
	        private int top;
	        private int size;
	        
	    //creating a constructor
	    public Stack(){
	        top = -1;
	        size = 50;
	        
	        stack = new int[50];
	    }
	    //create another constructor for the size
	    public Stack(int size){
	         top = -1;
	        this.size = size;
	        
	        stack = new int[this.size];
	    }
	    //creating two major functions that pushes and pops the values
	    
	    //creating a boolean function to check whether the top value has been pushed or not.
	    public boolean push(int item){
	        //use if function to implement push
	        if (!isFull()){
	        //first increment the top
	        top++;
	        stack[top]=item;
	        return true;
	        }else{
	            return false;
	        }
	    }
	    //a function that checks if the top is full
	    public boolean isFull(){
	        return (top == stack.length -1);
	    }
	    
	    //we want to pop a value, function for popping 
	    public int pop(){
	        return stack[top--];
	    }
	    //if the stack is empty, the code should not pop anything
	    public boolean isEmpty(){
	        return(top == -1);
	    }
 public static void main(String []args){
	        
	        //creating an object
	        Stack st = new Stack();
	        //adding a value to the empty stack
	        if(!st.isFull()){
	            st.push(2);
	              st.push(4);
	                st.push(6);
	                  st.push(8);
	        }
	        System.out.println(st.pop());
	        System.out.println(st.pop());
	     }		
	    
	}






















