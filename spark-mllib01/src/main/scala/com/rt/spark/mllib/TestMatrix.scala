package com.example.spark.mllib

import org.apache.spark.mllib.linalg.Matrices
import org.apache.spark.mllib.linalg.Matrix
import org.apache.spark.mllib.linalg.Vector

object TestMatrix {
	def main(args: Array[String]) : Unit = {
	  	//creating a dense matrix of size 3x2
		val dm: Matrix = Matrices.dense(3, 2, Array(1.0,3.0,5.0,2.0,4.0,6.0))
		println("Printing 3x2 matrix :")
		println (dm) 
			
		/*val a = sc.parallelize(List(1,2,3,3,5,6,7))
		
		val rows: RDD[Vector] =  
		val mat: */
		
	}
}