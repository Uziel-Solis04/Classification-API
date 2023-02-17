package demo;
import java.io.IOException;
import Exceptions.*;

public abstract class Classifier 
{
	protected int k;
	protected DataSet ds;
	
	public void setK(int k) throws ClassifierException
	{
		if(k < 1) throw new ClassifierException(k);
		this.k = k;
	}
	
	static class Resultados{
		double Distancia;
		String Clase;
		public Resultados(double dis, String Clase) {
			this.Distancia = dis;
			this.Clase = Clase;
		}
		@Override
		public String toString() {
			return "[" + this.Distancia + "] " + this.Clase;
		}
	}
	
	public abstract void setDistance(String s);
	public abstract String classify(Sample s) throws IOException;
	
	public void setDataset(DataSet d)
	{
		this.ds = d;
	}
	
}