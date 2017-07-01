package p129pra2;

public class Detergent extends Cleanser {

	public void scrub(){
		append("Detergent.scrub()");
		super.scrub();
	}
	
	public void foam(){
		append("foam()");
	}
	
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();

		System.out.println(x);
		
		System.out.println("Testubg base class:");
		Cleanser.main(args);//Get�¼��ܣ�main���������ã�ѧϰ��
	}

}

/*
 * ���н����
Cleanserdilute()apply()Detergent.scrub()scrub()foam()
Testubg base class:
Cleanserdilute()apply()scrub()
 * 
 * 
 * PS�����Կ�����������scrub()���������Ծ�ֱ��ִ�������scrub()����������ִ�и����е�scrub()�����ˣ�
 * ������û��dilute()������apply()��������ֱ��ִ�и����еĸ÷�����
 * 
 * 
 */