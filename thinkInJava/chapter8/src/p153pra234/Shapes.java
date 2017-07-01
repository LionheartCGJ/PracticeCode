package p153pra234;
/**
 * ��ϰ2���ڼ���ͼ�ε�ʾ���У����@overrideע��
 * �������ף�����Shape�����@override�𣿣�
 * 
 * ��ϰ3���ڻ���Shape.java�����һ���·��������ڴ�ӡһ����Ϣ���������಻Ҫ�������������
 * ����ͷ�����ʲô:ÿһ�������඼��ִ�л����е��Ǹ�����
 * 
 * ����������һ���������и��Ǹ÷��������������ĵ����಻�踲�ǣ��۲�����ʲô������
 * ��Circle���и�����print()����,�������Circle��ִ�е����Լ���print()���������ർ����ִ�еĻ��ǻ����е�print()����
 * 
 * ��������еĵ������и��������������û�г��ԣ�����ʵ��Ч���϶������еĵ����඼ִ���Լ���print()������
 * 
 * ��ϰ4,����Shapes.java�����һ���µ�Shape���ͣ�����main()��������֤����̬�������͵������Ƿ����ھ������е�һ����
 * (����˾�̬��sp����������û����������˵�������ͺ;�������ʲô��)
 * 
 * */
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	private static Shape sp = null;
	
	public static void main(String [] args){
		Shape s[] = new Shape[9];
		sp = new Square();
		
		sp.print();;
		
		for(int i = 0; i < s.length; i++){
			s[i] = gen.next();
		}
		
		System.out.println("for:");
		for(Shape shape : s){
			shape.draw();
			shape.print();
		}
	}
}
/*
 * ��ϰ2���н����
triangel.draw()
triangel.draw()
square.draw()
triangel.draw()
square.draw()
triangel.draw()
square.draw()
triangel.draw()
circle.draw()

 
 */