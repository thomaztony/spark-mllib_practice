package com.example.spark.mllib

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.mllib.feature.Word2Vec
import org.apache.spark.mllib.feature.Word2VecModel

object TestTextClustering {
	def main(args: Array[String]){
	  
	  		val conf = new SparkConf().setAppName("TestTextClustering")
			val sc = new SparkContext(conf)
		val input = sc.textFile("text8").map(line => line.split(" ").toSeq)

				val word2vec = new Word2Vec()

		val model = word2vec.fit(input)

		val synonyms = model.findSynonyms("china", 40)
		

		for((synonym, cosineSimilarity) <- synonyms) {
			println(s"$synonym $cosineSimilarity")
			println(s"$synonym $cosineSimilarity")
		}

		// Save and load model
		//model.save(sc, "myModelPath")
	  		
	//	val sameModel = Word2VecModel.load(sc, "myModelPath")
	}
}