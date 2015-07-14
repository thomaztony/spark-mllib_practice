package com.rt.spark.mllib
import org.apache.spark.mllib.linalg.{Vector, Vectors}
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.linalg.{Matrices, Matrix}


object TestVectors {
  def main(args: Array[String]) : Unit = {
    println("Begin >> 1")
    
    //creating dense vector
    val dv: Vector = Vectors.dense(1.0,0.0,3.0)
    
    //creating sparse vector
    val sv1: Vector = Vectors.sparse(3, Array(0,2), Array(1.0, 3.0))
    val sv2: Vector = Vectors.sparse(3, Seq((0,1.0), (2,3.0)))
    
    println ("Printing dense vector : "+dv)
    println ("Printing sparse vector sv1 : "+sv1)
    println ("Printing sparse vector sv2 : "+sv2)
    
    //creating a labeled point with a positive label and a dense feature vector
    val pos = LabeledPoint(1.0, Vectors.dense(1.0,0.0,3.0))
    println ("Printing a positive Labeled Point : "+pos)
    
    //creating a labeled point with a negative label and a sparse feature vector
    val neg = LabeledPoint(0.0, Vectors.sparse(3, Array(0,2), Array(1.0, 3.0)))
    println ("Printing a negative Labeled Point : "+neg)    
  }

}