<?php 

    include('connection.php');
    $conn = getConnection();

    $id = $_POST['id'];
    $titulo = $_POST['titulo'];
    $resumen = $_POST['resumen'];
    $imagen = $_POST['imagen'];
    $html = $_POST['html'];
    $publicada = $_POST['publicada'];
    $fecha = $_POST['fecha'];

    $sqlQuery = "UPDATE noticia SET titulo='$titulo', resumen='$resumen', imagen='$imagen', html='$html', publicada='$publicada', fecha='$fecha' WHERE id='$id'";
    $results = mysqli_query($conn, $sqlQuery);

    if ($results) {
        Header("Location: index.php");
    } else {
        echo('Error al guardar los datos en la base de datos.');
    }

?>