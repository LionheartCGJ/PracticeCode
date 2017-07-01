package p155pra9;
/**
 * ��ϰ9:����Rodent(���ݶ���):Mouse(����),Berbil(����),Hamster(������)������һ���̳в�νṹ.
 * �ڻ���Rodent��,�ṩ������Rodent��ͨ�õķ���,�ڵ�������,�����ض���Rodent���͸�����Щ����,�Ա�����ִ�в�ͬ����Ϊ.
 * ����һ��Robent����,��䲻ͬ��Robent����,Ȼ����û��෽��,�۲췢����ʲô.
 * 
 * ��ϰ12:�޸���ϰ9,ʹ���ܹ���ʾ����͵�����ĳ�ʼ��˳��.Ȼ�������͵���������ӳ�Ա����,��˵�������ڼ��ʼ��������˳��.
 * 
 * ��ϰ14:�޸���ϰ12,ʹ��ĳ����Ա�����Ϊ�������ü����Ĺ������,��֤����������ȷ����
 * ��:��Robent.java����Ϊ�������ü����Ĺ������,(��������һ��ʧ��,����ֱ������һ����ϰ�Ļ������޸Ĵ�����,û�б���..)
 * 	(�ĵ�!�ĵ�!�ĵ�!)PS:����˵һ�������ʼ����ʱ��,���ǵ��ø����Ĭ�Ϲ��췽����ʼ��,����,�ڼ̳���,���һ������û��Ĭ�Ϲ��췽��,���ĵ������лᱨ��,��ʾֱ�Ӹ���û��Ĭ�Ϲ��캯��
 * */
public class Test9 {
	private static Robent rb = new Robent();	//����Ϊ�������
	
	public static void main(String [] args){
		Robent [] r = {
//				new Robent(),
				new Mouse(rb),
				new Berbil(rb),
				new Hamster(rb)
				};
		
		for(Robent i : r){
			i.dispose();
		}
		//��ϰ12����ʱ,��ע��forѭ��
		//��ϰ12���н��(���ֶ�����˿���,�Ա�����ķ���)
		//�ĸ�����,�����Ķ�
/*		Robent.chushihua
 * 
		Robent.chushihua
		Mouse.chushihua
		
		Robent.chushihua
		Mouse.chushihua
		Berbil.chushihua
		
		Robent.chushihua
		Mouse.chushihua
		Berbil.chushihua
		Hamster.chushihua*/
	}
}

class Robent{
	private int ref = 0;	//��ϰ14��Ӧ�ü���
	
	public void addRef(){
		ref++;
	}
	
	public void dispose(){
		if(--ref == 0){
			System.out.println("Dispose Robent");
		}
	}
	
	public Robent(){
		System.out.println("Robent.chushihua");
	}
	
	public void name(){
		System.out.println("Robent");
	}
}

class Mouse extends Robent{
	private Robent r;
	
	public Mouse(){
		System.out.println("Mouse.chushihua");
	}
	
	public Mouse(Robent r){
		System.out.println("Mouse.chushihua");
		this.r = r;
		this.r.addRef();
	}
	
	public void dispose(){
		r.dispose();
	}
	
	public void name(){
		System.out.println("Mouse");
	}
}

class Berbil extends Mouse{
	private Robent r;
	
	public Berbil(){
		System.out.println("Berbil.chushihua");
	}
	
	public Berbil(Robent r){
		System.out.println("Berbil.chushihua");
		this.r = r;
		this.r.addRef();
	}
	
	public void dispose(){
		r.dispose();
	}
	
	public void name(){
		System.out.println("Berbil");
	}
}

class Hamster extends Berbil{
	private Robent r;
	
	public Hamster(){
		
	}
	
	public Hamster(Robent r){
		System.out.println("Hamster.chushihua");
		this.r = r;
		this.r.addRef();
	}
	
	public void dispose(){
		r.dispose();
	}
	
	public void name(){
		System.out.println("Hamster");
	}
}

/*
 * ���н��:
Robent
Mouse
Berbil
Hamster
 
 PS:����������ִ���Լ�����ô()����,�����ǻ����е�.
 *
 */