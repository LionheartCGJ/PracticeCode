package p138pra14;
/**
 * ��Car.java�и�Engine���һ��service()����,����main()�е��ø÷���
 * */

class Engine{
	public void start(){}
	public void rev(){}
	public void stop(){}
	public void service(){	//�Զ���ķ���
		System.out.println("������");
	}
}

class Whell{
	public void inflate(int psi){
		
	}
}

class Window{
	public void roolup(){}
	public void rooldown(){}
}

class Door{
	public Window window = new Window(){};
	public void open(){}
	public void close(){}
}

public class Car {
	public Engine engine = new Engine();
	public Whell [] whell = new Whell[4];
	public Door
		left = new Door(),
		right = new Door();
	
	public Car(){
		for(int i = 0; i < 4; i++){
			whell[i] = new Whell();
		}
	}
	
	public static void main(String [] args){
		Car car = new Car();
		car.left.window.roolup();
		car.whell[0].inflate(72);
		car.engine.service();//��car������engine����
	}
}


//PS:���˾��������Ŀ��������ϰʹ��       ����.����(����).����()