<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
    <?php 
        $texto = $_POST['texto'];
        $arrayTexto = array();
        
        for ($i=0; $i < strlen($texto); $i++) { 
            array_push($arrayTexto, $texto[$i]);
        }

        for ($i=0; $i < count($arrayTexto); $i++) { 
            echo('<p>' . $arrayTexto[$i] . '</p>');
        }
    ?>
</body>
</html>