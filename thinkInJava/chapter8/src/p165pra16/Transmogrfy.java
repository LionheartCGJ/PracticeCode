package p165pra16;
/**
 * ��ϰ16:��ѭTransmogrify.java�������,����һ��Starship��,����һ��AlertStatus����,�����ÿ���ֻ�� ���ֲ�ͬ��״̬,����һЩ���Ըı���Щ״̬�ķ���.
 * */
public class Transmogrfy {
	
	public static void main(String [] args){
//		Stage stage = new Stage();
//		stage.performPlay();
//		stage.change();
//		stage.performPlay();
		
		Starship ss = new Starship();
		ss.AlertStatus.act();
		ss.toHappyActor();
		ss.AlertStatus.act();
		ss.toSadActor();
		ss.AlertStatus.act();
	}
}

class Actor{
	public void act(){}
}

class HappyActor extends Actor{
	public void act(){
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor{
	public void act(){
		System.out.println("SadActor");
	}
}

class Stage{
	private Actor actor = new HappyActor();
	public void change(){
		actor = new SadActor();
	}
	
	public void performPlay(){
		actor.act();
	}
}

class Starship{
	public Actor AlertStatus = new Actor();
	public void toHappyActor(){
		AlertStatus = new HappyActor();
	}
	
	public void toSadActor(){
		AlertStatus = new SadActor();
	}
	
	public void toActor(){
		AlertStatus = new Actor();
	}
	
}