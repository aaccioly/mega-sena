package com.sevenrtc.megasena

import util.Random
import collection.immutable.TreeSet
import annotation.tailrec

/**
 *
 * @author Anthony Accioly
 */
object Surpresinha {

  private val RANDOM = new Random

  def main(args: Array[String]) {
    for (i <- 1 to 10) {
      printf("%-2d - %s\n", i, geraAposta.mkString("[", ", ", "]"))
    }
  }

  private def geraAposta = {

    def getNumber = {
      1 + RANDOM.nextInt(60)
    }

    @tailrec def geraApostaRecursiva(aposta: Set[Int]): Set[Int] = {
      if (aposta.size < 6)
        geraApostaRecursiva(aposta + getNumber)
      else
        aposta
    }

    geraApostaRecursiva(TreeSet.empty[Int]);
  }

}