package p105pra19;
/**
 * дһ����,���Խ��ܿɱ����String�б�
 * ��֤�������÷�������һ���ö��ŷָ���String�б�,����һ��String[]
 * */
public class GetStringShuZu {
	public static void main(String [] args){
//		���ַ����Ǵ���һ��String[] ����
		String arr[] = new String[]{"aaa","bbb","ccc"};
		
//		��֪������˵�Ķ��ŷָ���String�б�ָ����ʲô
//		��,û���������ഫ��String�б�
//		PS:��֪��main����������ô���ܵ�
		Test t = new Test(arr);
	}
}



class Test{
	public Test(String [] arr){
		for(String str:arr){
			System.out.println(str);
		}
	}
}