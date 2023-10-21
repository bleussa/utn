<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Panel Administrador de Noticias</title>
    <link rel="stylesheet" href="main.css">
    <script src="https://cdn.tiny.cloud/1/cwn24p3wqoy86a8bogrwu14s78rzq985jjk61aob6h2p68ut/tinymce/6/tinymce.min.js" referrerpolicy="origin"></script>
</head>
<body>
    
    <?php
        include('connection.php');
        $conn = getConnection();
        $id = $_GET['id'];

        $sqlQuery = "SELECT * FROM noticia WHERE id='$id'";
        $results = mysqli_query($conn, $sqlQuery);
        $row = mysqli_fetch_array($results);

    ?>

    <div class="container">
        <div class="line">
            <h1>Modificar noticia #<?php echo($_GET['id']) ?></h1>
            <a href="index.php">Volver atrás</a>
        </div>

        <div class="info-container">
            <form action="update.php" method="POST">
                <div class="row">
                    <label for="id">ID</label>
                    <input type="text" name="id" id="id" value="<?= $row['id'] ?>" readonly>
                </div>
                <div class="row">
                    <label for="titulo">Titulo</label>
                    <input type="text" name="titulo" id="titulo" value="<?= $row['titulo'] ?>" require>
                </div>
                <div class="row">
                    <label for="resumen">Resumen</label>
                    <textarea type="text" name="resumen" id="resumen"require><?= $row['resumen'] ?></textarea>
                </div>
                <div class="row">
                    <label for="imagen">Imagen</label>
                    <textarea type="text" name="imagen" id="file-picker" require><?= $row['imagen'] ?></textarea>
                </div>
                <div class="row">
                    <label for="html">HTML</label>
                    <textarea name="html" id="html"><?= $row['html'] ?></textarea require>
                </div>
                <div class="row">
                    <label for="publicada">Publicada</label>
                    <select id="publicada" name="publicada">
                        <option value="1">Habilitada</option>
                        <option value="0">Deshabilitada</option>
                    </select>
                </div>
                <div class="row">
                    <label for="fecha">Fecha de Publicación</label>
                    <input type="text" name="fecha" id="fecha" value="<?= $row['fecha'] ?>" placeholder="AAAA-MM-DD" require>
                </div>
                <div class="row">
                    <button type="submit" class="btnGuardar">Guardar noticia</button>
                </div>
            </form>
        </div>
    </div>

    <script>
        tinymce.init({
            selector: 'textarea#file-picker',
            plugins: 'image',
            toolbar: 'undo redo | image',
        });
        tinymce.init({
            selector: 'textarea',
            plugins: 'tinycomments mentions anchor autolink charmap codesample emoticons image link lists media searchreplace table visualblocks wordcount checklist mediaembed casechange export formatpainter pageembed permanentpen footnotes advtemplate advtable advcode editimage tableofcontents mergetags powerpaste tinymcespellchecker autocorrect a11ychecker typography inlinecss',
            toolbar: 'undo redo | blocks | bold italic underline strikethrough | link image table | align lineheight | tinycomments | checklist numlist bullist indent outdent | emoticons charmap | removeformat',
            tinycomments_mode: 'embedded',
            tinycomments_author: 'Author name',
        });
    
  </script>

</body>
</html>