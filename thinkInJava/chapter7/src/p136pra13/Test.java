package p136pra13;
/**
 * ����һ����,��Ӧ����һ�������������εķ���,�̳в�����һ������,�������һ���÷������µ����ض���
 * չʾ���ĸ������ڵ������ж�������
 * */
public class Test extends BaseClass{
	public void fun(String str){
		System.out.println("������������fun()����"+str);
	}
	
	public static void main(String [] args){
		Test t = new Test();
		t.fun();
		t.fun(1);
		t.fun(1,2);
		t.fun("HaHa");
	}
}

/*
 *���н��:
 Ĭ���޲�����
һ�������Ĺ��췽��1
���������Ĺ��췽��1  2
������������fun()����HaHa

 * 
 */