package GenericClass.java;

import java.io.InputStream;

public class GenericClass<T> {
	T data;
	
	void setdata(T data)
	{
		this.data=data;
	}
	T getdata()
	{
	return data;	
	}
	

}
