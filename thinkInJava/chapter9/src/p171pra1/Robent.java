package p171pra1;
/**
 * ����ϰ9��Robent���޸�Ϊ������,ֻҪ�п���,�Ž�Rodent�еķ����޸�Ϊ���󷽷�.
 * */
public abstract class Robent{
	private int ref = 0;	//��ϰ14��Ӧ�ü���
	
	public abstract void fun();	//���󷽷�,��abstract���εķ���ֻ������,��û�к�����.
	
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