public class synchronization {
	public static void main(String[] args) {

		MyData d = new MyData();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);

		t1.run();
		t2.run();

	}
}

class MyThread1 extends Thread{

	MyData d;
	MyThread1(MyData dat){
		d= dat;
	}

	public void run(){
		d.display("ABCDEFGHIJKLMNOPQRSTUVWXYZ ABCDEFGHIJKLMNOPQRSTUVWXYZ ");
	}
}
class MyThread2 extends Thread{

	MyData d;
	MyThread2(MyData dat){
		d= dat;
	}

	public void run(){
		d.display("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz ");
	}
}

class MyData {

	synchronized void display(String str){
		for (int i=0;i<str.length();i++ ) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}
	}
}