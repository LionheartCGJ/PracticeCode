package p147pra24;
/**
 * ��Beetle.java�У���Beetle��̳в���һ���������͵ġ��׿ǳ桱��
 * ����ʽ����������ͬ�����ٲ���������������
 * 
 * PS����δ���ͬʱ��������ϰ23
 * */
public class JiaKeChong extends Beetle{
	
	private int p = printInit("JiaKeChong.p initialized");
	
	private static int x3 = printInit("static JiaKeChong.x3 initialized");
	
	public JiaKeChong(){
		System.out.println("j,p = " + j+"  "+p);
	}
	
	public static void main(String [] args){
//		Beetle b = new Beetle();
		System.out.println("JiaKeChong main");
		JiaKeChong jkc = new JiaKeChong();
		
		//��ϰ23��֤����������Ķ���������һ��
		//֤�������������ִ���������JiaKeChong�࣬console��ʾ����
		JiaKeChong jkc2 = new JiaKeChong();
		JiaKeChong jkc3 = new JiaKeChong();
		
		/*
static Insect.x1 initialized
static Beetle.x2 initialized
static JiaKeChong.x3 initialized
JiaKeChong main
Insect.i initialized
i = 47,j =  0
Beetle.k initialized
k = 47
j = 39
JiaKeChong.p initialized
j,p = 39  47
//����Ϊ����ģ����Կ��������˾�̬����û���ٴγ�ʼ��֮�⣬���еĻ���Ҳ��ͬʱ�ٴγ�ʼ��
//Ҳ����˵���������ֻ����һ�Σ�����ÿ�β����¶��󣬶����ʼ�����л���
Insect.i initialized
i = 47,j =  0
Beetle.k initialized
k = 47
j = 39
JiaKeChong.p initialized
j,p = 39  47
Insect.i initialized
i = 47,j =  0
Beetle.k initialized
k = 47
j = 39
JiaKeChong.p initialized
j,p = 39  47

		*/
	}
}

class Insect{
	private int i = printInit("Insect.i initialized");
	protected int j;
	
	Insect(){
		System.out.println("i = " + i + ",j =  " + j);
		j = 39;
	}
	
	private static int x1 = printInit("static Insect.x1 initialized");
	
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	
	public Beetle(){
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = printInit("static Beetle.x2 initialized");
	
//	public static void main(String [] args){
//		System.out.println("Beetle constructor");
//		Beetle b = new Beetle();
//	}
}


/*
 * ���н�������������Ǵ�����û�������ϰ23֮ǰ�ģ�
static Insect.x1 initialized			//���  ����  ��̬�����ĳ�ʼ��
static Beetle.x2 initialized			//�β�  ����  ��̬�����ĳ�ʼ��
static JiaKeChong.x3 initialized		//�����ֱࣨ�����ࣩ ��̬�����ĳ�ʼ��
JiaKeChong main							//�����ֱࣨ�����ࣩmain�����ĵ�һ��
Insect.i initialized					//���ڶ���Ϊ����һ������������ȳ�ʼ��������� ��Ա����
i = 47,j =  0							//���ڶ���Ϊ����һ����������󣩺ͳ�ʼ�������߽�ִ�У�������� ���췽��
Beetle.k initialized					//�ٳ�ʼ���ζ��� ���� �ĳ�Ա����
k = 47									//��ִ�дζ���  ����Ĺ��췽��
j = 39									//�ζ���  ����Ĺ��췽��
JiaKeChong.p initialized				//�����ࣨ��ǰ���ࣩ�ĳ�Ա�����ĳ�ʼ��
j,p = 39  47							//�����ࣨ��ǰ���ࣩ�Ĺ��췽��
  
  
  
 * 
 * /
 */