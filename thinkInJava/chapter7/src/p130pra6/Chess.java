package p130pra6;
/**
 * ��Chess.java֤��:���û��๹�������������ڵ�����Ĺ�������Ҫ���ĵ�һ����
 * */
public class Chess extends BoardGame{
	Chess(){
		super(11);
		System.out.println("Chess constructor");
	}
	
	public static void main(String [] args){
		Chess x = new Chess();
	}
}

class Game{
	Game(int i){
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

/*
���н��:
Game constructor
BoardGame constructor
Chess constructor
 * 
 */