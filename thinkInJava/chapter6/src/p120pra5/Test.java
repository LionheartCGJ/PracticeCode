package p120pra5;
/**
 * ����һ������public��protected,private�Ͱ�����Ȩ�����Լ�������Ա����
 * ���������һ�����󣬿���������ͼ�����������Աʱ����õ�ʲô���͵ı�����Ϣ
 * */

/**
 * TestΪ�����࣬ͬ���£�TestClassΪĿ����
 * */
public class Test {
	public static void main(String [] args){
		TestClass ts = new TestClass();
		ts.str1 = "str1";
		ts.str2 = "str2";
//		ts.str3 = "str3";	//The field TestClass.str3 is not visible
		
		ts.fun1();
		ts.fun2();
//		ts.fun3();			//The method fun3() from the type TestClass is not visible
	}
}


/*
 * �ܽ᣺ͬһ���£���ͬ���У�protected���Է��ʣ�private���ܷ��ʣ�publicʼ�տ��Է���
 * 
 */