package com.rt.spark.mllib
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.mllib.linalg.{Vector, Vectors}
import org.apache.spark.mllib.clustering.KMeans


object TestKmeans {
	def main(args: Array[String]) : Unit = {
			println("Inside TestKmeans main : >> 1")

			val conf = new SparkConf().setAppName("TestKmeans")
			val sc = new SparkContext(conf)

			val inputData = args(0)
			val data = sc.textFile(inputData).map {line => Vectors.dense(line.split(',').map(_.toDouble))}.cache()

			val clusters = KMeans.train(data, 4 , 20)
			val cost = clusters.computeCost(data)
			val cc = clusters.clusterCenters
			//val pr = clusters.predict(data)

			println("Cluster Centers : " +cc)
			println("WSSE - Within Sum of Sqared Errors : " + cost)
			//println("Predict : "+pr.)
			//println("Predict : "+pr)
			
			// Print out a list of the clusters and each point of the clusters
			val groupedClusters = data.groupBy{rdd => clusters.predict(rdd)}.collect()
			groupedClusters.foreach { println }
			
	}		
	
}