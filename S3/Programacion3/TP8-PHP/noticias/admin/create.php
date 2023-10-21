<?php 

    include('connection.php');
    $conn = getConnection();

    $id = null;
    $titulo = $_POST['titulo'];
    $resumen = $_POST['resumen'];
    $imagen = $_POST['imagen'];
    $html = $_POST['html'];
    $publicada = $_POST['publicada'];
    $fecha = $_POST['fecha'];

    $sqlQuery = "INSERT INTO noticia VALUES ('$id', '$titulo', '$resumen', '$imagen', '$html', '$publicada', '$fecha')";
    $results = mysqli_query($conn, $sqlQuery);

    if ($results) {
        Header("Location: index.php");
    } else {
        echo('Error al guardar los datos en la base de datos.');
    }

?>