<!DOCTYPE html>
<html>
<head>
    <title>${titulo}</title>
</head>
<body>
    <h1>Procesando Formulario</h1>
    <table>
        <tbody>
        <tr><td>Matricula</td><td>${estudiante.matricula}</td></tr>
        <tr><td>Nombre</td><td>${estudiante.nombre}</td></tr>
        <tr><td>Apellido</td><td>${estudiante.apellido}</td></tr>
        <tr><td>Telefono</td><td>${estudiante.telefono}</td></tr>
        </tbody>
    </table>
<button name="Editar" type="submit">Editar</button>
<button name="Borrar" type="submit">Borrar</button>
</body>
</html>