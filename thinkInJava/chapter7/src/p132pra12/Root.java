package p132pra12;

public class Root {
	
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	
	public Root(){
		System.out.println("root");
	}
	
	public void dispose(){
		c1 = null;
		c2 = null;
		c3 = null;//�������,�����������ø�ֵΪnull,�������ջ��ƻ��Զ���û���õĶ������
		System.out.println("root dispose");
	}
}
