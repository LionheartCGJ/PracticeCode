package p132pra11;
/**
 * �޸�Detergent,����ʹ�ô���
 * */
public class Detergent {
	
	private Cleanser c = new Cleanser();
	
	public void scrub(){
		c.append("Detergent.scrub()");
		c.scrub();
	}
	
	public void foam(){
		c.append("foam()");
	}
	
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.c.dilute();
		x.c.apply();
		x.scrub();
		x.foam();

		System.out.println(x);
		
		System.out.println("Testubg base class:");
		Cleanser.main(args);//Get�¼��ܣ�main���������ã�ѧϰ��
	}

}

/*
 * ���н����
p132pra11.Detergent@2a139a55
Testubg base class:
Cleanserdilute()apply()scrub()
 * 
 * 
 * PS����ʵ����,�Ҿ��þ���,��һ����,��Ϊ��һ���������,����һ������,ʹ���Ǹ���ķ���
 * 
 * 
 */