package Algo.Stack;

public class StackArrayImpl {
    int[] arr;
    int top;
    public StackArrayImpl(int size){
        this.arr = new int[size];
        this.top=-1;
        
    }

    public  void push(int number) {
        if(!isFull()){
            arr[++top] = number;
            System.out.println(number+"  pushed into stack\n");
        }else{
            System.out.println("Stack is full\n");
        }
    }

    public void pop() {
        if(!isEmpty()){
            int removedNumber = arr[top--];
            System.out.println(removedNumber +"-> removed from the stack\n");
        }else
        {
            System.out.println("Stack is empty\n");
        }
    }

    public void peek(){
        if(!isEmpty()){
            int topNumber = arr[top];
            System.out.println(topNumber +"-> top from the stack\n");
        }else
        {
            System.out.println("Stack is empty\n");
        }
    }

    public void min(){
        if(!isEmpty()){
            int min = arr[top];
            for(int i= top-1;i>=0; i--){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println(min+" is min number in stack\n");
        }else
        {
            System.out.println("Stack is empty\n");
        }
    }

    public void max(){
        if(!isEmpty()){
            int max = arr[top];
            for(int i=top-1;i>=0;i--){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(max+" is max number in stack\n");
        }else
        {
            System.out.println("Stack is empty\n");
        }
    }
public void print(){
    System.out.print("Stack -> ");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]);
            if(i>0)
            System.out.print("->");
        }
    System.out.println("\n");
}
    private boolean isFull(){
        return (top == arr.length -1);
    }
    private boolean isEmpty(){
        return (top == -1);
    }
}
