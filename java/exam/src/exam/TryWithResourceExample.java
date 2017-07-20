package exam;
class FileInputStream implements AutoCloseable{
	private String file;
	public FileInputStream(String file){
		this.file=file;
	}
	public void read(){
		System.out.println(file+"�н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file+"�� �ݽ��ϴ�.");
	}
	
}
public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		}catch(Exception e){
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}

}
