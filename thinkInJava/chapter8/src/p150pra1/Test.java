package p150pra1;
/**
 * ����һ��Cycle�࣬����������Unicycle,Bicycle��Tricycle.
 * ��ʾÿһ�����͵�ʵ�������Ծ���ride()��������ת��ΪCycle
 * */
public class Test {
	
	public static void ride(Cycle c){
		System.out.println(c.getClass().getName());
	}
	
	public static void main(String [] args){
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		
		ride(u);
		ride(b);
		ride(t);
	}
}


/*
 * ���н����
cycle
unicyle
cycle
bicycle
cycle
tricycle
p150pra1.Unicycle
p150pra1.Bicycle
p150pra1.Tricycle

 */