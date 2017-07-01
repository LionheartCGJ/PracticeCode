package p171pra3;
/**
 * ����һ������,�����������󷽷�print(),���ڵ������и��Ǹ÷���,���Ǻ�ķ����汾���Դ�ӡ�������ж����ĳ�����������ֵ,
 * �ڶ���ñ���֮��,��ԣ������ֵ.�ڻ���Ĺ������е����������,������main()������,����һ�����������,Ȼ���������print()����.���ͷ���������.
 * */
public abstract class BaseClass {
	
	public BaseClass(){
		print();
	}
	
	public abstract void print();
	
	public static void main(String [] args){
		DaoChuBase dcb = new DaoChuBase();
		dcb.print();
	}
}

class DaoChuBase extends BaseClass{
	
	private int i = 5;
	
	public void print(){
		System.out.println(i);
	}
}

/*
 * ���н��:
0
5

�ҵĽ���:�ٴ���DaoChuBaseʱ,���Ȼᴴ�����Ļ���,�������ڳ�ʼ��ʱ�����print()����,
(�ѵ�������������Ѿ�ʵ�ֵ�print()����???������������,��Debug�۲���һ��,ȷʵ��,�����ڵ���print()ʱ,ȷʵ���ܵ���������,���õ������Ѿ�ʵ���˵�print()����)���Դ�ӡ��0
���������ڵ���print����ʱ,˳����µĴ�ӡ��5.
 * 
 */