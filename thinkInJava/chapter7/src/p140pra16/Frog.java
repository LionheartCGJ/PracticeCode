package p140pra16;
/**
 * ����һ����ΪAmphibian����,�ɴ˼̳в���һ����ΪFrog����.
 * �ڻ����������ʵ��ķ���.��main()��,����һ��Frog������ת����Amphibian,Ȼ��˵�����з������ɹ���
 * */
public class Frog extends Amphibian{
	
	@Override public void name(){		//��ϰ17,���ǻ����еķ���
		System.out.println("����");
	}
	
	public void sound(){
		System.out.println("����");
	}
	
	public static void main(String [] args){
		Amphibian a = null;
		a = new Frog();		//����Frog����,����ת����Amphibian
		a.name();			//��������඼�еķ���,ִ�������
		a.weight();			//�����еķ���ֱ��ִ�и����
//		a.sound();			//������,������û�еķ���,�������
		
//		Frog f = new Amphibian(); 	//���಻������ת��Ϊ����
	}
}

/*
 *���н��:
 *
 ���ܶ���
����
weight
 *
 */