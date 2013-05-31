package testcadena

class CadenaService {

    def serviceCadena(s) {
		println "PARAMETRO " + s
		//cadena = " MUNDO"
		//println "FINAL " + cadena 
		//cadena
		s= s.toLowerCase()
		String x;
		for (x = "x"; s.indexOf("o") >= 0; x = x + "x") {
		   s = s.substring(0, s.indexOf("o")) + x + s.substring(s.indexOf("o") + 1);
		}
		
		s
    }
}
