package p107pra21;
/**
 * ����һ��enum����,����ֽ�ҵ���ֵ����,ͨ��values()ѭ������ӡÿһ��ֵ�Լ���ordinal()
 * */
public class EnumMoney {
	public static void main(String [] args){
		for(Test t : Test.values()){
			System.out.println(t.ordinal());
		}
	}
}


enum Test{
	yuan,jiao,fen;
}


/*
 *���н��:(Ӧ�ÿ���EnumԴ��)
0
1
2
 */