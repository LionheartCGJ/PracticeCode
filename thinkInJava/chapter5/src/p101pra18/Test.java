package p101pra18;

/**
 * ͨ����������ֵ��Ӧ������,�Ӷ������ϰ17
 * 
 * */
public class Test {
	public static void main(String [] args){
		AAA arr[] = new AAA[5];//��ʼ�������СΪ0
		
		for(int i = 0; i < 5; i++){
			arr[i] = new AAA(i+"");
		}
	}
}


class AAA{
	public AAA(String str){
		System.out.println(str+"aaa");
	}
}

/*
 * ִ�н��:
0aaa
1aaa
2aaa
3aaa
4aaa
 */