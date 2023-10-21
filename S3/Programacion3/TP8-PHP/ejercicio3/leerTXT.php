<?php
	
    $arrayTexto = array();
    $fh = fopen("texto.txt", 'r') or die("Se produjo un error al abrir el archivo");
	$texto = fgets($fh);
	fclose($fh);
	
    // Imprimimos el texto
    echo('<p>' . $texto . '</p>');

    for ($i=0; $i < strlen($texto); $i++) { 
        array_push($arrayTexto, $texto[$i]);
    }

    echo('<p>');
    for ($i=0; $i < count($arrayTexto); $i++) { 
        if ($arrayTexto[$i] == "-") {
            echo(' ');
        } else {
            echo($arrayTexto[$i]);
        }
    }
    echo('</p>');
?>

