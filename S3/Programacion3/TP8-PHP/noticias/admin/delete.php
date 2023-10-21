<?php 

    include('connection.php');
    $conn = getConnection();
    $id = $_GET['id'];

    $sqlQuery = "DELETE FROM noticia WHERE id='$id'";
    $results = mysqli_query($conn, $sqlQuery);

    if ($results) {
        Header("Location: index.php");
    } else {
        echo('Error al guardar los datos en la base de datos.');
    }

?>