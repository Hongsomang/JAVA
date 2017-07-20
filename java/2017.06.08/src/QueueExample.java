import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue=new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail","È«±æµ¿"));
		messageQueue.offer(new Message("sendMail","±è¼ö¿¬"));
		messageQueue.offer(new Message("sendMail","ÀÓÃ¤È«"));
		
		while(!messageQueue.isEmpty()){
			Message message=messageQueue.poll();
			switch(message.command){
				case"sendMail":
					System.out.println(message.to+"´Ô¿¡°Ô ¸ŞÀÏÀ» º¸³À´Ï´Ù.");
					break;
				case"sendSMS":
					System.out.println(message.to+"´Ô¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
					break;
				case"sendkakaotalk":
					System.out.println(message.to+"´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
					break;
				
			}
		}
	}

}
