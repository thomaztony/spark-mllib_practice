package com.rt.spark.mllib

import org.apache.spark.mllib.linalg.{Matrix, Matrices}



object TestMatrix {
	def main(args: Array[String]): Unit = {
	  /*
	   * Local matrix 
	   * integer typed row and column indices
	   * double typed values
	   * stored on a single machine.
	   * 
	   * MLlib supports dense matrices whose entry values are stored in a single
	   * double array in column major format
	   */
	    //creating a dense matrix of size 3x2
		val dm: Matrix = Matrices.dense(3, 2, Array(1.0,3.0,5.0,2.0,4.0,6.0))
		println("Printing 3x2 matrix :")
		println (dm)	
		
		/*
		 * Distributed matrix
		 * long typed row and column indices
		 * double typed values
		 * stored in one or more RDD's
		 * 3 types are implemented
		 * Row matrix
		 * Indexed row matrix
		 * Coordinate matrix
		 */
	}
}