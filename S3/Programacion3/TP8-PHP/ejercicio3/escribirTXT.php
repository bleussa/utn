<?php

$texto = 'Ejemplo-de-escritura-de-un-archivo-de-php';
$fh = fopen("texto.txt", 'w') or die("Se produjo un error al crear el archivo texto.txt");
fwrite($fh, $texto) or die("No se pudo escribir en el archivo texto.txt");
fclose($fh);

echo "Se escribio el archivo texto.txt!";

?>
