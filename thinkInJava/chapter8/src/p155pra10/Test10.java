package p155pra10;
/**
 * ����һ���������������Ļ���.�ڵ�һ�������п��Ե��õڶ�������.Ȼ�����һ���̳��Ըøû���ĵ�����,�Ҹ��ǻ����еĵڶ�������.
 * �Ըõ����ഴ��һ������,��������ת�͵�������,�����õ�һ������,���ͷ��������.
 * */
public class Test10 {
	public static void main(String [] args){
		Base b = new DaoChuLei();
		b.fun111();
	}
}

class Base{
	public void fun111(){
		System.out.println("Base.fun111()");
		fun222();
	}
	
	public void fun222(){
		System.out.println("Base.fun222()");
	}
}

class DaoChuLei extends Base{
	public void fun222(){
		System.out.println("DaoChuLei.fun222()");
	}
}

/*���н��:
Base.fun111()
DaoChuLei.fun222()

 * PS:���ڵ�������û��fun111()����,�ʵ��û����е�.
 * ��fun111()����ִ�е�����fun222()ʱ,
 * ���ڵ��������Ѿ���fun222()����������,
 * ��ʱ��ִ�е������е�fun222()����,�����Ǽ���ִ�л������.
 * 
 */