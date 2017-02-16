<!DOCTYPE html>
<html>
<head>
<title>${titulo}</title>
</head>
<body>
    <h1>Ejemplo de formulario</h1>
    <form action="/procesarFormulario/" method="post">
         Matricula: <input name="matricula" type="number"/><br/>
         Nombre: <input name="nombre" type="text"/><br/>
         Apellido: <input name="apellido" type="text"/><br/>
        Telefono: <input name="telefono" type="text"/><br/>
        <button name="Enviar" type="submit">Enviar</button>
    </form>
</body>
</html>