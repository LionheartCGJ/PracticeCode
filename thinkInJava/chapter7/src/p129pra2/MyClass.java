package p129pra2;
/**
 * ��Detergent�м��ɲ���һ���࣬����scrub()�����һ����Ϊsterilize()���·���
 * 
 * */
public class MyClass extends Detergent{
	
	public void scrub(){
		append("MyClass.scrub()");
		super.scrub();
	}
	
	public void sterilize(){
		append("sterilize()");
	}
	
	public static void main(String [] args){
		MyClass mc = new MyClass();
		mc.dilute();
		mc.apply();
		mc.scrub();
		mc.sterilize();
		
		System.out.println(mc);
	}
}

/*
 * ִ�н����
	Cleanserdilute()apply()MyClass.scrub()Detergent.scrub()scrub()sterilize()
	
PS�����Կ���������scrub()��������ִ��MyClass�еģ���ִ�����ĸ���Detergent�еģ����ִ��������ĸ���Cleanser�е�
 */