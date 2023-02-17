package demo;
import Exceptions.*;

public class Sample 
{
	protected String sampleClassName;
	protected double[] arr;
	
	Sample(String sampleName, double ...ds)
	{
		this(ds);
		this.sampleClassName = sampleName;
	}
	
	Sample(double ...ds)
	{
		this.arr = new double[ds.length];
		
		for(int i = 0; i < ds.length; i++)
		{
			this.arr[i] = ds[i];
		}
	}
	
	public double[] getArr() {
		return this.arr;
	}
	
	public String getClassN() {
		return this.sampleClassName;
	}
	}