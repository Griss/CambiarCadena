<html>
<head></head>
<body>

	<h3>TRANSFORMAR CADENAS</h3>
	<BR>
	<g:form action="datos" controller="Cadena">

		<label for="cadena">
			<g:message code="label" default="Cadena Original:    " />
		</label>
	
		<g:textField value="${cadenaUno}" name="cadena"/>

		<g:submitButton name="convertir" value="Enviar datos"/>
		<br><br>
		<label  for="tituloCadenaCambiada">
			<g:message code="label" default="Cadena Transformada:   " />
		<label>
		<label  for="cadenaCambiada">
			<g:message code="label" default="${cadena}" />
		<label>
	</g:form>
</body>
</html>
