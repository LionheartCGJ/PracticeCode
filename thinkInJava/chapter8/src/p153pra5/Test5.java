package p153pra5;

/**
 * ����ϰ1Ϊ��������Cycle�����wheels()�����������������ӵ������޸�ride()��������������wheels()����������֤��̬�������ˡ�
 * */
public class Test5 {
	
	public static void ride(Cycle c){
		System.out.println(c.getClass().getName()+"��������:"+c.wheels());
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
