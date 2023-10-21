<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
    <style>
        table{
            border-collapse: collapse;
            width: 50vw;
        }
        table *{
            border: solid 1px black;
        }
    </style>
</head>
<body>
    <?php 
        $valor1 = $_POST['valor1'];
        $valor2 = $_POST['valor2'];

        if ($valor1 == $valor2) {
            echo('<p>Valor 1 = ' . $valor1 . '</p>');
            echo('<p>Valor 2 = ' . $valor2 . '</p>');
            echo('<table>');
            for ($i=0; $i < $valor1 ; $i++) { 
                echo('<tr>');
                for ($j=0; $j < $valor2; $j++) { 
                    if ($i+$j == $valor1-1 ) {
                        echo('<td style="background:black;color:white">1</td>');
                    } else {
                        echo('<td>0</td>');
                    }
                }
                echo('</tr>');
            }
            echo('</table');
        } else {
            echo('Los valores ingresados no son iguales!');
        }

    ?>
</body>
</html>