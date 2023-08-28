package introduccion

import javax.naming.OperationNotSupportedException
import scala.annotation.meta.param

class EjercicioListas {
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    if (n < 0) {
      throw new IllegalArgumentException("El valor de n debe ser mayor o igual a 0")
    }
    var listaRepetida: List[List[Int]] = List()
    for (i <- lista) {
      listaRepetida = listaRepetida :+ List.fill(n)(i)
    }
    return listaRepetida
  }
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]): List[Int] = {
    var criterio: String = criterioIn.toLowerCase()
    var listaFiltrada: List[Int] = List()
    criterio match {
      case "mayor" => listaFiltrada = lista.filter(_ > n)
      case "menor" => listaFiltrada = lista.filter(_ < n)
      case "mayoroigual" => listaFiltrada = lista.filter(_ >= n)
      case "igual" => listaFiltrada = lista.filter(_ == n)
      case "diferente" => listaFiltrada = lista.filter(_ != n)
      case "menoroigual" => listaFiltrada = lista.filter(_ <= n)
      case _ => throw new IllegalArgumentException("Criterio no válido")
    }
    return listaFiltrada
  }

}
