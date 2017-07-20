
public class Student2 {
public int sno;
public String name;
public Student2(int sno,String name){
	this.sno=sno;
	this.name=name;
}
public boolean equals(Object obj){
	if(obj instanceof Student2){
		Student2 student= (Student2) obj;
		return (sno==student.sno)&&(name.equals(student.name));
	}else{
		return false;
	}
}

public int hashCode(){
	return sno+name.hashCode();
}
}
