package p144pra21;
/**
 * ����һ����final��������.�ɴ˼̳в���һ���ಢ���Ը��Ǹ÷���.
 * */
public class Test21 extends Base{
//	public void fun(){}		//Cannot override the final method from Base��final���εķ��������Ա�����
	public void fun(int i){	//���Ա�����
		
	}
}


class Base{
	public final void fun(){
		System.out.println("Base fun()");
	}
}