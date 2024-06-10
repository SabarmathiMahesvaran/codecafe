package GenericClass.java;

public class MinMaxImpl<T extends Comparable<T>>implements MinMax<T>{
	T[]Value;
	MinMaxImpl(T[] Obj)
	{
	Value=Obj;
	}
	@Override
	public T min()
	{
		T o1= Value[0];
		for(int i = 1;i < Value.length;i++)
		  if(Value[i].compareTo(o1)<0)
				o1=Value[i];
		  return o1;
			
	}
	@Override
	public T max() {
		T o1=Value[0];
		for(int i=1;i<Value.length;i++)
			if(Value[i].compareTo(o1)>0)
				o1=Value[i];
		return o1;
	}
	

}
