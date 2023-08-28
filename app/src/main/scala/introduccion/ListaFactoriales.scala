package introduccion


class ListaFactoriales {
    def objListaFactoriales(n : Int): List[BigInt] = {
        var listaFactoriales : List[BigInt] = List()
        val objFactorial: Factorial = new Factorial()
        //Complete el código
        for (i <- 0 to n) {
            listaFactoriales = listaFactoriales :+ objFactorial.calculateFactorial(i)
        }
        return listaFactoriales
    }
}
