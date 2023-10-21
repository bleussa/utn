<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Panel Administrador de Noticias</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>

    <?php
        include('connection.php');
        $conn = getConnection();

        $sqlQuery = 'SELECT * FROM noticia';
        $results = mysqli_query($conn, $sqlQuery);

    ?>
    
    <div class="container">
        <div class="line">
            <h1>Panel Administrador de Noticias</h1>
            <a href="agregarNoticia.php">Agregar noticia</a>
        </div>

        <div class="info-container">
            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Imagen</th>
                        <th>Titulo</th>
                        <th>Resumen</th>
                        <!-- 
                            
                            <th>HTML</th>
                        -->
                        <th>Publicada</th>
                        <th>Fecha de Publicación</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <?php while ($row = mysqli_fetch_array($results)): ?>
                    <?php 
                        if ($row['publicada'] == 1) {
                            $publicadaString = 'Si';
                        } else {
                            $publicadaString = 'No';
                        }
                    ?>
                    
                        <tr>
                            <td style="width: 3%"><?= $row['id'] ?></td>
                            <td style="width: 7%"><?= $row['imagen'] ?></td>
                            <td class="txt"><?= $row['titulo'] ?></td>
                            <td class="txt"><?= $row['resumen'] ?></td>
                            <!-- 
                                <td><?= $row['html'] ?></td>
                            -->
                            <td><?= $publicadaString ?></td>
                            <td style="width: 15%"><?= $row['fecha'] ?></td>
                            <td style="width: 15%"><a href="modificarNoticia.php?id=<?= $row['id'] ?>">Modificar</a> | <a href="delete.php?id=<?= $row['id'] ?>">Eliminar</a></td>
                        </tr>

                    <?php endwhile; ?>
                </tbody>
            </table>
        </div>
    </div>

    

</body>
</html>