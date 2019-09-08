/* A Stack is data structure that allows data manipulation only at one end, called TOP 
 * A Stack is LIFO structure, meaning LAST IN, FIRST OUT: the last elment added to 
 * the strucure, is the first one that will be removed. Alements cannot be added or 
 * removed from any other position that the TOP.*/
class MyStack 
{
        // variables needed to create a stack
        private char myStack[]; 
        private int top;
        
        // the constructor of the Stack
        // this constructor will create  a stack with a certain size
        public MyStack(int size)
        {
            myStack = new char[size]; // creating the array
            top = -1; // initiating the top of the stack with position 0
        }
        
        // adding an element on the top of the Stack
        public void push(char element)
        {
            if(top < myStack.length-1) // if the Stack is not full
            {
                top++;                      // incrementing the top value
                myStack[top] = element;     // pushing the element in the Stack
                System.out.println("Added " + element + " in the Stack.");
            }
            else
            {
                System.out.println("The Stack is full! Elements cannot be added!");
            }
        }
        // removing an element from the ttop of the Stack
        public char pop()
        {
            if(top < 0) // if the stack is empty
            {
                System.out.println("The Stack is empty! There is no element to be removed!");
                return ' ';
            }
            else
            {
                top--;
                System.out.println("Removed " +  myStack[top+1] + " in the Stack.");
                return myStack[top+1];
            }
        }
        // return the element from the top of the Stack
        public char peek()
        {
            if(top > -1)
                return myStack[top];
            else
            {
                System.out.println("The Stack is empty! There is no element to be displayed!");
                return' ';
            }
        }
        // checking if the Stack is empty
        public boolean isEmpty()
        {
            return top==-1;  // will return true if the Stack is empty
        }
        
        public boolean isFull()
        {
            return top==myStack.length-1;
        }
        // check the status of the Stack
        public void status()
        {
            if(isFull())
                System.out.println("The Stack is full.");
            else if(isEmpty())
                System.out.println("The Stack is empty.");
            else
                System.out.println("The Stack is not full nor empty.");
        }
}   
