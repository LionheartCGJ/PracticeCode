package p107pra22;
/**
 * ����ϰ21�е�������,Ϊenumдһ��switch()���,����ÿһ��case������ض����ҵ�����.
 * */
public class EnumMoneyTest {
	public static void main(String [] args){
//		Test t = Test.yuan;
		Test t = Test.jiao;
//		Test t = Test.fen;
		
		switch(t){
		case fen:
			System.out.println("��");
			break;
		case jiao:
			System.out.println("��");
			break;
		case yuan:
			System.out.println("Ԫ");
			break;
		default:
			System.out.println("û��");
			break;
		}
	}
}

enum Test{
	yuan,jiao,fen;
}

/*
 * ���н��:
 * ��
 * 
 * 
 * 
 * PS:����,�Ҷ�switch()�����µ��˽�,switch()�еĲ���,
 * ��������int,char����,�������е�Ԫ��ȷ���˵�ʱ��,
 * Ҳ����ȷ����switch��case�����Ԫ������
 */