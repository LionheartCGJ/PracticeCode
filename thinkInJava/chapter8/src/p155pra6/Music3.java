package p155pra6;

import java.util.Random;

/**
 * ��ϰ6:�޸�Music3.java��ʹwhat()������Ϊ��Object��toString()������
 * ����System.out.println()������ӡInstrument���󣨲�������ת�ͣ�
 * ��:��ΪInstrument.toString()����
 * 
 * ��ϰ7:��Music3.java�����һ���µ�����Instrument,����֤��̬���Ƿ�����������ӵ�������
 * 
 * ��ϰ8:�޸�Music3.java,ʹ�������Shapes.java�еķ�ʽ��������Ĵ���Instrument����
 * ��:(�Ƚ�ԭ�����������ɷ�ʽע����)
 * */
public class Music3 {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument [] e){
		for(Instrument i : e){
			tune(i);
		}
	}
	
	public static void main(String [] args){
//		Instrument [] all = {
//				new Wind(),
//				new Percussion(),
//				new Stringed(),
//				new Brass(),
//				new Woodwind()
//				}; 
		
		Instrument [] all = new Instrument[100];
		
		RandomInstrument ri = new RandomInstrument();//��ϰ8������ɷ���
		for(int i = 0; i < all.length; i++){
			all[i] = ri.getInstrument();
		}
		
		tuneAll(all);
		
		Instrument i = new Instrument();//��ϰ7����,��֪�������ǲ��������˼..������ӷ�ʽ
		i.play(Note.MIDDLE_C);
		
//		System.out.println(all[0].what());		//����what()����
	}
}

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play()"+n);
	}
	
	String what(){
//		return "Instrument.";
		return this.toString();
	}
	
	void adjust(){
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument{
	void play(Note n){
		System.out.println("Wind.play()"+n);
	}
	
	String what(){
//		return "Wind.";
		return this.toString();
	}
	
	void adjust(){
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument{
	void play(Note n){
		System.out.println("Percussion.play()"+n);
	}
	
	String what(){
//		return "Percussion.";
		return this.toString();
	}
	
	void adjust(){
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument{
	void play(Note n){
		System.out.println("Stringed.play()"+n);
	}
	
	String what(){
//		return "Stringed.";
		return this.toString();
	}
	
	void adjust(){
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind{
	void play(Note n){
		System.out.println("Brass.play()"+n);
	}
	
	void adjust(){
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind{
	void play(Note n){
		System.out.println("Woodwind.play()"+n);
	}
	
	String what(){
//		return "Woodwind.";
		return this.toString();
	}
}

class RandomInstrument{//��ϰ8�����������
	private static Random rd = new Random();
	
	public Instrument getInstrument(){
		switch(rd.nextInt(6)){
		default:
		case 0:return new Instrument();
		case 1:return new Wind();
		case 2:return new Percussion();
		case 3:return new Stringed();
		case 4:return new Brass();
		case 5:return new Woodwind();
		}
	}
}