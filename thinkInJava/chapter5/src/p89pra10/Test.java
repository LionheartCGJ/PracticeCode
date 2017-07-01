package p89pra10;
/**
 * ��д����finalize()�ķ���,���ڸ÷����д�ӡ��Ϣ
 * 
 * */
public class Test {
	public static void main(String [] args){
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
		
		Book a = null;
		a.checkIn();
//		System.out.println(a.toString());
	}
}


class Book{//����,���,����
	boolean checkedOut = false;
	
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	protected void finalize(){
		if(checkedOut){
			System.out.println("Error:Checked Out");
		}
	}
}

/*
ִ�н��:
Error:Checked Out
*/


/* 
֮����ʹ��finalize()����,�����Ƿ����ڴ�ʱ,����������C�����е�����
 */