package demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;

import Exceptions.*;

public class Tests
{
	public static void main(String[] args) throws IOException, SizeOutOfBoundsException, ClassifierException, SizeArgumentsException 
	{		
		DataSet ds1 = new DataSet("colores1.xls");  // default class column = 1
		int ro = ds1.getRows(); // ro = 8
		int co  = ds1.getColumns(); // co = 3, s�lo las columnas NO clase
		System.out.println(ro + "," + co);
		
		//double[][] data = ds1.dataMatrix;
		
		//(fila 7, columna 2) = 40, excluye la clase
		//System.out.println("Original value: " + ds1.get(7, 2));
		
//		ds1.set(7, 2, 42); // cambia 40 por 42
		//System.out.println("Altered value: " + ds1.get(7, 2));	
			
//		ds1.set(9, 2, 42); // Excepci�n: no existe fila 9
		
//		String cl = ds1.getClassName(3);  // cl = "YELLOW"
//		System.out.println(cl);
		
		//ds1.addSample(new Sample("YELLOW", 253, 251, 7));
//		System.out.println(ds1.getRows()); // ro = 9
//		ds1.addSample(new Sample("YELLOW", 253, 251)); // Excepci�n: se esperan 3 datos num�ricos para este dataset
		
//		List<String> classNames = ds1.getClassNames(); // classNames = ["GREEN", "VIOLET", YELLOW"]
//		System.out.println(classNames);
//		double min = ds1.getMinimum(1); // 4, m�nimo valor en columna 1 (red)
//		System.out.println(min);
		
//		double max = ds1.getMaximum(2); // 255, m�ximo valor en columna 2 (green)
//		System.out.println(max);
		
		//System.out.println(ds1);


		Classifier knn = new KnnClassifier(5); // K = 5, default: Euclidean distance
		knn.setK(0); // Excepci�n: K >= 1
//		knn.setK(4); // K = 4
		
//		knn.setDistance(KnnClassifier.EUCLIDEAN);  // MANHATTAN, MINKOWSKI, CHEBYSHEV, ...
		      
//		Sample s1 = new Sample (255, 180, 0);
		//String cl1 = knn.classify(s1);  // Excepci�n: no hay dataset especificado
		knn.setDataset(ds1);
		//String cl1 = knn.classify(s1);  // cl = "YELLOW"
		//�Qu� van a hacer si hay 2 � m�s clases que empatan para cierto sample?
		//�Qu� van a hacer si el sample no se parece a ninguno del dataset?

//		int classColumn = 5;
		//DataSet ds2 = new DataSet("iris5.xls");
		// https://archive.ics.uci.edu/ml/machine-learning-databases/iris/
		//ds2.removeColumns(5, 5);  // de la 5 a la 6
		//ds2.removeRow(1);
		//ds2.removeRows(149, 150); // de la 149 a la 150
		//ds2.addSample(new Sample("Iris-setosa", 5.2, 3.5, 1.4, 0.2));
		//ds2.addSample(new Sample("Iris-versicolor", 7.1, 3.2, 4.7, 1.3));
		//ds2.addSample(new Sample("Iris-versicolor", 7.1, 3.2, 1.3);  // Excepci�n: el sample a a�adir debe incluir 4 datos num�ricos
		//knn.setK(7);
		//knn.setDataset(ds2);
		//String cl2 = knn.classify(new Sample(5.1, 3.5, 1.4, 0.2);  // cl2 = "Iris-setosa"
		//String cl3 = knn.classify(new Sample(5.1, 3.5));  // cl2 = Excepci�n: el sample a clasificar debe incluir 4 datos num�ricos
	/*
	 * DataSet ds1 = new DataSet("colores.xls");  // default class column = 1

		Classifier knn = new KnnClassifier(4); // K = 5, default: Euclidean distance
		knn.setDataset(ds1);
		
		knn.setDistance(KnnClassifier.EUCLIDEAN);  // MANHATTAN, MINKOWSKI, CHEBYSHEV, ...
		
		Sample s1 = new Sample (240, 30, 250);
		
		System.out.println(knn.classify(s1));
		
		knn.setDistance(KnnClassifier.MANHATTAN);
		
		System.out.println(knn.classify(s1));
		
		knn.setDistance(KnnClassifier.CHEBYSHEV);
		
		System.out.println(knn.classify(s1));
		
		//5.9, 3, 5.1, 1.8, virginica

		DataSet ds2 = new DataSet("iris.xls");  // default class column = 1
	
		Classifier knn2 = new KnnClassifier(7); // K = 5, default: Euclidean distance
		knn2.setDataset(ds2);
		
		knn2.setDistance(KnnClassifier.EUCLIDEAN);  // MANHATTAN, MINKOWSKI, CHEBYSHEV, ...
		
		Sample s2 = new Sample (5.9, 3, 5.1, 1.8);
		
		System.out.println(knn2.classify(s2));
		
	}
}*/
		
		
	}
}