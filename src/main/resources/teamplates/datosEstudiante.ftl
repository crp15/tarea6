<!DOCTYPE html>
<html>
<head>
    <title>Información Estudiante ${estudiante.nombre}</title>
 
</head>
<body>
<h1>Matrícula ${estudiante.matricula?string["0"]} -  ${estudiante.nombre}</h1>
<h2>Su apellido es ${estudiante.apellido}</h2>
<h2>Y su telefono es ${estudiante.telefono}</h2>
</body>
</html>