package exam;
class Project{
	private static String projectName="DSM HR";
	private static String programName="자바실습";
	public static void projectDesign(){
		System.out.println(Project.projectName+"프로젝트디자인 중");
		
	}
	public static void programming(){
		System.out.println(Project.programName+"프로그램 작성 중");
	}
	public static void maintenance(){
		System.out.println(Project.projectName+"유지보수 중");
	}
}
public class projectDesign {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project.projectDesign();
		Project.programming();
		Project.maintenance();

	}

}
