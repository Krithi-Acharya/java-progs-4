package Library;
public class Stack {

	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size){
		this.capacity = size;
		this.top = -1;
		this.arr = new int[capacity];
		}
	
	Stack(int[] inputarr){
		this.capacity=inputarr.length;
		this.top = this.capacity - 1;
		this.arr=new int[capacity];
		
		for(int i=0;i<capacity;i++) {
			arr[i]=inputarr[i];
		}
	}
	
	void push(int x) {
		if(top==capacity-1) {
			System.out.println("Stack overflow!,cannot perform push operation"+ x);
			return;
		}
		else {
				top++;
			arr[top]=x;
			System.out.println(x+"pushed into stack");
		}
	}
	void push(int x, int y) {
		push(x);
		push(y);
	}
	int pop() {
		if(top==-1) {
			System.out.println("Stack underflow!,nothing to pop");
			return -1;
			}
		return arr[top--];
	}
	void pop(int n) {
        for (int i=0; i < n; i++) {
            int val = this.pop();
            if (val != -1) 
            {
            System.out.println("Popped: " + val);
        }else break;
    }
	}
	void display(int n) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents (Top to Bottom):");
        for (int i = top; i >= 0; i--) {
        	System.out.println(arr[i]);
        }  
        }
	void display1(int n) {
		if (top == -1) {
		System.out.println("Stack is empty");
		return;
		}
		if (n <= 0) {
			System.out.println("Invalid number of elements");
			return;
			}
			System.out.println("Top " + n + " elements:");
			for (int i = top; i >= 0 && i > top - n; i--) {
			System.out.println(arr[i]);
	}
	}
	
}
