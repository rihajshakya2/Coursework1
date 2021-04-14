package Queue;

public class Main {
	public static void main(String[] args) {
		CircularQueue soft= new CircularQueue();
		soft.enqueue(14);
		soft.enqueue(26);
		soft.enqueue(32);
		soft.enqueue(46);
		soft.enqueue(51);
		soft.enqueue(80);
		soft.dequeue();
		soft.display();
	}

}


