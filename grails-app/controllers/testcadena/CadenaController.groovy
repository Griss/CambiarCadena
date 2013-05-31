package testcadena

class CadenaController {
	def cadenaService

	def datos(){
		def retornoService = cadenaService.serviceCadena(params.cadena)
		params.cadena + " MUNDO"
		render view: '/cadena/vista', model:[cadena:retornoService, cadenaUno:params.cadena]
		
	}

    def index() { 
		render(view:'vista')
	}
}
