package p132pra12;
/**
 * ��ϰ9:
 * ����һ��Root��,���京����ΪComponent1,Component2,Component3��ĸ�һ��ʵ��
 * ��Root������һ����Stem,Ҳ������������ɲ���
 * ���е��඼Ӧ���пɴ�ӡ����������Ϣ��Ĭ�Ϲ�����
 * 
 * ��ϰ12:
 * ��һ��dispose()�����Ĳ�νṹ��ӵ���ϰ9����������.//dispose()�������ⲿ�������Ĺ����ͷ��ڴ������
 * 
 * */
public class Stem extends Root{
	
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	
	Stem(){
		System.out.println("stem");
	}
	
	public void dispose(){
		c1 = null;
		c2 = null;
		c3 = null;
		System.out.println("stem dispose");
		super.dispose();
	}
	
	public static void main(String [] args){
		Stem t = new Stem();
		t.dispose();
	}
}

/*
 *ִ�н��:
com111
com222
com333
root
com111
com222
com333
stem
stem dispose
root dispose

 PS:��ʼ��Stem��ʱ�����ִ�����Ļ���Root,
 �����Ļ����ʼ����ɺ��  ��ʼ���� ��ʼ��
 
 ����dispose()����,���ͷ������,���ͷŻ����
 
 * 
 */