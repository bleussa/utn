<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora de Salario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container mt-5">
        <h1>Datos cargados</h1>
        <?php
            $legajo = $_POST['legajo'];
            $nombre = $_POST['nombre'];
            $sueldoBasico = $_POST['sueldoBasico'];
            $antiguedad = $_POST['antiguedad'];
            $nivelEducativo = $_POST['nivelEducativo'];

            echo('<p> Legajo: ' . $legajo . '</p>');
            echo('<p> Nombre: ' . $nombre . '</p>');
            echo('<p> Sueldo: ' . $sueldoBasico . '</p>');
            echo('<p> Antiguedad: ' . $antiguedad . '</p>');
            echo('<p> Nivel Educativo: ' . $nivelEducativo . '</p>');

            $nivelEducativo = intval($nivelEducativo);
            $antiguedad = intval($antiguedad);
            
            if ($nivelEducativo == 2) {
                $sueldoBasico = $sueldoBasico * 1.2;
            } elseif ($nivelEducativo == 3) {
                $sueldoBasico = $sueldoBasico * 1.3;
            } elseif ($nivelEducativo == 4) {
                $sueldoBasico = $sueldoBasico * 1.4;
            }

            for ($i=0; $i < $antiguedad; $i++) { 
                $sueldoBasico = $sueldoBasico * 1.02;
            }

            echo('<p><b> Sueldo Final: ' . intval($sueldoBasico) . '</b></p>');
        ?>
    </div>
</body>
</html>