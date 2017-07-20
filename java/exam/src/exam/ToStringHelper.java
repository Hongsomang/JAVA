package exam;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface PrintToString{
	
}
public class ToStringHelper {

	public static String ToString(Object obj) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Class clazz=obj.getClass();
		for(Field field :clazz.getDeclaredFields()){
			if(field.isAnnotationPresent(PrintToString.class)){
				String fieldName=field.getName();
				fieldName="get"+
				fieldName.substring(0,1).toUpperCase()+
				fieldName.substring(1);
				Method method=null;
				try{
					method=clazz.getMethod(fieldName, null);
					
				}catch(NoSuchMethodException|SecurityException e){
					e.printStackTrace();
					
				}
				Object value=null;
				try{
					value=method.invoke(obj);
					
				}catch(IllegalAccessException|IllegalArgumentException| InvocationTargetException e){
					e.printStackTrace();
					
				}
				sb.append(field.getName()).append("=").append(value);
			}
		}
		return sb.toString();
	}

}
class Person{
	@PrintToString
	private String name;
	
	private int age;
	@PrintToString
	private String remark;
	public String toString(){
		return ToStringHelper.ToString(this);
		
	}
	
	
}