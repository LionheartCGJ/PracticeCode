package p130pra7;
/**
 * �޸���ϰ5,��A��B�Դ������Ĺ�����ȡ��Ĭ�ϵĹ�����,ΪCдһ��������,��������ִ�����еĳ�ʼ��.
 * 
 * */
public class C extends A{
	
	B b = new B(0);
	
	C(){
		super(1);
	}
	
	public static void main(String [] args){
		C c = new C();
	}
}

/*
 * ���н����
A
B

PS������� main������ʼ����newһ��C�࣬C�������ִ�� �Լ��Ļ��� ����������Ҳ����ʾA��Ȼ����C�У���һ����Ա����B������B��ʱ���ִ��B�Ĺ��췽��Ҳ����ʾB��
 */