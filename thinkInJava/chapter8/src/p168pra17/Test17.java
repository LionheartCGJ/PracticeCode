package p168pra17;
/**
 * ��ϰ17:ʹ����ϰ1����Cycle�Ĳ�νṹ,��Unicycle��Bicycle�����balance()����,��Tricycle�в����.�����������������͵�ʵ��,������������ת��ΪCycle����.
 * �� �������ÿһ��Ԫ���϶�����,����balance(),���۲���.
 * 	��:�д���,��ΪCycle����û��balance()����
 * Ȼ����������ת��,�ٴε���balance(),�۲콫������ʲô.
 * 	
 * */
public class Test17 {
	public static void main(String [] args){
		Cycle c[] = {
				new Cycle(),
				new Bicycle(),
				new Tricycle(),
				new Unicycle(),
		};
		
		//Cycle����û��balance()����,����4�д�����벻ͨ��
//		c[0].balance();
//		c[1].balance();
//		c[2].balance();
//		c[3].balance();
		
		//����ת�ͺ�,��balance()�����ľͿ��Ա���ͨ��,û��balance()��������,����ᱨ��
		((Bicycle)c[1]).balance();
//		((Tricycle)c[2]).balance();	//����,���벻ͨ�� 
		((Unicycle)c[3]).balance();
	}
}
